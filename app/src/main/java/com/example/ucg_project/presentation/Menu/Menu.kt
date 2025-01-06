package com.example.ucg_project.presentation.Menu

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ucg_project.R
import com.example.ucg_project.data.MenuDataClass
import com.example.ucg_project.presentation.news.AdapterClass

class Menu:AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var datalist:ArrayList<MenuDataClass>
    lateinit var imageList: Array<Int>
    lateinit var imageList2:Array<Int>


    @SuppressLint("MissingInflatedId")
    override fun onCreate(saveInstanceState:Bundle?){
        super.onCreate(saveInstanceState)
        setContentView(R.layout.main_menu)

        imageList = arrayOf(
            R.drawable.logo,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.logo,
            R.drawable.ic_launcher_background,
            R.drawable.logo,
        )

        imageList2 = arrayOf(
            R.drawable.ic_launcher_background,
            R.drawable.logo,
            R.drawable.ic_launcher_background,
            R.drawable.logo,
            R.drawable.ic_launcher_background,
            R.drawable.logo,
        )

        recyclerView=findViewById(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        datalist=ArrayList()
        getData()
    }

    private fun getData(){
        for(i in imageList.indices){
            val dataClass= MenuDataClass(imageList[i], imageList[i])
            datalist.add(dataClass)
        }

        recyclerView.adapter= MenuAdapterClass(datalist)
    }
}