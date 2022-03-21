package com.turkcell.sinav1.presentation.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.turkcell.sinav1.R
import com.turkcell.sinav1.databinding.ActivityProductsBinding
import com.turkcell.sinav1.databinding.LayoutBasketBinding
import com.turkcell.sinav1.model.ProductItem
import com.turkcell.sinav1.model.ProductTitle
import com.turkcell.sinav1.model.ProductTitles
import com.turkcell.sinav1.model.Waters
import com.turkcell.sinav1.presentation.adapter.ProductItemAdapter
import com.turkcell.sinav1.presentation.adapter.ProductTitleAdapter
import com.turkcell.sinav1.util.Constants.INTENT_USER_DID_LOG_IN
import com.turkcell.sinav1.util.ProductItemClickListener
import com.turkcell.sinav1.util.ProductTitleClickListener
import com.turkcell.sinav1.util.SpacingItemDecorator
import com.turkcell.sinav1.util.toast

class ProductsActivity : AppCompatActivity(), ProductTitleClickListener, ProductItemClickListener {

    private lateinit var binding: ActivityProductsBinding
    private lateinit var basketBinding: LayoutBasketBinding
    private lateinit var productTitleAdapter: ProductTitleAdapter
    private lateinit var productItemsAdapter: ProductItemAdapter
    private var totalCount = 0
    private var didLogIn: Boolean? = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initBinding()
        setContentView(binding.root)

        initClickListener()
        initRecyclerViews()

        didLogIn = intent.getBooleanExtra(INTENT_USER_DID_LOG_IN, false)

        didLogIn?.let {
            if (!it) {
                binding.imageViewBasket.root.visibility = View.GONE
            }
        }

        updateBasketItemsCount(null)
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

    private fun updateBasketItemsCount(count: Int?) {
        if (count != null) {
            totalCount += count
        }
        if (totalCount == 0) {
            basketBinding.textView.visibility = View.GONE
        } else {
            basketBinding.textView.visibility = View.VISIBLE
            basketBinding.textView.text = getString(R.string.turkish_lira, (totalCount + count!!))
        }
    }

    override fun onProductTitleClickListener(product: ProductTitle) {
        this.toast(product.name)
    }

    override fun onClickAddToBasketClickListener(item: ProductItem) {
        // no-op
    }

    override fun onClickGoToItemDetailScreen(item: ProductItem) {
        // no-op
    }

}