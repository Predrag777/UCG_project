package com.example.ucg_project.presentation.Menu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.ucg_project.R
import com.example.ucg_project.data.MenuDataClass
import com.example.ucg_project.presentation.news.AdapterClass
import com.example.ucg_project.presentation.news.AdapterClass.ViewHolderClass
//
class MenuAdapterClass (private val datalist:ArrayList<MenuDataClass>):  RecyclerView.Adapter<AdapterClass.ViewHolderClass>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdapterClass.ViewHolderClass {
        val itemView=
            LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return com.example.ucg_project.presentation.news.AdapterClass.ViewHolderClass(itemView)
    }

    override fun onBindViewHolder(holder: AdapterClass.ViewHolderClass, position: Int) {
        val currentItem=datalist[position]
        holder.rvImage.setImageResource(currentItem.dataImage)
    }

    override fun getItemCount(): Int {
        return datalist.size
    }


    class ViewHolderClass(itemView: View): RecyclerView.ViewHolder(itemView){
        val rvImage: ImageView =itemView.findViewById(R.id.image)
    }
}