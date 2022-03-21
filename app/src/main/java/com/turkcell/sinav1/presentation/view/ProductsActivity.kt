package com.turkcell.sinav1.presentation.view

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.turkcell.sinav1.R
import com.turkcell.sinav1.databinding.ActivityProductsBinding
import com.turkcell.sinav1.databinding.LayoutBasketBinding
import com.turkcell.sinav1.model.ProductTitle
import com.turkcell.sinav1.model.ProductTitles
import com.turkcell.sinav1.presentation.adapter.ProductTitleAdapter
import com.turkcell.sinav1.util.ProductTitleClickListener
import com.turkcell.sinav1.util.Constants.INTENT_USER_DID_LOG_IN
import com.turkcell.sinav1.util.toast


class ProductsActivity : AppCompatActivity(), ProductTitleClickListener {

    private lateinit var binding: ActivityProductsBinding
    private lateinit var basketBinding: LayoutBasketBinding
    private lateinit var productTitleAdapter: ProductTitleAdapter
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

}