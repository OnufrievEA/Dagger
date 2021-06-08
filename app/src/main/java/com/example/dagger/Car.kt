package com.example.dagger

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(private val engine: Engine, private val wheels: Wheels) {

    private companion object {
        val TAG = "Car"
    }

    fun drive() {
        Log.d(TAG, "driving...")
    }
}