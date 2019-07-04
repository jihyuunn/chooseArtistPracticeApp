package com.jihyuunn.practice1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var artist = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun davidClicked(view: View) {
        matisseBtn.isChecked = false
        katzBtn.isChecked = false

        artist = "david hockney"
    }

    fun matisseClicked(view: View) {
        davidBtn.isChecked = false
        katzBtn.isChecked = false

        artist = "henri matisse"
    }

    fun katzClicked(view: View) {
        davidBtn.isChecked = false
        matisseBtn.isChecked = false

        artist = "alex katz"
    }

    fun doneClicked(view: View) {
        val endactivity = Intent(this, EndActivity::class.java)
        startActivity(endactivity)
    }

}
