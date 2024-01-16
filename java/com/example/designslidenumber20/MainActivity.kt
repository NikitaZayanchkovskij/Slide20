package com.example.designslidenumber20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.designslidenumber20.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        openANewsScreenButtons()
    }


    /** Кнопки открыть 1, 2 или 3 экран.
     */
    private fun openANewsScreenButtons() = with(binding) {
        bt1Main.setOnClickListener {
            startActivity(Intent(this@MainActivity, Screen1Activity::class.java))
        }
        bt2Main.setOnClickListener {
            startActivity(Intent(this@MainActivity, Screen2Activity::class.java))
        }
        bt3Main.setOnClickListener {
            startActivity(Intent(this@MainActivity, Screen3Activity::class.java))
        }
    }
}