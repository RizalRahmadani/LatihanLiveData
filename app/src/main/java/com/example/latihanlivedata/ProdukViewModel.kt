package com.example.latihanlivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProdukViewModel : ViewModel() {

    var listProduct = arrayListOf(
        DataClassProduct(R.drawable.handphone, "HandPhone", "$50", "Sedang mencari HP murah? Temukan di iPrice Indonesia! Tak dapat dipungkiri, zaman sekarang semua orang membutuhkan handphone atau HP untuk berbagai keperluan. Tidak sekadar untuk komunikasi saja, handphone bahkan sudah berkembang sebagai alat hiburan, alat kerja, bahkan mampu membantu memantau kesehatan kamu.\n" +
                "Yuk, temukan harga HP murah ya sesuai dengan budget kamu di iPrice Indonesia. Simak juga informasi selengkapnya tentang HP terlebih dulu berikut!"),
        DataClassProduct(R.drawable.kapal, "Kapal", "$2000", "Kapal laut dengan bahan super kuat menahan terjangan ombak"),
        DataClassProduct(R.drawable.kulkas, "Kulkas", "$100", "Kulkas yang dapat mendingikan seseorang dalam waktu 5 deti"),
        DataClassProduct(R.drawable.mesin_cuci, "Mesin Cuci", "$200", "Mesin cuci adalah sebuah mesin yang dirancang untuk membersihkan pakaian dan tekstil rumah tangga lainnya seperti handuk dan sprai. Biasanya terbatas ke mesin yang menggunakan air untuk mencuci, dan tidak seperti cuci kering yang menggunakan cairan pembersih alternatif dan biasanya dilakukan oleh bisnis khusus."),
        DataClassProduct(R.drawable.mobil, "Mobil", "$1000", "Mobil dengan tenaga kuda dengan kecepatan super kilat"),
        DataClassProduct(R.drawable.motor, "Motor", "$500", "Motor warisan dari Valentino Rossi"),
        DataClassProduct(R.drawable.pesawat, "Pesawat", "$50000", "Pesawat yang bisa terbang tembus langit ke tujuh"),
        DataClassProduct(R.drawable.sepeda, "Sepeda", "$200", "Sepeda Santai"),
        DataClassProduct(R.drawable.tank, "Tank", "$234000", "Tank yang dapat menghancurkan negara Konoha"),
        DataClassProduct(R.drawable.televisi, "Televisi", "$90", "Televisi dengan layar yang super kuat apabila tidak di banting"),


        )

    val produk : MutableLiveData<List<DataClassProduct>> = MutableLiveData()

    fun getProduk(){
        produk.value = listProduct
    }
}