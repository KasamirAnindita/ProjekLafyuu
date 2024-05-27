package com.example.cobaan_dicobain

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProductDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_product_detail)

        val splashLogo = findViewById<ImageView>(R.id.btnBackpd)
        splashLogo.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }



    }
}