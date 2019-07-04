package com.jihyuunn.practice1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_end.*

class EndActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)
        val artist = intent.getStringExtra("artist")


        endTxt.text = "Find ${artist}'s Art Pieces ..."
    }
}
