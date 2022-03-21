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
    3.00f
)

val water2 = ProductItem(
    R.drawable.buzdagi,
    "Buzdağı",
    "Buzdağı Su",
    2.75f
)

val water3 = ProductItem(
    R.drawable.cenesuyu,
    "Çenesuyu",
    "Çenesuyu Su",
    3.0f
)

val water4 = ProductItem(
    R.drawable.damla,
    "Damla",
    "Damla Su",
    4.25f
)

val water5 = ProductItem(
    R.drawable.hamidiye,
    "Hamidiye",
    "Hamidiye Su",
    2.95f
)

val carbonatedBeverage1 = ProductItem(
    R.drawable.coca_cola,
    "Coca Cola",
    "Coca Cola 0,2L",
    12.25f
)

val carbonatedBeverage2 = ProductItem(
    R.drawable.fanta,
    "Fanta",
    "Fanta Portakal",
    8.25f
)

val carbonatedBeverage3 = ProductItem(
    R.drawable.fuse_tea,
    "Coca-Cola",
    "Fuse Tea",
    7.80f
)

val carbonatedBeverage4 = ProductItem(
    R.drawable.pepsi,
    "PepsiCo",
    "Pepsi",
    12.2f
)

val carbonatedBeverage5 = ProductItem(
    R.drawable.schweppes,
    "Schweppes",
    "Schweppes",
    12.6f
)

val carbonatedBeverage6 = ProductItem(
    R.drawable.sprite,
    "Coca-Cola",
    "Sprite",
    9.5f
)

val mineralWater1 = ProductItem(
    R.drawable.beypazari,
    "Beypazarı",
    "Beypazarı Maden Suyu",
    4.5f
)

val mineralWater2 = ProductItem(
    R.drawable.damla_mineral_water,
    "Damla",
    "Doğal Maden Suyu",
    3.9f
)

val mineralWater3 = ProductItem(
    R.drawable.kizilay,
    "Kızılay",
    "Karpuz-Çilek Maden Suyu",
    4.8f
)

val mineralWater4 = ProductItem(
    R.drawable.pinar_mineral_water,
    "Pınar",
    "Doğal Maden Suyu",
    3.5f
)

val juice1 = ProductItem(
    R.drawable.cappy,
    "Cappy",
    "Şeftali Nektarı",
    10.5f
)

val juice2 = ProductItem(
    R.drawable.cappy_pulpy,
    "Cappy",
    "Pulpy",
    12.5f
)

val juice3 = ProductItem(
    R.drawable.dimes,
    "Dimes",
    "Karışık Meyve Suyu",
    11.25f
)

val juice4 = ProductItem(
    R.drawable.icim,
    "İçim",
    "Karışık Meyve Suyu",
    10.25f
)

val juice5 = ProductItem(
    R.drawable.juss,
    "Juss",
    "Portakal Nektarı",
    8.65f
)

val ayran1 = ProductItem(
    R.drawable.sutas_ayran,
    "Sütaş",
    "Doğal Ayran",
    3.45f
)

val ayran2 = ProductItem(
    R.drawable.sutas_ayran_2l,
    "Sütaş",
    "2L Ayran",
    12.85f
)

val ayran3 = ProductItem(
    R.drawable.balkan,
    "Balkan",
    "170 ml Ayran",
    3.55f
)

val ayran4= ProductItem(
    R.drawable.icim_ayran,
    "İçim",
    "Ayran",
    3.75f
)

val ayran5 = ProductItem(
    R.drawable.eker,
    "Eker",
    "200 ml Ayran",
    4.8f
)

val ayran6 = ProductItem(
    R.drawable.sakipaga,
    "Sakığağa",
    "Ayran",
    3.25f
)

val Waters = arrayListOf(
    water1,
    water2,
    water3,
    water4,
    water5
)

val CarbonatedBeverage = arrayListOf(
    carbonatedBeverage1,
    carbonatedBeverage2,
    carbonatedBeverage3,
    carbonatedBeverage4,
    carbonatedBeverage5,
    carbonatedBeverage6
)

val MineralWater = arrayListOf(
    mineralWater1,
    mineralWater2,
    mineralWater3,
    mineralWater4
)

val Juice = arrayListOf(
    juice1,
    juice2,
    juice3,
    juice4,
    juice5
)

val Ayran = arrayListOf(
    ayran1,
    ayran2,
    ayran3,
    ayran4,
    ayran6
)