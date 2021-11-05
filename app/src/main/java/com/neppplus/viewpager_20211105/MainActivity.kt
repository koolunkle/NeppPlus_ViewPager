package com.neppplus.viewpager_20211105

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.viewpager_20211105.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mvpa : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

    }

    fun setupEvents() {

    }

    fun setValues() {
        mvpa = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mvpa
    }

}