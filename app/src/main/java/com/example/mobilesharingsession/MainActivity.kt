package com.example.mobilesharingsession

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.sharinglibrary.Toaster

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.hit)

        button.setOnClickListener {
            Toaster.execute(this, "It Work!")
        }
    }
}