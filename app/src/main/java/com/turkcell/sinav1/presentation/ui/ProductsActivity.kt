package com.turkcell.sinav1.presentation.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.turkcell.sinav1.R
import com.turkcell.sinav1.databinding.ActivityProductsBinding
import com.turkcell.sinav1.databinding.LayoutBasketBinding
import com.turkcell.sinav1.model.*
import com.turkcell.sinav1.presentation.adapter.ProductItemAdapter
import com.turkcell.sinav1.presentation.adapter.ProductTitleAdapter
import com.turkcell.sinav1.util.Constants.DID_LOG_IN
import com.turkcell.sinav1.util.Constants.INTENT_ITEM_INFO
import com.turkcell.sinav1.util.Constants.TOTAL_PRICE
import com.turkcell.sinav1.util.ProductItemClickListener
import com.turkcell.sinav1.util.ProductTitleClickListener
import com.turkcell.sinav1.util.SpacingItemDecorator

class ProductsActivity : AppCompatActivity(), ProductTitleClickListener, ProductItemClickListener {

    private lateinit var binding: ActivityProductsBinding
    private lateinit var basketBinding: LayoutBasketBinding
    private lateinit var productTitleAdapter: ProductTitleAdapter
    private lateinit var productItemsAdapter: ProductItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initBinding()
        setContentView(binding.root)

        initClickListener()
        initRecyclerViews()

        if (!DID_LOG_IN) {
            binding.imageViewBasket.root.visibility = View.GONE
        }
    }

    private fun initBinding() {
        binding = ActivityProductsBinding.inflate(layoutInflater)
        basketBinding = LayoutBasketBinding.inflate(layoutInflater)

        setSupportActionBar(binding.toolbar)
    }

    private fun initClickListener() {
        binding.imageViewBackNavigation.setOnClickListener {
            finish()
        }
    }

    override fun onResume() {
        super.onResume()
        binding.imageViewBasket.textViewPrice.text = getString(R.string.turkish_lira, TOTAL_PRICE)
    }

    private fun initRecyclerViews() {
        productTitleAdapter = ProductTitleAdapter(this)
        productTitleAdapter.productsTitles = ProductTitles
        binding.recyclerViewTitles.adapter = productTitleAdapter

        productItemsAdapter = ProductItemAdapter(this, this)
        productItemsAdapter.productItemList = Waters
        binding.recyclerViewItems.adapter = productItemsAdapter
        val x = (resources.displayMetrics.density * 8).toInt()
        binding.recyclerViewItems.addItemDecoration(SpacingItemDecorator(x))
    }

    override fun onProductTitleClickListener(product: ProductTitle) {
        updateTitleBackground(product)
        updateListOfItem(product.id)
    }

    override fun onClickAddToBasketClickListener(item: ProductItem) {
        updateBasketItemsCount(item.productPrice)
    }

    private fun updateBasketItemsCount(count: Float) {
        TOTAL_PRICE += count
        binding.imageViewBasket.textViewPrice.text = getString(R.string.turkish_lira, TOTAL_PRICE)
    }

    override fun onClickGoToItemDetailScreen(item: ProductItem) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(INTENT_ITEM_INFO, item)
        startActivity(intent)
    }

    private fun updateTitleBackground(item: ProductTitle) {
        val newTitleList = arrayListOf<ProductTitle>()
        ProductTitles.forEach {
            it.clickState = it.id == item.id
            newTitleList.add(it)
        }
        productTitleAdapter.productsTitles = newTitleList
    }

    private fun updateListOfItem(clickedId: Int) {
        var newItemList = arrayListOf<ProductItem>()
        when (clickedId) {
            0 -> {
                newItemList = Waters
            }
            1 -> {
                newItemList = CarbonatedBeverage
            }
            2 -> {
                newItemList = MineralWater
            }
            3 -> {
                newItemList = Juice
            }
            4 -> {
                newItemList = Ayran
            }
        }
        productItemsAdapter.productItemList = newItemList
    }

}