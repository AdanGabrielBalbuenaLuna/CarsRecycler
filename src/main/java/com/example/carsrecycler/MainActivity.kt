package com.example.carsrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        val recyclerViewCarXML = findViewById<RecyclerView>(R.id.cars_recycler_xml)
        recyclerViewCarXML.layoutManager = LinearLayoutManager(this)
        recyclerViewCarXML.adapter = CarAdapter(CarsProvider.carList)
    }
}