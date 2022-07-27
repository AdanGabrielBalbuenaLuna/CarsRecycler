package com.example.carsrecycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CarAdapter(val ListaCarros: List<Car>):RecyclerView.Adapter<CarViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val layoutInflador = LayoutInflater.from(parent.context)
        return CarViewHolder(layoutInflador.inflate(R.layout.item_car, parent, false))
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        val item = ListaCarros[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return ListaCarros.size
    }
}