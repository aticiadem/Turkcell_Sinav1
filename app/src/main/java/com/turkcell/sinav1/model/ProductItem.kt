package com.turkcell.sinav1.model

import com.turkcell.sinav1.R

data class ProductItem(
    var productImage: Int,
    var productBrand: String,
    var productName: String,
    var productPrice: Float,
)

val water1 = ProductItem(
    R.drawable.erikli,
    "Erikli",
    "Erikli Su",
    15.96f
)

val water2 = ProductItem(
    R.drawable.erikli,
    "Erikli",
    "Erikli Su",
    15.96f
)

val water3 = ProductItem(
    R.drawable.erikli,
    "Erikli",
    "Erikli Su",
    15.96f
)

val water4 = ProductItem(
    R.drawable.erikli,
    "Erikli",
    "Erikli Su",
    15.96f
)

val water5 = ProductItem(
    R.drawable.erikli,
    "Erikli",
    "Erikli Su",
    15.96f
)

val Waters = listOf(water1, water2, water3, water4, water5)