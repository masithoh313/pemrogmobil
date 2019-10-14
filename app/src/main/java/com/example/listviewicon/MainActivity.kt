package com.example.listviewicon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.R.layout.simple_list_item_1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val languages= listOf("Ruby","Rails","Python","Java Script","PHP")

        listViewIcon.adapter=ArrayAdapter(this, simple_list_item_1, languages)

        listViewIcon.setOnItemClickListener { parent, view, position, id->
            Toast.makeText(this, "anda memilih:" +
                    "${languages[position]}",Toast.LENGTH_SHORT).show()}
        }

}
