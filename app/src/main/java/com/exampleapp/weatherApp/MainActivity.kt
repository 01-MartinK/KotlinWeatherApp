package com.exampleapp.weatherApp

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.RelativeLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val CITY: String = "dhaka,bd";
    val API: String = "77f97b598769bf8861004c74e30ebbba";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

    }
}