package com.amoueed.practiceappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.custom_toast.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layout = layoutInflater.inflate(R.layout.custom_toast,custom_toast_container)
        val text: TextView = layout.findViewById(R.id.text)
        text.text = "This is a custom toast"
        with (Toast(applicationContext)) {
            duration = Toast.LENGTH_LONG
            view = layout
            show()
        }
    }
}