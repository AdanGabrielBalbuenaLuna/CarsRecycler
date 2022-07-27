package com.example.carsrecycler

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.carsrecycler.databinding.ItemCarBinding

class CarViewHolder(view: View):RecyclerView.ViewHolder(view) {
    val binding = ItemCarBinding.bind(view)

    fun render(carModel: Car){
        binding.tvCarMarca.text = carModel.make
        binding.tvCarModelo.text = carModel.model
        binding.tvCarAO.text = carModel.year
        binding.tvCarPuertas.text = carModel.doors.toString()
        binding.tvCarColor.text = carModel.colour
        binding.tvCarPrecio.text = carModel.price
    }
}