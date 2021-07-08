package com.example.unigo.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.unigo.Model.University
import com.example.unigo.R
import com.example.unigo.UniInfmActivity

class UniAdapter(val mContext:Context, val unilist: List<University>): RecyclerView.Adapter<UniViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UniViewHolder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.layout,parent,false)
        return UniViewHolder(view)
    }

    override fun onBindViewHolder(holder: UniViewHolder, position: Int) {
        val uri = unilist[position]
        holder.uniname.text = uri.name
        holder.unistate.text = uri.state_province
        holder.linearLayout.setOnClickListener {
            val i = Intent(mContext,UniInfmActivity::class.java)
            i.putExtra("name",uri.name)
            i.putExtra("stateprovince",uri.state_province)
             i.putExtra("country",uri.country)
            mContext.startActivity(i)

        }
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