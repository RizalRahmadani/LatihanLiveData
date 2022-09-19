package com.example.latihanlivedata

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.latihanlivedata.databinding.ActivityDetailProdukBinding
import com.example.latihanlivedata.databinding.ListProductBinding

class ProductAdapter (var listProduct : ArrayList<DataClassProduct>, val eventKlik : MainActivity):RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    class ViewHolder(var binding: ListProductBinding) : RecyclerView.ViewHolder(binding.root){

        fun data(data : DataClassProduct, eventKlik : MainActivity){
            binding.product = data // name list product
            binding.eventKlikDetail = eventKlik
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = ListProductBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      holder.data(listProduct[position],eventKlik)
    }

    override fun getItemCount(): Int = listProduct.size


    fun setDataProduk(itemData : ArrayList<DataClassProduct>){
        this.listProduct = itemData
    }



    interface ItemClickListener{
        fun onItemClickListener(detail : DataClassProduct)
    }

}