package com.example.quotewritingapp

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.view.View
import android.widget.DatePicker
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dosomethingButton.setOnClickListener {
            d("Bob","Did something")
            startActivity(Intent(this, AboutMe::class.java))
        }



        dateField.setOnClickListener{
            val c = Calendar.getInstance()
            val datePicker = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                Toast.makeText(this, "Date is $dayOfMonth/$month/$year",Toast.LENGTH_SHORT).show() },
                c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH))
            datePicker.show()
        }
    }
}
