package com.example.carsrecycler

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CarViewHolder(view: View):RecyclerView.ViewHolder(view) {
    val carMarca = view.findViewById<TextView>(R.id.tvCarMarca)
    val carModelo = view.findViewById<TextView>(R.id.tvCarModelo)
    val carAño = view.findViewById<TextView>(R.id.tvCarAño)
    val carDoors = view.findViewById<TextView>(R.id.tvCarPuertas)
    val carColor = view.findViewById<TextView>(R.id.tvCarColor)
    val carPrecio = view.findViewById<TextView>(R.id.tvCarPrecio)

    fun render(carModel: Car){
        carMarca.text = carModel.make
        carModelo.text = carModel.model
        carAño.text = carModel.year
        carDoors.text = carModel.doors.toString()
        carColor.text = carModel.colour
        carPrecio.text = carModel.price
    }
}