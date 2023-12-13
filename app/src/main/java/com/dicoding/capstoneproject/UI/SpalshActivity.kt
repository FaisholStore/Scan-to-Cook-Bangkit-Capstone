package com.dicoding.capstoneproject.UI

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.capstoneproject.databinding.ActivitySpalshBinding

class SpalshActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySpalshBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySpalshBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        // Delay for 2000 milliseconds (2 seconds) and then navigate to MainActivity
        Handler(Looper.getMainLooper())
            .postDelayed(
                {
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                },2000
            )
    }
}
