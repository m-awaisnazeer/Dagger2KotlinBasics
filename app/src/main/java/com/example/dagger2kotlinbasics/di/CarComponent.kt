package com.example.dagger2kotlinbasics.di

import com.example.dagger2kotlinbasics.Car
import dagger.Component

@Component
interface CarComponent {
    fun getCar():Car
}