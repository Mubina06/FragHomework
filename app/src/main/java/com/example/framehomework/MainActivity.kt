package com.example.framehomework

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.framehomework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    @SuppressLint("CommitTransaction")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .add(R.id.container, SplashFragment())
            .commit()


        Handler(Looper.getMainLooper()).postDelayed({
            supportFragmentManager.beginTransaction()
                .add(R.id.container, RegFragment())
                .commit()
        }, 3000)

    }
}

