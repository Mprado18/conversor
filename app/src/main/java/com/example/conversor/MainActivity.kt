package com.example.conversor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        convertMlxG.setOnClickListener {
            check(true)
            convertGxMl.isChecked = false}
        convertGxMl.setOnClickListener {
            check(true)
            convertMlxG.isChecked = false}
    }
}