package com.example.framehomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.framehomework.databinding.ActivityMainBinding

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}