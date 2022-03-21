package com.turkcell.sinav1.presentation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.turkcell.sinav1.R
import com.turkcell.sinav1.databinding.ProductItemsRowBinding
import com.turkcell.sinav1.model.ProductItem
import com.turkcell.sinav1.util.ProductItemClickListener

class ProductItemAdapter(
    private val context: Context,
    private val clickListener: ProductItemClickListener,
) : RecyclerView.Adapter<ProductItemAdapter.ProductItemViewHolder>() {

    var productItemList = listOf<ProductItem>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    class ProductItemViewHolder(private val binding: ProductItemsRowBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(context: Context, item: ProductItem, clickToAdd: () -> Unit) {
            binding.apply {
                imageView.setImageResource(item.productImage)
                textViewBrand.text = item.productBrand
                textViewName.text = item.productName
                textViewPrice.text = context.getString(R.string.turkish_lira_float, item.productPrice)

                imageViewAdd.setOnClickListener {
                    clickToAdd()
                }
            }
        }

        companion object {
            fun from(parent: ViewGroup): ProductItemViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ProductItemsRowBinding.inflate(layoutInflater, parent, false)
                return ProductItemViewHolder(binding)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductItemViewHolder {
        return ProductItemViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ProductItemViewHolder, position: Int) {
        val item = productItemList[position]
        holder.bind(context, item) {
            clickListener.onClickAddToBasketClickListener(item)
        }

        holder.itemView.setOnClickListener {
            clickListener.onClickGoToItemDetailScreen(item)
        }
    }

    override fun getItemCount(): Int = productItemList.size

}