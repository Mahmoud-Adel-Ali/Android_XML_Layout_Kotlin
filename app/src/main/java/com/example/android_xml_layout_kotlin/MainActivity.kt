package com.example.android_xml_layout_kotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.task_three)

        val num1 = findViewById<EditText>(R.id.firstNum)
        val num2 = findViewById<EditText>(R.id.secondNum)
        val addButton = findViewById<Button>(R.id.addButton)
        val subButton = findViewById<Button>(R.id.subButton)
        val multiplyButton = findViewById<Button>(R.id.multiplyButton)
        val divideButton = findViewById<Button>(R.id.divideButton)
        val clear = findViewById<Button>(R.id.clear)
        val answer = findViewById<TextView>(R.id.answer)

        addButton.setOnClickListener {
            val a = num1.text.toString().toIntOrNull()
            val b = num2.text.toString().toIntOrNull()
            if (a != null && b != null) {
                val c = a + b
                answer.text = c.toString()
            } else {
                answer.text = "Enter two numbers"
            }
        }

        subButton.setOnClickListener {
            val a = num1.text.toString().toIntOrNull()
            val b = num2.text.toString().toIntOrNull()
            if (a != null && b != null) {
                val c = a - b
                answer.text = c.toString()
            } else {
                answer.text = "Enter two numbers"
            }
        }

        multiplyButton.setOnClickListener {
            val a = num1.text.toString().toIntOrNull()
            val b = num2.text.toString().toIntOrNull()
            if (a != null && b != null) {
                val c = a * b
                answer.text = c.toString()
            } else {
                answer.text = "Enter two numbers"
            }
        }

        divideButton.setOnClickListener {
            val a = num1.text.toString().toIntOrNull()
            val b = num2.text.toString().toIntOrNull()
            if (a != null && b != null) {
                if (b != 0) {
                    val c = a.toDouble() / b.toDouble()
                    answer.text = c.toString()
                } else {
                    answer.text = "Cannot divide by zero"
                }
            } else {
                answer.text = "Enter two numbers"
            }
        }

        clear.setOnClickListener {
            num1.text.clear()
            num2.text.clear()
            answer.text = ""
        }
    }
}