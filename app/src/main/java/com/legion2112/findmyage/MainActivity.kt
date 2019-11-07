package com.legion2112.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetAge.setOnClickListener {

            //Add code run when button click

            val userDOB:Int = Integer.parseInt(txtAge.text.toString())
            val currentYear:Int = Calendar.getInstance().get(Calendar.YEAR)
            val userAgeInYears:Int = currentYear - userDOB
            tvShowAge.text = "Tu edad es $userAgeInYears años"
        }
    }
}
