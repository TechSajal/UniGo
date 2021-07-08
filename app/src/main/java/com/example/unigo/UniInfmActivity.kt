package com.example.unigo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class UniInfmActivity : AppCompatActivity() {
    private var country :String? = null
    private var namecollege:String? = null
    private var stateprovince:String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uni_infm)
        val intent :Intent = intent
         namecollege = intent.getStringExtra("name")
         country= intent.getStringExtra("country")
         stateprovince = intent.getStringExtra("stateprovince")
        val link:TextView = findViewById(R.id.country)
        val state:TextView = findViewById(R.id.state)
        val name:TextView = findViewById(R.id.collegename)
        name.text = namecollege
        state.text = stateprovince
        link.text = country
    }
}