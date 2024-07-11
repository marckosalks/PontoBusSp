package com.marcos.pontobussp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        //definaindo o icone que vai começar selecionado no menu
        bottomNavigationView.setSelectedItemId(R.id.bottom_search);

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bottom_home -> {
                    startActivity(Intent(applicationContext, MainActivity::class.java))
                    finish()
                    true
                }

                R.id.bottom_line -> {
                    startActivity(Intent(applicationContext, LineActivity::class.java))
                    finish()
                    true
                }

                R.id.bottom_search -> {
                    true
                }

                else -> false
            }
        }

    }
}