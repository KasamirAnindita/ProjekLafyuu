package com.example.cobaan_dicobain

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish() // Memanggil finish() untuk menghapus MainActivity dari back stack
        }, 3000) // Menunda selama 3 detik (3000 milidetik)
    }

//    private fun setupFlashSaleRecyclerView() {
//        // Initialize RecyclerView
//        val flashSaleRecyclerView = findViewById<RecyclerView>(R.id.flashSaleRecyclerView)
//        flashSaleRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
//
//        // Create sample data for flash sale products
//        val productList = listOf(
//            Product(R.drawable.product_icon, "Man Shirt", "$20"),
//            Product(R.drawable.product_icon_1, "Dress", "$25"),
//            Product(R.drawable.product_icon_2, "Man Work Equipment", "$30"),
//            Product(R.drawable.product_icon_3, "Woman Bag", "$40"),
//            Product(R.drawable.product_icon_4, "Man Shoes", "$50")
//        )
//
//        // Initialize adapter with the sample data
//        val adapter = FlashSaleAdapter(this, productList)
//        flashSaleRecyclerView.adapter = adapter
//    }
}
