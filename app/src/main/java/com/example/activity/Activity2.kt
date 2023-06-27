package com.example.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(this, "Activity2", Toast.LENGTH_LONG).show()
    }
}