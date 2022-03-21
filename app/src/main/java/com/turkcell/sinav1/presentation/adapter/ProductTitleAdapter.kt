package com.turkcell.sinav1.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.turkcell.sinav1.databinding.ProductsRowBinding
import com.turkcell.sinav1.model.ProductTitle
import com.turkcell.sinav1.util.ProductTitleClickListener

class ProductTitleAdapter(
    private val productTitleClickListener: ProductTitleClickListener,
) : RecyclerView.Adapter<ProductTitleAdapter.ProductViewHolder>() {

    var productsTitles = listOf<ProductTitle>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    class ProductViewHolder(private val binding: ProductsRowBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: ProductTitle) {
            binding.apply {
                textViewTitle.text = item.name
                // todo we will update here
                /*if (item.clickState) {
                    this.root.setBackgroundColor()
                } else {
                    this.root.setBackgroundColor()
                }*/
            }
        }

        companion object {
            fun from(parent: ViewGroup): ProductViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ProductsRowBinding.inflate(layoutInflater, parent, false)
                return ProductViewHolder(binding)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val item = productsTitles[position]
        holder.bind(item)

        holder.itemView.setOnClickListener { productTitleClickListener.onProductTitleClickListener(item) }
    }

    override fun getItemCount(): Int = productsTitles.size

}