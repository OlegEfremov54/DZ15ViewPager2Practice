package com.example.dz15viewpager2practice

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    private lateinit var toolbarMain: Toolbar
    private lateinit var viewPager: ViewPager2
    private lateinit var adapter: ViewPagerAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        adapter = ViewPagerAdapter(
            this, OnBoardingFragmentViewModel.viewPagerList
        )
        viewPager = findViewById(R.id.viewPager)
        viewPager.adapter = adapter

    }
    //Инициализация Меню
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.infoMenuMain -> {
                Toast.makeText(
                    applicationContext, "Автор Ефремов О.В. Создан 12.12.2024",
                    Toast.LENGTH_LONG
                ).show()
            }

            R.id.exitMenuMain -> {
                Toast.makeText(
                    applicationContext, "Работа приложения завершена",
                    Toast.LENGTH_LONG
                ).show()
                finishAffinity()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}



