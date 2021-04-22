package com.example.conversor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        convertCAndF.setOnClickListener {
            check(true)
            convertFAndC.isChecked = false
        }
        convertFAndC.setOnClickListener {
            check(true)
            convertCAndF.isChecked = false
        }

        buttonConvert.setOnClickListener {
            result.text = convertValue()
        }
    }

    fun receiveValue(): Int {
        val cap = textInput.text
        return cap.toString().toInt()
    }

    fun convertValue(): String {
        var result: Int = 0
        var text: String = ""
        if (convertCAndF.isChecked) {
            result = ((receiveValue() * 1.8) + 32).toInt()
            text = "${result}° F"
        } else if (convertFAndC.isChecked) {
            result = ((receiveValue() - 32) / 1.8).toInt()
            text = "${result}° C"
        }
        return text
    }
}