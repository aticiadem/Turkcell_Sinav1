package com.turkcell.sinav1.presentation.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.turkcell.sinav1.R
import com.turkcell.sinav1.databinding.ActivityDetailBinding
import com.turkcell.sinav1.databinding.LayoutBasketBinding
import com.turkcell.sinav1.model.ProductItem
import com.turkcell.sinav1.util.Constants.DID_LOG_IN
import com.turkcell.sinav1.util.Constants.INTENT_ITEM_INFO
import com.turkcell.sinav1.util.Constants.TOTAL_PRICE

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private lateinit var bindingBasket: LayoutBasketBinding
    private lateinit var itemInfo: ProductItem

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        bindingBasket = LayoutBasketBinding.inflate(layoutInflater)
        setContentView(binding.root)

        itemInfo = intent.getSerializableExtra(INTENT_ITEM_INFO) as ProductItem

        initClickListener()
        initViewState()
        initView()
    }

    private fun initViewState() {
        if (!DID_LOG_IN) {
            binding.imageViewBasket.root.visibility = View.GONE
            binding.imageViewAdd.visibility = View.GONE
        }
    }

    private fun initView() {
        binding.apply {
            imageViewProduct.setImageResource(itemInfo.productImage)
            textViewName.text = itemInfo.productName
            textViewBrand.text = itemInfo.productBrand
            textViewItemPrice.text = getString(R.string.turkish_lira_float, itemInfo.productPrice)
            textViewDescription.text = itemInfo.productDescription
        }
        bindingBasket.textViewPrice.text =
            getString(R.string.turkish_lira_float, TOTAL_PRICE)
    }

    override fun onResume() {
        super.onResume()
        binding.imageViewBasket.textViewPrice.text = getString(R.string.turkish_lira, TOTAL_PRICE)
    }

    private fun initClickListener() {
        binding.imageViewBackNavigation.setOnClickListener {
            finish()
        }
        binding.imageViewAdd.setOnClickListener {
            updateBasket(itemInfo.productPrice)
        }
    }

    private fun updateBasket(count: Float) {
        TOTAL_PRICE += count
        binding.imageViewBasket.textViewPrice.text = getString(R.string.turkish_lira, TOTAL_PRICE)
    }

}