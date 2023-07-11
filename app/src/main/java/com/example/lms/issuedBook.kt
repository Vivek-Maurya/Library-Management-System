package com.example.lms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ImageView
import android.widget.TextView
import java.time.LocalDate

class issuedBook : AppCompatActivity() {

    lateinit var bname: TextView
    lateinit var Aname: TextView
    lateinit var idate: TextView
    lateinit var sdate: TextView
    lateinit var Cover: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_issued_book)

        bname = findViewById(R.id.BN)
        Aname = findViewById(R.id.AN)
        idate = findViewById(R.id.idt)
        sdate = findViewById(R.id.sdt)
        Cover = findViewById(R.id.cover)

        var bnm: String = intent.getStringExtra("BookName").toString()
        var anm: String = intent.getStringExtra("AuthorName").toString()

        val cundle: Bundle? = intent.extras
        val resId: Int = cundle!!.getInt("BookImg")
        Cover.setImageResource(resId)
        bname.setText("${bnm}")
        Aname.setText("${anm}")

        idate.setText("${LocalDate.now()}")
        sdate.setText("${LocalDate.now().plusDays(7)}")

    }
}
