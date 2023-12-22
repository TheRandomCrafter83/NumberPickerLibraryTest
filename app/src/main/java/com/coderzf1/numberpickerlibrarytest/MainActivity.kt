package com.coderzf1.numberpickerlibrarytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.coderzf1.numberpickerlibrarytest.databinding.ActivityMainBinding
import com.shawnlin.numberpicker.NumberPicker

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val colors ="Red,Green,Blue,Yellow,Magenta,Orange,Purple,Teal, Black, White".split(",").toTypedArray()
        binding.numPicker.displayedValues = colors

        binding.numPicker.setOnValueChangedListener { picker, oldVal, newVal ->
            binding.textview.text = "number value is : ${colors[newVal-1]}"
        }
    }
}