package com.filzah.wesantai

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import com.filzah.wesantai.bottomnav.NavAkun
import com.filzah.wesantai.bottomnav.NavHome
import com.filzah.wesantai.bottomnav.NavSearch
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                supportFragmentManager.beginTransaction().replace(R.id.container, NavHome()).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_search -> {
                supportFragmentManager.beginTransaction().replace(R.id.container, NavSearch()).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_akun -> {
                supportFragmentManager.beginTransaction().replace(R.id.container, NavAkun()).commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
