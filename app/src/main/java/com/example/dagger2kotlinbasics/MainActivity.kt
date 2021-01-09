package com.example.dagger2kotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var engine:Engine= Engine()
        var battery:Battery=Battery()

        val hondaCar=Car(engine,battery)

        hondaCar.drive()
    }
}
