package com.pheakdey.lesson4createlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import java.text.FieldPosition

class ClothingActivity : AppCompatActivity() {

    var clothingList = arrayOf("Nike", "Nike Shoe", "Fla shoe", "MANU Shirt", "H&M", "Nike Shoe", "Sunflower Embroidery", "Mens Man Offical", "Dainty Daisy", "Guy Drawstring", "Neck Long Sleeve", "Solid waterfall")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clothing)

        val adapter = ArrayAdapter(this, R.layout.list_view_clothing, clothingList)
        val listView: ListView = findViewById(R.id.listview_clothing)
        listView.adapter  = adapter

        listView.onItemClickListener = object : AdapterView.OnItemClickListener {
            override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                val itemClothingView = listView.getItemAtPosition(position) as String
                Toast.makeText(applicationContext, "You have selected ${itemClothingView}", Toast.LENGTH_SHORT).show()
            }
        }

    }
}