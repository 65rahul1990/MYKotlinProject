package com.example.mybataz.mykotlinproject

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.animal_item_list.view.*

class AnimalAdapter(val itemList : ArrayList<String>, val context : Context) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.animal_item_list, parent,false))
        // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return  itemList.size

        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.animalType?.text = itemList.get(position)

        // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }



}
class ViewHolder (view : View) : RecyclerView.ViewHolder(view){
    val animalType  = view.animal_name
}