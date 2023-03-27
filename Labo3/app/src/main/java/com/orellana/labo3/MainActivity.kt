package com.orellana.labo3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    private  var contador : Double = 0.0
    private lateinit var imageFiveCents : ImageView
    private lateinit var imageTenCents : ImageView
    private lateinit var imageQuarter : ImageView
    private lateinit var imageDollar : ImageView
    private lateinit var dataText : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding()
        onclick()

    }
    private fun binding(){
        imageFiveCents = findViewById(R.id.Image_Five)
        imageTenCents = findViewById(R.id.Id_Ten)
        imageQuarter = findViewById(R.id.Image_Quarter)
        imageDollar = findViewById(R.id.Image_DOLLAR)
        dataText = findViewById(R.id.id_result)
    }
    private fun onclick (){
        imageFiveCents.setOnClickListener {
            contador += 0.05
            val redondeo = (contador * 100.0).roundToInt()/1000.0
            dataText.text = contador.toString()

        }
        imageTenCents.setOnClickListener {
            contador += 0.10
            val redondeo = (contador * 100.0).roundToInt()/1000.0
        dataText.text = contador.toString()}
        imageQuarter.setOnClickListener {
            contador += 0.25
            val redondeo = (contador * 100.0).roundToInt()/1000.0
        dataText.text = contador.toString()}
        imageDollar.setOnClickListener {
            contador += 1.00
            val redondeo = (contador * 100.0).roundToInt()/1000.0
        dataText.text = contador.toString()}

    }
}