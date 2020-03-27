package ru.smak.gps_test2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import ru.smak.gps.GPSHelper

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        GPSHelper.showLocation = ::showData
        button.setOnClickListener {
            GPSHelper.getInstance(this)
        }
    }

    private fun showData() {
        Log.i("LATITUDE", GPSHelper.imHere?.latitude.toString())
        Log.i("LONGITUDE", GPSHelper.imHere?.longitude.toString())
    }


}
