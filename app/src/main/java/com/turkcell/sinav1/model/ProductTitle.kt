package com.turkcell.sinav1.model

data class ProductTitle(
    val id: Int,
    val name: String,
    var clickState: Boolean = false,
)

val product1 = ProductTitle(
    0,
    "Su",
    true
)

val product2 = ProductTitle(
    0,
    "Gazli Icecek",
    false
)

val product3 = ProductTitle(
    0,
    "Maden Suyu",
    false
)

val product4 = ProductTitle(
    0,
    "Meyve Suyu",
    false
)

val product5 = ProductTitle(
    0,
    "Ayran",
    false
)

val ProductTitles = listOf(product1, product2, product3, product4, product5)