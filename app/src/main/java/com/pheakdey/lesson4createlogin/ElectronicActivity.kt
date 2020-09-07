package com.pheakdey.lesson4createlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_electronic.*



class ElectronicActivity : AppCompatActivity(), OnProductClickListener {

    lateinit var productlist: ArrayList<Product>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_electronic)

        productlist = ArrayList()
        addProduct()
        rv_electronic.layoutManager = LinearLayoutManager(this)
        rv_electronic.addItemDecoration(DividerItemDecoration(this,1))
        rv_electronic.adapter = ElectronicAdapter(productlist, this)
    }

    fun addProduct() {
        productlist.add(Product("iPhone 12", 2500.00, "Red and white", R.drawable.iphon12, "0001", "new iPhone 12 release news has now all but confirmed further delays to the range new iPhone 12 release news has now all but confirmed further delays to the range new iPhone 12 release news has now all but confirmed further delays to the range new iPhone 12 release news has now all but confirmed further delays to the range new iPhone 12 release news has now all but confirmed further delays to the range new iPhone 12 release news has now"))
        productlist.add(Product("Note 20", 1700.99, "Black and white", R.drawable.note20, "0002", "The introduction of a Note 20 Ultra is set to redefine what the Note means for Samsung and where the Note 20 sits amongst other flagship phones The introduction of a Note 20 Ultra is set to redefine what the Note means for Samsung and where the Note 20 sits amongst other flagship phones The introduction of a Note 20 Ultra is set to redefine what the Note means for Samsung and where the Note 20 sits amongst other flagship phones The introduction of a Note 20 Ultra is set to redefine what the Note means for Samsung and where the Note 20 sits amongst other flagship phones"))
        productlist.add(Product("Mac Book Pro", 2500.50, "Sliver", R.drawable.macbookpro, "0003", "All the usual premium MacBook hardware flourishes return in 2020: you’re getting a really large trackpad that’s the best in the industry; The best monitor in 2020 for gaming and developer with higest resolution Note 20 Ultra is set to redefine what the Note means new iPhone 12 release news has now all but confirmed further delays to the range new iPhone 12 release news has now new iPhone 12 release news has now all but confirmed further delays to the range new iPhone 12 release news has now"))
        productlist.add(Product("New aripod2", 700.88, "Black", R.drawable.newairpod2, "004", "The best monitor in 2020 for gaming and developer with higest resolution. new iPhone 12 release news has now all but confirmed further delays to the range new iPhone 12 release news has now new iPhone 12 release news has now all but confirmed further delays to the range new iPhone 12 release news has now new iPhone 12 release news has now all but confirmed further delays to the range new iPhone 12 release news has now"))
        productlist.add(Product("Gaming Monitor", 1700.88, "Black", R.drawable.gaming, "004", "The best monitor in 2020 for gaming and developer with higest resolution. new iPhone 12 release news has now all but confirmed further delays to the range new iPhone 12 release news has now new iPhone 12 release news has now all but confirmed further delays to the range new iPhone 12 release news has now new iPhone 12 release news has now all but confirmed further delays to the range new iPhone 12 release news has now"))
        productlist.add(Product("iPad Pro 2020", 999.88, "Black", R.drawable.ipadpro2020, "005", "The best monitor in 2020 for gaming and developer with higest resolution. new iPhone 12 release news has now all but confirmed further delays to the range new iPhone 12 release news has now new iPhone 12 release news has now all but confirmed further delays to the range new iPhone 12 release news has now new iPhone 12 release news has now all but confirmed further delays to the range new iPhone 12 release news has now"))
        productlist.add(Product("Dell XPS", 1900.99, "Black", R.drawable.dellxps, "006", "The best monitor in 2020 for gaming and developer with higest resolution. new iPhone 12 release news has now all but confirmed further delays to the range new iPhone 12 release news has now new iPhone 12 release news has now all but confirmed further delays to the range new iPhone 12 release news has now new iPhone 12 release news has now all but confirmed further delays to the range new iPhone 12 release news has now"))
        productlist.add(Product("Airpod", 450.99, "Red and black", R.drawable.airpod, "007", "The best monitor in 2020 for gaming and developer with higest resolution. new iPhone 12 release news has now all but confirmed further delays to the range new iPhone 12 release news has now new iPhone 12 release news has now all but confirmed further delays to the range new iPhone 12 release news has now new iPhone 12 release news has now all but confirmed further delays to the range new iPhone 12 release news has now"))
    }

    override fun onItemClick(item: Product, position: Int) {
        //Toast.makeText(this, item.title , Toast.LENGTH_SHORT).show()
        var intent = Intent(this, ElectronicDetailActivity::class.java)
        intent.putExtra("Product_Title", item.title)
        intent.putExtra("Product_Description", item.desc)
        intent.putExtra("Product_Color", item.color)
        intent.putExtra("Product_Image", item.image.toString())
        startActivity(intent)
    }
}