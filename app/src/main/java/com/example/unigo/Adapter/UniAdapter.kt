package com.example.unigo.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.unigo.Models.University
import com.example.unigo.R

class UniAdapter(val mContext:Context,val unilist:List<University>): RecyclerView.Adapter<UniViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UniViewHolder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.layout,parent,false)
        return UniViewHolder(view)
    }

    override fun onBindViewHolder(holder: UniViewHolder, position: Int) {
        val uri = unilist[position]
        holder.uniname.text = uri.name
        holder.unistate.text = uri.stateprovince
    }

    override fun getItemCount(): Int {
        return unilist.size
    }
}

class UniViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
   val uniname:TextView = itemView.findViewById(R.id.uniname)
    val unistate:TextView = itemView.findViewById(R.id.unistate)
    val linearLayout:LinearLayout = itemView.findViewById(R.id.lin)
}