package com.example.dagger2kotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2kotlinbasics.di.DaggerCarComponent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var engine:Engine= Engine()
        var battery:Battery=Battery()

        val hondaCar=DaggerCarComponent.create().getCar()

        hondaCar.drive()
    }
}
