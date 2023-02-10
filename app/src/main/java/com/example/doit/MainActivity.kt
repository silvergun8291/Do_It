package com.example.doit

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.Toast
import com.example.doit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding = ActivityMainBinding.inflate(layoutInflater)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN -> {
                binding.x.text = event.x.toString()
                binding.y.text = event.y.toString()
            }
            MotionEvent.ACTION_UP -> {
                Toast.makeText(this@MainActivity, "Touch Up Event", Toast.LENGTH_SHORT).show()
            }
        }
        return super.onTouchEvent(event)
    }
}