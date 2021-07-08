package com.example.unigo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.unigo.Adapter.UniAdapter
import com.example.unigo.Model.University


import com.example.unigo.ViewModel.UniViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var uni_rv:RecyclerView
    private lateinit var uniAdapter: UniAdapter
    lateinit var list:List<University>
    private lateinit var univiewmodel:UniViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        uni_rv = findViewById(R.id.activity_state_wise_recyclerview)
        uni_rv.layoutManager = LinearLayoutManager(this)
        uni_rv.setHasFixedSize(true)
        univiewmodel = ViewModelProvider(this).get(UniViewModel::class.java)
        univiewmodel.unidata.observe(this, Observer {
            list = it as List<University>
            uniAdapter = UniAdapter(this,list)
            uni_rv.adapter = uniAdapter
            uniAdapter.notifyDataSetChanged()
        })
    }
}