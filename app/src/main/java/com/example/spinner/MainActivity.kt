package com.example.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

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
    lateinit var layout: LinearLayout
    var state: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
        initListener()

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.layout_time -> {
                clickTime()
            }
            R.id.text_1 -> {
                gone("07:00")

            }
            R.id.text_2 -> {
                gone("07:10")
            }
            R.id.text_3 -> {
                gone("07:20")
            }
            R.id.text_4 -> {
                gone("07:30")
            }
            R.id.text_5 -> {
                gone("07:40")
            }
            R.id.text_6 -> {
                gone("07:50")
            }
            R.id.text_7 -> {
                gone("08:00")
            }
            R.id.text_8 -> {
                gone("08:10")
            }
            R.id.text_9 -> {
                gone("08:20")
            }
            R.id.text_10 -> {
                gone("08:30")
            }

        }
    }


    private fun init() {
        time = findViewById(R.id.text_time)
        layout = findViewById(R.id.layout_time)
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
    }

    private fun initListener() {
        text1.setOnClickListener(this)
        text2.setOnClickListener(this)
        text3.setOnClickListener(this)
        text4.setOnClickListener(this)
        text5.setOnClickListener(this)
        text6.setOnClickListener(this)
        text7.setOnClickListener(this)
        text8.setOnClickListener(this)
        text9.setOnClickListener(this)
        text10.setOnClickListener(this)
        layout.setOnClickListener(this)
    }

    private fun gone(setTime: String) {
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
        time.text = setTime
    }

    private fun gone() {
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
    }

    private fun visibility() {
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

    private fun clickTime() {
        if (state) {
            state = false
            gone()
        } else {
            state = true
            visibility()

        }

    }


}