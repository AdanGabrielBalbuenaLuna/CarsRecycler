package com.example.carsrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.carsrecycler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var bindingVar : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingVar = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingVar.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        bindingVar.carsRecyclerXml.layoutManager = LinearLayoutManager(this)
        bindingVar.carsRecyclerXml.adapter = CarAdapter(CarsProvider.carList)
    }
}