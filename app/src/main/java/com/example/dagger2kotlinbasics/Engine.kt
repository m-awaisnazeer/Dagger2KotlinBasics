package com.example.dagger2kotlinbasics

import javax.inject.Inject

class Engine @Inject constructor(){

    fun start(){
        Utils.showTag("Engine has started")
    }

}