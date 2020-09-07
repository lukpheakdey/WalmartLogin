package com.pheakdey.lesson4createlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_electronic_detail.*

class ElectronicDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_electronic_detail)

        var productTitle = intent.getStringExtra("Product_Title")
        var productDescription = intent.getStringExtra("Product_Description")
        var productImage = intent.getStringExtra("Product_Image").toInt()
        var productColor = intent.getStringExtra("Product_Color")
        //Toast.makeText(this, productImage, Toast.LENGTH_SHORT).show()
        product_title.text = productTitle
        product_description.text = productDescription
        product_color.text = productColor
        image_1.setImageResource(productImage)
    }
}