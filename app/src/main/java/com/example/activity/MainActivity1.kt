package com.example.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity1 : AppCompatActivity() {
    var contador = 0
    lateinit var Boton1: Button
    lateinit var Ventana: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activty_1)

        Boton1 = findViewById(R.id.Boton1)
        Ventana = findViewById(R.id.Ventana)

        Boton1.setOnClickListener {
            contador++
            Ventana.text = contador.toString()
            Toast.makeText(this, contador.toString(), Toast.LENGTH_LONG).show()
        }
    }

override fun onResume(){
    super.onResume()
    Toast.makeText(this, "Hola", Toast.LENGTH_LONG).show()
   /* val intent = Intent(Intent.ACTION_VIEW)
    intent.data = Uri.parse("https://google.com")
    startActivity(intent)
    val intent = Intent(this,Activity2::class.java)
    startActivity(intent)

    */
}
}
