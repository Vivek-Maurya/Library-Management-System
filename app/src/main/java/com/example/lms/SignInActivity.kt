package com.example.lms

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.*

class SignInActivity : AppCompatActivity() {

    lateinit var name: EditText
    lateinit var email: EditText
    lateinit var pass: EditText
    lateinit var save: Button

    lateinit var sharedPreferences: SharedPreferences
    val Name = "nameKey"
    val Pass = "passKey"
    val Email = "Username"
    var is_login = "login";
    val myFile = "myProfile"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        name = findViewById(R.id.etName)
        pass = findViewById(R.id.etPsw)
        email = findViewById(R.id.etUsrnm)
        save = findViewById(R.id.btnsign)




        sharedPreferences = getSharedPreferences(myFile, Context.MODE_PRIVATE)
        name.setText(sharedPreferences.getString(Name, ""))
        pass.setText(sharedPreferences.getString(Pass, ""))
        email.setText(sharedPreferences.getString(Pass, ""))

        val is_loggedin = sharedPreferences.getString(is_login, "")
        if (is_loggedin == "true") {
            Toast.makeText(this, "User Already Exist", Toast.LENGTH_SHORT).show()
            var int = Intent(this, Homepage::class.java);
            startActivity(int);
        }


    }
        fun save(v: View) {
            val n = name.text.toString()
            val p = pass.text.toString()
            val e = email.text.toString()
            val l = "false";
            val editor = sharedPreferences.edit()
            editor.putString(Name, n)
            editor.putString(Pass, p)
            editor.putString(Pass, e)
            editor.putString(is_login, l)

            editor.apply()
            Toast.makeText(this, "SignUp successfull", Toast.LENGTH_SHORT).show()

            var int = Intent(this, LoginActivity::class.java);
            startActivity(int);
            finish()

        }
}