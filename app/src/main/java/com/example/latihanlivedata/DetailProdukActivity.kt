package com.example.latihanlivedata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_produk.*

class DetailProdukActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_produk)

        val ambilData = intent.getSerializableExtra("detail") as DataClassProduct
        imgDetail.setImageResource(ambilData.img)
        txtNamaProduct.text = ambilData.namaProduct
        txtHarga.text = ambilData.harga
        txtDeskripsi.text = ambilData.deskripsi

        btnBuy.setOnClickListener {
            var intent = Intent()
            intent.setAction(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, "Halo, saya tertarik dengan produk "+ambilData.namaProduct+" dengan harga "+ambilData.harga+", apakah masih available?")
            intent.setType("text/plain")
            intent.setPackage("com.whatsapp")
            startActivity(Intent.createChooser(intent,""))
            startActivity(intent)

        }

    }
}