package com.example.lms

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    lateinit var name:EditText
    lateinit var pass: EditText
    lateinit var get:Button
    lateinit var sharedPreferences: SharedPreferences
    val Name = "nameKey"
    val Pass = "passKey"
    var is_login = "login"
    val myFile = "myProfile"
    var username = ""
    var password = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        name = findViewById(R.id.etName)
        pass = findViewById(R.id.etPass)

        get = findViewById(R.id.btnGet)


        val n = name.text.toString()
        val e = pass.text.toString()
        sharedPreferences = getSharedPreferences(myFile , Context.MODE_PRIVATE)
        username = sharedPreferences.getString(Name,"").toString()
        password = sharedPreferences.getString(Pass , "" ).toString()

        val is_loggedin = sharedPreferences.getString(is_login , "" )
        if(is_loggedin == "true"){
            Toast.makeText(this, "already logged in", Toast.LENGTH_SHORT).show()
            var int = Intent(this,Homepage::class.java);
            startActivity(int);
            finish()
        }
    }

    fun signIn(v:View){

        var int = Intent(this,SignInActivity::class.java);
        startActivity(int);
        finish()
    }

    fun Login(v:View){
        var int = Intent(this,Homepage::class.java);

        val n = name.text.toString()
        val e = pass.text.toString()

        if(username == n && password == e){
            val editor = sharedPreferences.edit()
            editor.putString(is_login , "true")
            editor.apply()
            Toast.makeText(this, "Login Successfull", Toast.LENGTH_SHORT).show()
            startActivity(int)
        }
        else{
            Toast.makeText(this, "Incorrect Id or Password", Toast.LENGTH_SHORT).show()
        }


    }

    fun get(v:View){
        sharedPreferences = getSharedPreferences(myFile , Context.MODE_PRIVATE)
        name.setText(sharedPreferences.getString(Name,""))
        pass.setText(sharedPreferences.getString(Pass , "" ))
    }



}