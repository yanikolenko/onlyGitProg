package com.kulyksergey.students

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val str = StringBuilder()
        repeat(26) {
            str.append(
            "        <TextView\n" +
                    "            style=\"@style/StudentName\"\n" +
                    "            android:layout_width=\"match_parent\"\n" +
                    "            android:layout_height=\"wrap_content\"\n" +
                    "            android:text=\"${it + 1}. \" />"
            )
            str.append("\n")
        }
        println(str.toString())
    }
}