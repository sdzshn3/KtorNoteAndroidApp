package com.androiddevs.ktornoteapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.androiddevs.ktornoteapp.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}