package com.example.designslidenumber20

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.designslidenumber20.databinding.Screen3Binding


class Screen3Activity: AppCompatActivity() {
    private lateinit var binding: Screen3Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Screen3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        buttons()
    }


    /** Кнопки, меняющие прозрачность картинки.
     * Если картинка полностью прозрачна - показываем сообщение об этом и не даём сделать
     * её более прозрачной.
     * Если картинка полностью не прозрачна - тоже показываем сообщение об этом и не даём сделать
     * её менее прозрачной.
     */
    private fun buttons() = with(binding) {
        val minAlpha = 0f
        val maxAlpha = 1f

        btRemoveAlpha.setOnClickListener {
            if (imView.alpha > minAlpha) {
                imView.alpha = (imView.alpha - 0.1f)
            } else {
                Toast.makeText(this@Screen3Activity,
                    "Alpha is already on MIN", Toast.LENGTH_SHORT).show()
            }
        }

        btAddAlpha.setOnClickListener {
            if (imView.alpha < maxAlpha) {
                imView.alpha = (imView.alpha + 0.1f)
            } else {
                Toast.makeText(this@Screen3Activity,
                    "Alpha is already on MAX", Toast.LENGTH_SHORT).show()
            }
        }
    }
}