package com.marcos.pontobussp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.search.SearchView

lateinit var bottomNavigationView: BottomNavigationView;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        //definaindo o icone que vai começar selecionado no menu
        bottomNavigationView.setSelectedItemId(R.id.bottom_home);

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bottom_home -> {
                    true
                }

                R.id.bottom_line -> {
                    startActivity(Intent(applicationContext, LineActivity::class.java))
                    finish()
                    true
                }

                R.id.bottom_search -> {
                    startActivity(Intent(applicationContext, SearchActivity::class.java))

                    finish()
                    true
                }

                else -> false
            }
        }

    }
}
