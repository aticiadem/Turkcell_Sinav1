package com.turkcell.sinav1.model

import com.turkcell.sinav1.R
import java.io.Serializable

data class ProductItem(
    var productImage: Int,
    var productBrand: String,
    var productName: String,
    var productPrice: Float,
    var productDescription: String,
) : Serializable

val water1 = ProductItem(
    R.drawable.erikli,
    "Erikli",
    "Erikli Su",
    3.00f,
    "Su ve maden suyu sektörünün lider firması Sırmagrup, 1950'li yıllardan beri değişmeyen lezzet kalitesi ve zengin çeşitliliği ile, ulusal ve global alanda önde gelen markalardan biri olma özelliği taşıyor. Doğal kaynak sularını, farklı ihtiyaçlara cevap verebilmek amacıyla farklı boyutlarda ambalaj alternatifleriyle tüketicilerine sunan Sırma şişe cam su, bir sipariş uzağınızda."
)

val water2 = ProductItem(
    R.drawable.buzdagi,
    "Buzdağı",
    "Buzdağı Su",
    2.75f,
    "Su ve maden suyu sektörünün lider firması Sırmagrup, 1950'li yıllardan beri değişmeyen lezzet kalitesi ve zengin çeşitliliği ile, ulusal ve global alanda önde gelen markalardan biri olma özelliği taşıyor. Doğal kaynak sularını, farklı ihtiyaçlara cevap verebilmek amacıyla farklı boyutlarda ambalaj alternatifleriyle tüketicilerine sunan Sırma şişe cam su, bir sipariş uzağınızda."
)

val water3 = ProductItem(
    R.drawable.cenesuyu,
    "Çenesuyu",
    "Çenesuyu Su",
    3.0f,
    "Su ve maden suyu sektörünün lider firması Sırmagrup, 1950'li yıllardan beri değişmeyen lezzet kalitesi ve zengin çeşitliliği ile, ulusal ve global alanda önde gelen markalardan biri olma özelliği taşıyor. Doğal kaynak sularını, farklı ihtiyaçlara cevap verebilmek amacıyla farklı boyutlarda ambalaj alternatifleriyle tüketicilerine sunan Sırma şişe cam su, bir sipariş uzağınızda."
)

val water4 = ProductItem(
    R.drawable.damla,
    "Damla",
    "Damla Su",
    4.25f,
    "Su ve maden suyu sektörünün lider firması Sırmagrup, 1950'li yıllardan beri değişmeyen lezzet kalitesi ve zengin çeşitliliği ile, ulusal ve global alanda önde gelen markalardan biri olma özelliği taşıyor. Doğal kaynak sularını, farklı ihtiyaçlara cevap verebilmek amacıyla farklı boyutlarda ambalaj alternatifleriyle tüketicilerine sunan Sırma şişe cam su, bir sipariş uzağınızda."
)

val water5 = ProductItem(
    R.drawable.hamidiye,
    "Hamidiye",
    "Hamidiye Su",
    2.95f,
    "Su ve maden suyu sektörünün lider firması Sırmagrup, 1950'li yıllardan beri değişmeyen lezzet kalitesi ve zengin çeşitliliği ile, ulusal ve global alanda önde gelen markalardan biri olma özelliği taşıyor. Doğal kaynak sularını, farklı ihtiyaçlara cevap verebilmek amacıyla farklı boyutlarda ambalaj alternatifleriyle tüketicilerine sunan Sırma şişe cam su, bir sipariş uzağınızda."
)

val carbonatedBeverage1 = ProductItem(
    R.drawable.coca_cola,
    "Coca Cola",
    "Coca Cola 0,2L",
    12.25f,
    "Coca Cola Kutu M.P. 6x330 Ml Asitli içecekler sektörün tartışmasız lideri olan Coca-Cola kutu 330 Ml 6 adet olarak ambalajlanmış seçeneği ile kalabalık ailelerin vazgeçilmez tercihi! Her yemeğe mükemmel uyum sağlayan Coca Cola’yı, sebzeli bir yemek, balık, kırmızı et, beyaz et fark etmeksizin her yemek ile tüketebilirsiniz. İlk başta mide rahatlatıcı etkisi olduğu savunularak bir ilaç olarak üretimi yapılan Coca Cola, zamanla benzersiz tada ulaşarak bugün ki lezzetine kavuşmuştur. Günün her saati tüketilen Coca Cola’nın benzersiz tadına, uygun fiyat avantajıyla sahip olmak için hemen sepetinize ekleyin. İster soğuk ister ılık olarak tüketebileceğiniz Coca-Cola’nın soğuk olarak tüketilmesi tavsiye edilmektedir. Coca-Cola Kutu ambalajı ile çantanızda rahatlıkla taşıyabileceğiniz ister okulda, işte işyerinde; her yerde tüketilebilir. Bizim Toptan Marketlerde online olarak satışı sunulan Coca-Cola Kutu 330 ml’lik 6 adet olarak paketlenmiş ambalajıyla sofranızda yerini almayı bekliyor."
)

val carbonatedBeverage2 = ProductItem(
    R.drawable.fanta,
    "Fanta",
    "Fanta Portakal",
    8.25f,
    "Coca Cola Kutu M.P. 6x330 Ml Asitli içecekler sektörün tartışmasız lideri olan Coca-Cola kutu 330 Ml 6 adet olarak ambalajlanmış seçeneği ile kalabalık ailelerin vazgeçilmez tercihi! Her yemeğe mükemmel uyum sağlayan Coca Cola’yı, sebzeli bir yemek, balık, kırmızı et, beyaz et fark etmeksizin her yemek ile tüketebilirsiniz. İlk başta mide rahatlatıcı etkisi olduğu savunularak bir ilaç olarak üretimi yapılan Coca Cola, zamanla benzersiz tada ulaşarak bugün ki lezzetine kavuşmuştur. Günün her saati tüketilen Coca Cola’nın benzersiz tadına, uygun fiyat avantajıyla sahip olmak için hemen sepetinize ekleyin. İster soğuk ister ılık olarak tüketebileceğiniz Coca-Cola’nın soğuk olarak tüketilmesi tavsiye edilmektedir. Coca-Cola Kutu ambalajı ile çantanızda rahatlıkla taşıyabileceğiniz ister okulda, işte işyerinde; her yerde tüketilebilir. Bizim Toptan Marketlerde online olarak satışı sunulan Coca-Cola Kutu 330 ml’lik 6 adet olarak paketlenmiş ambalajıyla sofranızda yerini almayı bekliyor."
)

val carbonatedBeverage3 = ProductItem(
    R.drawable.fuse_tea,
    "Coca-Cola",
    "Fuse Tea",
    7.80f,
    "Coca Cola Kutu M.P. 6x330 Ml Asitli içecekler sektörün tartışmasız lideri olan Coca-Cola kutu 330 Ml 6 adet olarak ambalajlanmış seçeneği ile kalabalık ailelerin vazgeçilmez tercihi! Her yemeğe mükemmel uyum sağlayan Coca Cola’yı, sebzeli bir yemek, balık, kırmızı et, beyaz et fark etmeksizin her yemek ile tüketebilirsiniz. İlk başta mide rahatlatıcı etkisi olduğu savunularak bir ilaç olarak üretimi yapılan Coca Cola, zamanla benzersiz tada ulaşarak bugün ki lezzetine kavuşmuştur. Günün her saati tüketilen Coca Cola’nın benzersiz tadına, uygun fiyat avantajıyla sahip olmak için hemen sepetinize ekleyin. İster soğuk ister ılık olarak tüketebileceğiniz Coca-Cola’nın soğuk olarak tüketilmesi tavsiye edilmektedir. Coca-Cola Kutu ambalajı ile çantanızda rahatlıkla taşıyabileceğiniz ister okulda, işte işyerinde; her yerde tüketilebilir. Bizim Toptan Marketlerde online olarak satışı sunulan Coca-Cola Kutu 330 ml’lik 6 adet olarak paketlenmiş ambalajıyla sofranızda yerini almayı bekliyor."
)

val carbonatedBeverage4 = ProductItem(
    R.drawable.pepsi,
    "PepsiCo",
    "Pepsi",
    12.2f,
    "Coca Cola Kutu M.P. 6x330 Ml Asitli içecekler sektörün tartışmasız lideri olan Coca-Cola kutu 330 Ml 6 adet olarak ambalajlanmış seçeneği ile kalabalık ailelerin vazgeçilmez tercihi! Her yemeğe mükemmel uyum sağlayan Coca Cola’yı, sebzeli bir yemek, balık, kırmızı et, beyaz et fark etmeksizin her yemek ile tüketebilirsiniz. İlk başta mide rahatlatıcı etkisi olduğu savunularak bir ilaç olarak üretimi yapılan Coca Cola, zamanla benzersiz tada ulaşarak bugün ki lezzetine kavuşmuştur. Günün her saati tüketilen Coca Cola’nın benzersiz tadına, uygun fiyat avantajıyla sahip olmak için hemen sepetinize ekleyin. İster soğuk ister ılık olarak tüketebileceğiniz Coca-Cola’nın soğuk olarak tüketilmesi tavsiye edilmektedir. Coca-Cola Kutu ambalajı ile çantanızda rahatlıkla taşıyabileceğiniz ister okulda, işte işyerinde; her yerde tüketilebilir. Bizim Toptan Marketlerde online olarak satışı sunulan Coca-Cola Kutu 330 ml’lik 6 adet olarak paketlenmiş ambalajıyla sofranızda yerini almayı bekliyor."
)

val carbonatedBeverage5 = ProductItem(
    R.drawable.schweppes,
    "Schweppes",
    "Schweppes",
    12.6f,
    "Coca Cola Kutu M.P. 6x330 Ml Asitli içecekler sektörün tartışmasız lideri olan Coca-Cola kutu 330 Ml 6 adet olarak ambalajlanmış seçeneği ile kalabalık ailelerin vazgeçilmez tercihi! Her yemeğe mükemmel uyum sağlayan Coca Cola’yı, sebzeli bir yemek, balık, kırmızı et, beyaz et fark etmeksizin her yemek ile tüketebilirsiniz. İlk başta mide rahatlatıcı etkisi olduğu savunularak bir ilaç olarak üretimi yapılan Coca Cola, zamanla benzersiz tada ulaşarak bugün ki lezzetine kavuşmuştur. Günün her saati tüketilen Coca Cola’nın benzersiz tadına, uygun fiyat avantajıyla sahip olmak için hemen sepetinize ekleyin. İster soğuk ister ılık olarak tüketebileceğiniz Coca-Cola’nın soğuk olarak tüketilmesi tavsiye edilmektedir. Coca-Cola Kutu ambalajı ile çantanızda rahatlıkla taşıyabileceğiniz ister okulda, işte işyerinde; her yerde tüketilebilir. Bizim Toptan Marketlerde online olarak satışı sunulan Coca-Cola Kutu 330 ml’lik 6 adet olarak paketlenmiş ambalajıyla sofranızda yerini almayı bekliyor."
)

val carbonatedBeverage6 = ProductItem(
    R.drawable.sprite,
    "Coca-Cola",
    "Sprite",
    9.5f,
    "Coca Cola Kutu M.P. 6x330 Ml Asitli içecekler sektörün tartışmasız lideri olan Coca-Cola kutu 330 Ml 6 adet olarak ambalajlanmış seçeneği ile kalabalık ailelerin vazgeçilmez tercihi! Her yemeğe mükemmel uyum sağlayan Coca Cola’yı, sebzeli bir yemek, balık, kırmızı et, beyaz et fark etmeksizin her yemek ile tüketebilirsiniz. İlk başta mide rahatlatıcı etkisi olduğu savunularak bir ilaç olarak üretimi yapılan Coca Cola, zamanla benzersiz tada ulaşarak bugün ki lezzetine kavuşmuştur. Günün her saati tüketilen Coca Cola’nın benzersiz tadına, uygun fiyat avantajıyla sahip olmak için hemen sepetinize ekleyin. İster soğuk ister ılık olarak tüketebileceğiniz Coca-Cola’nın soğuk olarak tüketilmesi tavsiye edilmektedir. Coca-Cola Kutu ambalajı ile çantanızda rahatlıkla taşıyabileceğiniz ister okulda, işte işyerinde; her yerde tüketilebilir. Bizim Toptan Marketlerde online olarak satışı sunulan Coca-Cola Kutu 330 ml’lik 6 adet olarak paketlenmiş ambalajıyla sofranızda yerini almayı bekliyor."
)

val mineralWater1 = ProductItem(
    R.drawable.beypazari,
    "Beypazarı",
    "Beypazarı Maden Suyu",
    4.5f,
    "Mineralin sofranızdaki en saf hâli Kızılay doğal maden suyu; şimdi altılı paketiyle evlerinizde. Yüz senelik deneyim ve Türk Kızılayı’nın özeniyle şişelenen Kızılay doğal maden suları artık aynı özenle ve bir tıkla kapınıza geliyor. Tarafsız analizlerden de tam not alan Kızılay doğal maden suyu sağlık açısından oldukça faydalıdır."
)

val mineralWater2 = ProductItem(
    R.drawable.damla_mineral_water,
    "Damla",
    "Doğal Maden Suyu",
    3.9f,
    "Mineralin sofranızdaki en saf hâli Kızılay doğal maden suyu; şimdi altılı paketiyle evlerinizde. Yüz senelik deneyim ve Türk Kızılayı’nın özeniyle şişelenen Kızılay doğal maden suları artık aynı özenle ve bir tıkla kapınıza geliyor. Tarafsız analizlerden de tam not alan Kızılay doğal maden suyu sağlık açısından oldukça faydalıdır."
)

val mineralWater3 = ProductItem(
    R.drawable.kizilay,
    "Kızılay",
    "Karpuz-Çilek Maden Suyu",
    4.8f,
    "Mineralin sofranızdaki en saf hâli Kızılay doğal maden suyu; şimdi altılı paketiyle evlerinizde. Yüz senelik deneyim ve Türk Kızılayı’nın özeniyle şişelenen Kızılay doğal maden suları artık aynı özenle ve bir tıkla kapınıza geliyor. Tarafsız analizlerden de tam not alan Kızılay doğal maden suyu sağlık açısından oldukça faydalıdır."
)

val mineralWater4 = ProductItem(
    R.drawable.pinar_mineral_water,
    "Pınar",
    "Doğal Maden Suyu",
    3.5f,
    "Mineralin sofranızdaki en saf hâli Kızılay doğal maden suyu; şimdi altılı paketiyle evlerinizde. Yüz senelik deneyim ve Türk Kızılayı’nın özeniyle şişelenen Kızılay doğal maden suları artık aynı özenle ve bir tıkla kapınıza geliyor. Tarafsız analizlerden de tam not alan Kızılay doğal maden suyu sağlık açısından oldukça faydalıdır."
)

val juice1 = ProductItem(
    R.drawable.cappy,
    "Cappy",
    "Şeftali Nektarı",
    10.5f,
    "Göz sağlığını koruyan beta karotenler sayesinde kataraktı önler. Yaşla birlikte ortaya çıkan yıpranmış ve ölü deriyi yenileme özelliğine sahiptir. C vitamini açısından oldukça zengin, cildi yenilemenize yardım eden, cilt tedavisinde kullanılan güçlü bir antioksidan kaynağıdır."
)

val juice2 = ProductItem(
    R.drawable.cappy_pulpy,
    "Cappy",
    "Pulpy",
    12.5f,
    "Su, şeker veya fruktoz-glikoz şurubu, portakal pulpu (%5), portakal suyu konsantresi, asitliği düzenleyiciler (sitrik asit, sodyum sitrat), kıvam arttırıcılar (akasya gamı, ağaç reçinesinin gliserol esterleri), aroma vericiler, antioksidan (askorbik asit), renklendirici (beta-karoten)."
)

val juice3 = ProductItem(
    R.drawable.dimes,
    "Dimes",
    "Karışık Meyve Suyu",
    11.25f,
    "Su, şeker veya fruktoz-glikoz şurubu, portakal pulpu (%5), portakal suyu konsantresi, asitliği düzenleyiciler (sitrik asit, sodyum sitrat), kıvam arttırıcılar (akasya gamı, ağaç reçinesinin gliserol esterleri), aroma vericiler, antioksidan (askorbik asit), renklendirici (beta-karoten)."
)

val juice4 = ProductItem(
    R.drawable.icim,
    "İçim",
    "Karışık Meyve Suyu",
    10.25f,
    "Su, şeker veya fruktoz-glikoz şurubu, portakal pulpu (%5), portakal suyu konsantresi, asitliği düzenleyiciler (sitrik asit, sodyum sitrat), kıvam arttırıcılar (akasya gamı, ağaç reçinesinin gliserol esterleri), aroma vericiler, antioksidan (askorbik asit), renklendirici (beta-karoten)."
)

val juice5 = ProductItem(
    R.drawable.juss,
    "Juss",
    "Portakal Nektarı",
    8.65f,
    "Su, şeker veya fruktoz-glikoz şurubu, portakal pulpu (%5), portakal suyu konsantresi, asitliği düzenleyiciler (sitrik asit, sodyum sitrat), kıvam arttırıcılar (akasya gamı, ağaç reçinesinin gliserol esterleri), aroma vericiler, antioksidan (askorbik asit), renklendirici (beta-karoten)."
)

val ayran1 = ProductItem(
    R.drawable.sutas_ayran,
    "Sütaş",
    "Doğal Ayran",
    3.45f,
    "Sütaş Ayran 1 lt. doğal ve besleyicidir. Kültürümüzün ve sofraların geleneksel lezzeti olarak son derece ferahlatıcıdır. Ayran içeriğindeki süt proteinleri ve mayalar sayesinde daha kolay hazmedilebilir bir üründür ve çok küçük parçacıklar barındırır. Sütaş, bu küçük parçaların sıvı kısım içerisinde asılı kalması için hiçbir katkı maddesi kullanmaz. İşte bu nedenle, Sütaş Ayran keyfini yakalamak için içmeden önce çalkalamak gerekir."
)

val ayran2 = ProductItem(
    R.drawable.sutas_ayran_2l,
    "Sütaş",
    "2L Ayran",
    12.85f,
    "Sütaş Ayran 1 lt. doğal ve besleyicidir. Kültürümüzün ve sofraların geleneksel lezzeti olarak son derece ferahlatıcıdır. Ayran içeriğindeki süt proteinleri ve mayalar sayesinde daha kolay hazmedilebilir bir üründür ve çok küçük parçacıklar barındırır. Sütaş, bu küçük parçaların sıvı kısım içerisinde asılı kalması için hiçbir katkı maddesi kullanmaz. İşte bu nedenle, Sütaş Ayran keyfini yakalamak için içmeden önce çalkalamak gerekir."
)

val ayran3 = ProductItem(
    R.drawable.balkan,
    "Balkan",
    "170 ml Ayran",
    3.55f,
    "Sütaş Ayran 1 lt. doğal ve besleyicidir. Kültürümüzün ve sofraların geleneksel lezzeti olarak son derece ferahlatıcıdır. Ayran içeriğindeki süt proteinleri ve mayalar sayesinde daha kolay hazmedilebilir bir üründür ve çok küçük parçacıklar barındırır. Sütaş, bu küçük parçaların sıvı kısım içerisinde asılı kalması için hiçbir katkı maddesi kullanmaz. İşte bu nedenle, Sütaş Ayran keyfini yakalamak için içmeden önce çalkalamak gerekir."
)

val ayran4 = ProductItem(
    R.drawable.icim_ayran,
    "İçim",
    "Ayran",
    3.75f,
    "Sütaş Ayran 1 lt. doğal ve besleyicidir. Kültürümüzün ve sofraların geleneksel lezzeti olarak son derece ferahlatıcıdır. Ayran içeriğindeki süt proteinleri ve mayalar sayesinde daha kolay hazmedilebilir bir üründür ve çok küçük parçacıklar barındırır. Sütaş, bu küçük parçaların sıvı kısım içerisinde asılı kalması için hiçbir katkı maddesi kullanmaz. İşte bu nedenle, Sütaş Ayran keyfini yakalamak için içmeden önce çalkalamak gerekir."
)

val ayran5 = ProductItem(
    R.drawable.eker,
    "Eker",
    "200 ml Ayran",
    4.8f,
    "Sütaş Ayran 1 lt. doğal ve besleyicidir. Kültürümüzün ve sofraların geleneksel lezzeti olarak son derece ferahlatıcıdır. Ayran içeriğindeki süt proteinleri ve mayalar sayesinde daha kolay hazmedilebilir bir üründür ve çok küçük parçacıklar barındırır. Sütaş, bu küçük parçaların sıvı kısım içerisinde asılı kalması için hiçbir katkı maddesi kullanmaz. İşte bu nedenle, Sütaş Ayran keyfini yakalamak için içmeden önce çalkalamak gerekir."
)

val ayran6 = ProductItem(
    R.drawable.sakipaga,
    "Sakığağa",
    "Ayran",
    3.25f,
    "Sütaş Ayran 1 lt. doğal ve besleyicidir. Kültürümüzün ve sofraların geleneksel lezzeti olarak son derece ferahlatıcıdır. Ayran içeriğindeki süt proteinleri ve mayalar sayesinde daha kolay hazmedilebilir bir üründür ve çok küçük parçacıklar barındırır. Sütaş, bu küçük parçaların sıvı kısım içerisinde asılı kalması için hiçbir katkı maddesi kullanmaz. İşte bu nedenle, Sütaş Ayran keyfini yakalamak için içmeden önce çalkalamak gerekir."
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
    ayran5,
    ayran6
)