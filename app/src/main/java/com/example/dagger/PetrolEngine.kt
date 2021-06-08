package com.example.dagger

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor() : Engine {

    private val TAG = "Car"
    override fun start() {
        Log.d(TAG, "Petrol engine started")
    }
}