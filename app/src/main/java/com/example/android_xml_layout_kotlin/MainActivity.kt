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
        setContentView(R.layout.add_two_num)
        val num1 = findViewById<EditText>(R.id.num1)
        val num2 = findViewById<EditText>(R.id.num2)
        val add = findViewById<Button>(R.id.button)
        val result = findViewById<TextView>(R.id.result)

        add.setOnClickListener{
            val a = num1.text.toString().toIntOrNull();
            val b = num2.text.toString().toIntOrNull();
            if(a != null && b != null){
                val c= a + b
                result.text = c.toString()
            }else{
                result.text = "Enter two number"
            }

        }

    }
}