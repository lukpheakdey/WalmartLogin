package com.pheakdey.lesson4createlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_shopping_category.*

class ShoppingCategoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_category)

        val bundle: Bundle? = intent.extras

        bundle?.let {
            val email = bundle.getString("shopping_category")
            //Toast.makeText(this, "Welcome ${email}", Toast.LENGTH_SHORT).show()
            txtEmail.text = email
        }

        onSelectedImage()

    }

    fun onSelectedImage(){
        img_beauty.setOnClickListener {
            Toast.makeText(this, "Hi there! This is beauty category", Toast.LENGTH_SHORT).show()
        }
        img_cloting.setOnClickListener {
            Toast.makeText(this, "Hi there! This is Cloting category", Toast.LENGTH_SHORT).show()
        }
        img_electroic.setOnClickListener {
            Toast.makeText(this, "Hi there! This is Electroic category", Toast.LENGTH_SHORT).show()
        }
        img_food.setOnClickListener {
            Toast.makeText(this, "Hi there! This is Food category", Toast.LENGTH_SHORT).show()
        }
    }
}