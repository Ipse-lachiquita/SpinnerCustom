package com.example.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var text1: TextView
    lateinit var text2: TextView
    lateinit var text3: TextView
    lateinit var text4: TextView
    lateinit var text5: TextView
    lateinit var text6: TextView
    lateinit var text7: TextView
    lateinit var text8: TextView
    lateinit var text9: TextView
    lateinit var text10: TextView
    lateinit var time: TextView
    var state: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        time = findViewById(R.id.time)
        text1 = findViewById(R.id.text_1)
        text2 = findViewById(R.id.text_2)
        text3 = findViewById(R.id.text_3)
        text4 = findViewById(R.id.text_4)
        text5 = findViewById(R.id.text_5)
        text6 = findViewById(R.id.text_6)
        text7 = findViewById(R.id.text_7)
        text8 = findViewById(R.id.text_8)
        text9 = findViewById(R.id.text_9)
        text10 = findViewById(R.id.text_10)

        time.setOnClickListener {
            clickTime()
        }
    }

    private fun clickTime() {
        if (state) {
            state = false
            text1.visibility = View.GONE
            text2.visibility = View.GONE
            text3.visibility = View.GONE
            text4.visibility = View.GONE
            text5.visibility = View.GONE
            text6.visibility = View.GONE
            text7.visibility = View.GONE
            text8.visibility = View.GONE
            text9.visibility = View.GONE
            text10.visibility = View.GONE
        } else {
            state = true
            text1.visibility = View.VISIBLE
            text2.visibility = View.VISIBLE
            text3.visibility = View.VISIBLE
            text4.visibility = View.VISIBLE
            text5.visibility = View.VISIBLE
            text6.visibility = View.VISIBLE
            text7.visibility = View.VISIBLE
            text8.visibility = View.VISIBLE
            text9.visibility = View.VISIBLE
            text10.visibility = View.VISIBLE

        }

    }

}