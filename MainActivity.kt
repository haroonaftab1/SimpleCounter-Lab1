package com.example.simplecounter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var counter = 0
    private var incrementValue = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)
        val upgradeBtn = findViewById<Button>(R.id.upgradeBtn)

        button.setOnClickListener {
            counter += incrementValue
            textView.text = counter.toString()

            // Show upgrade button when counter reaches 100
            if (counter >= 100 && incrementValue == 1) {
                upgradeBtn.visibility = android.view.View.VISIBLE
            }
        }

        upgradeBtn.setOnClickListener {
            incrementValue = 2
            upgradeBtn.visibility = android.view.View.INVISIBLE
        }
    }
}