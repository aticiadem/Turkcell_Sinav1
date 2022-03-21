package com.turkcell.sinav1.util

import com.turkcell.sinav1.model.ProductItem

interface ProductItemClickListener {

    fun onClickAddToBasketClickListener(item: ProductItem)

    fun onClickGoToItemDetailScreen(item: ProductItem)

}