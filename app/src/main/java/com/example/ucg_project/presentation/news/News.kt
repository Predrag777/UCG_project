package com.example.ucg_project.presentation.news

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ucg_project.R
import com.example.ucg_project.data.DataClass

class News:AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList:ArrayList<DataClass>
    lateinit var imageList: Array<Int>
    lateinit var titleList:Array<String>
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.news)

        imageList = arrayOf(
            R.drawable.ic_launcher_background,
            R.drawable.logo,
            R.drawable.ic_launcher_background,
            R.drawable.logo,
            R.drawable.ic_launcher_background,
            R.drawable.logo,
        )

        titleList = arrayOf(
            "SS",
            "DsD",
            "Niksic",
            "Waffen",
            "Danilovgrad",
            "WWWWW"
        )

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        dataList = ArrayList()
        getData()
    }

    private fun getData(){
        for(i in imageList.indices){
            val dataClass=DataClass(imageList[i], titleList[i])
            dataList.add(dataClass)
        }

        recyclerView.adapter=AdapterClass(dataList)
    }
}