package com.example.designslidenumber20

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.designslidenumber20.databinding.Screen2Binding


class Screen2Activity: AppCompatActivity() {
    private lateinit var binding: Screen2Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Screen2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        buttons()
    }


    private fun buttons() = with(binding) {
        btRemove.setOnClickListener {
            imView2.visibility = View.GONE
        }
        btAdd.setOnClickListener {
            imView2.visibility = View.VISIBLE
        }
    }
}