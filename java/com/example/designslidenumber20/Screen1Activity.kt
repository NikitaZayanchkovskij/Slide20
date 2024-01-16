package com.example.designslidenumber20

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.designslidenumber20.databinding.Screen1Binding


class Screen1Activity: AppCompatActivity() {
    private lateinit var binding: Screen1Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Screen1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        buttons()
    }


    private fun buttons() = with(binding) {
        btHideScreen1.setOnClickListener {
            imView.visibility = View.GONE
            tvHidden.visibility = View.VISIBLE
        }
        btShowScreen1.setOnClickListener {
            imView.visibility = View.VISIBLE
            tvHidden.visibility = View.GONE
        }
    }
}