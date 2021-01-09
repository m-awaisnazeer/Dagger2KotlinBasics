package com.example.dagger2kotlinbasics

import javax.inject.Inject

class Battery @Inject constructor(){
    fun ignite(){
        Utils.showTag("Battery is ready")
    }
}