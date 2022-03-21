package com.turkcell.sinav1

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.turkcell.sinav1.databinding.ActivityProductsBinding


class ProductsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProductsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.imageViewBackNavigation.setOnClickListener {
            finish()
        }
    }

}