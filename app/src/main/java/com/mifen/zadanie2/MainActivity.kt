package com.mifen.zadanie2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var firstFragment: FirstFragment
    lateinit var secondFragment: SecondFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstFragment = FirstFragment.newInstance()
        secondFragment = SecondFragment()
    }

    fun switchToFirstFragment(){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, firstFragment)
            .commit()

        }
    fun switchToSecondFragment(){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, secondFragment)
            .commit()
    }
}