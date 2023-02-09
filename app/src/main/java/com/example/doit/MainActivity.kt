package com.example.doit

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.doit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 바인딩 객체 흭득
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 뷰 객체 이용
        binding.btn1.setOnClickListener {
            binding.btn1.setBackgroundColor(Color.RED)
        }
    }
}