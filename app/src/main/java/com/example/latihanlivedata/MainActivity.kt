package com.example.latihanlivedata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.latihanlivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), ProductAdapter.ItemClickListener {

    lateinit var binding : ActivityMainBinding
    lateinit var vmProduct: ProdukViewModel
    lateinit var adapter: ProductAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        vmProduct = ViewModelProvider(this,).get(ProdukViewModel::class.java)
        adapter = ProductAdapter(ArrayList(), this)

        vmProduct.getProduk()
        vmProduct.produk.observe(this,{adapter.setDataProduk(it as ArrayList<DataClassProduct>)})

        binding.rvProduk.adapter= adapter
        binding.rvProduk.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false)

    }

    override fun onItemClickListener(detail: DataClassProduct) {
        var pindah = Intent(this, DetailProdukActivity::class.java)
        pindah.putExtra("detail", detail)
        startActivity(pindah)
    }
}