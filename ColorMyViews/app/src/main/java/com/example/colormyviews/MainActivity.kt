package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
    }

    private fun setListener() {
        val clickAbleViews: List<View> =
            listOf(findViewById(R.id.box_one),
                   findViewById(R.id.box_two),
                   findViewById(R.id.box_three),
                   findViewById(R.id.box_four),
                   findViewById(R.id.box_five))
        for (item in clickAbleViews) {
            item.setOnClickListener {
                makeColored(it)
            }
        }
    }

    private fun makeColored(it: View) {
        when(it.id) {
            R.id.box_one -> it.setBackgroundColor(Color.BLUE)
            R.id.box_two -> it.setBackgroundColor(Color.GREEN)
            R.id.box_three -> it.setBackgroundColor(Color.CYAN)
            R.id.box_four -> it.setBackgroundColor(Color.YELLOW)
            else -> it.setBackgroundColor(Color.RED)
        }
    }
}
