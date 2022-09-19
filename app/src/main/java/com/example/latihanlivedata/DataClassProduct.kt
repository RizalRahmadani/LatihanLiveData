package com.example.latihanlivedata

import java.io.Serializable

data class DataClassProduct(var img : Int, var namaProduct: String, var harga: String, var deskripsi: String) : Serializable {
}