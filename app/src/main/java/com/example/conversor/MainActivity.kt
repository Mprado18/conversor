package com.example.conversor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.conversor.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.convertCelsiusInFahrenheit.setOnClickListener {
            check(true)
            binding.convertFahrenheitInCelsius.isChecked = false
        }
        binding.convertFahrenheitInCelsius.setOnClickListener {
            check(true)
            binding.convertCelsiusInFahrenheit.isChecked = false
        }

        binding.buttonConvert.setOnClickListener {
            binding.degree.text = convertValue()
        }
    }

    private fun receiveValue(): Int {
        val input = binding.textInput.text.toString()
        return input.toInt()
    }

    private fun convertValue(): String {
        val result: Int
        var text = ""

        val convertCelsius = binding.convertCelsiusInFahrenheit
        val convertFahrenheit = binding.convertFahrenheitInCelsius

        if (convertCelsius.isChecked) {
            result = ((receiveValue() * 1.8) + 32).toInt()
            text = "${result}° F"
        } else if (convertFahrenheit.isChecked) {
            result = ((receiveValue() - 32) / 1.8).toInt()
            text = "${result}° C"
        }
        return text
    }
}