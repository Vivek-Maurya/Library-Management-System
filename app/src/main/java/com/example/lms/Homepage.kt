package com.example.lms

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class Homepage : AppCompatActivity() {
    lateinit var btnissue: Button
    lateinit var b1: LinearLayout
    lateinit var b2: LinearLayout
    lateinit var b3: LinearLayout
    lateinit var b4: LinearLayout
    lateinit var b5: LinearLayout
    lateinit var b6: LinearLayout
    lateinit var b7: LinearLayout
    lateinit var b8: LinearLayout
    lateinit var b9: LinearLayout
    lateinit var b10: LinearLayout

    lateinit var sharedPreferences: SharedPreferences
    val myFile = "myProfile"
    var is_login = "login"

    var count1 : Int = 0
    var count2 : Int = 0
    var count3 : Int = 0
    var count4 : Int = 0
    var count5 : Int = 0
    var count6 : Int = 0
    var count7 : Int = 0
    var count8 : Int = 0
    var count9 : Int = 0
    var count10 : Int = 0

    var quan1 : Int = 20
    var quan2: Int = 20
    var quan3 : Int = 1
    var quan4 : Int = 20
    var quan5 : Int = 20
    var quan6 : Int = 20
    var quan7: Int = 20
    var quan8 : Int = 20
    var quan9 : Int = 20
    var quan10 : Int = 20




    var txt : String = ""
    var atxt : String = ""
    var qty : Int  = 0
    var qnt : Int = 0





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        sharedPreferences = getSharedPreferences(myFile , Context.MODE_PRIVATE)

        btnissue = findViewById(R.id.issuebtn)
        b1 = findViewById(R.id.Book1)
        b2 = findViewById(R.id.Book2)
        b3 = findViewById(R.id.Book3)
        b4 = findViewById(R.id.Book4)
        b5 = findViewById(R.id.Book5)
        b6 = findViewById(R.id.Book6)
        b7 = findViewById(R.id.Book7)
        b8 = findViewById(R.id.Book8)
        b9 = findViewById(R.id.Book9)
        b10 = findViewById(R.id.Book10)


        var qt1 = findViewById<TextView>(R.id.q1)
        qt1.setText("$quan1")

        var qt2 = findViewById<TextView>(R.id.q2)
        qt2.setText("$quan2")

        var qt3 = findViewById<TextView>(R.id.q3)
        qt3.setText("$quan3")

        var qt4 = findViewById<TextView>(R.id.q4)
        qt4.setText("$quan4")

        var qt5 = findViewById<TextView>(R.id.q5)
        qt5.setText("$quan5")

        var qt6 = findViewById<TextView>(R.id.q6)
        qt6.setText("$quan6")

        var qt7 = findViewById<TextView>(R.id.q7)
        qt7.setText("$quan7")

        var qt8 = findViewById<TextView>(R.id.q8)
        qt8.setText("$quan8")

        var qt9 = findViewById<TextView>(R.id.q9)
        qt9.setText("$quan9")

        var qt10 = findViewById<TextView>(R.id.q10)
        qt10.setText("$quan10")



        b1.setOnClickListener{
            if(count1%2==0) {
                b1.setBackgroundResource(R.drawable.black_curved)

                btnissue.setVisibility(View.VISIBLE)
            }
            else {
                b1.setBackgroundResource(R.drawable.curved)
                btnissue.setVisibility(View.INVISIBLE)
            }
            count1++

            b2.setBackgroundResource(R.drawable.curved)
            b3.setBackgroundResource(R.drawable.curved)
            b4.setBackgroundResource(R.drawable.curved)
            b5.setBackgroundResource(R.drawable.curved)
            b6.setBackgroundResource(R.drawable.curved)
            b7.setBackgroundResource(R.drawable.curved)
            b8.setBackgroundResource(R.drawable.curved)
            b9.setBackgroundResource(R.drawable.curved)
            b10.setBackgroundResource(R.drawable.curved)

            count2=0
            count3=0
            count4=0
            count5=0
            count6=0
            count7=0
            count8=0
            count9=0
            count10=0

            var bname = findViewById<TextView>(R.id.name1)
            var aname = findViewById<TextView>(R.id.Aname1)
            txt = bname.text.toString()
            atxt = aname.text.toString()
            qnt=1



        }

        b2.setOnClickListener{
            if(count2%2==0) {
                b2.setBackgroundResource(R.drawable.black_curved)
                btnissue.setVisibility(View.VISIBLE)
            }
            else {
                b2.setBackgroundResource(R.drawable.curved)
                        btnissue.setVisibility(View.INVISIBLE)
            }
            count2++

            b1.setBackgroundResource(R.drawable.curved)
            b3.setBackgroundResource(R.drawable.curved)
            b4.setBackgroundResource(R.drawable.curved)
            b5.setBackgroundResource(R.drawable.curved)
            b6.setBackgroundResource(R.drawable.curved)
            b7.setBackgroundResource(R.drawable.curved)
            b8.setBackgroundResource(R.drawable.curved)
            b9.setBackgroundResource(R.drawable.curved)
            b10.setBackgroundResource(R.drawable.curved)

            count1=0
            count3=0
            count4=0
            count5=0
            count6=0
            count7=0
            count8=0
            count9=0
            count10=0

            var bname = findViewById<TextView>(R.id.name2)
            txt = bname.text.toString()

            var aname = findViewById<TextView>(R.id.Aname2)
            atxt = aname.text.toString()
            qnt=2
        }

        b3.setOnClickListener{
            if(count3%2==0) {
                b3.setBackgroundResource(R.drawable.black_curved)
                btnissue.setVisibility(View.VISIBLE)
            }
            else {
                b3.setBackgroundResource(R.drawable.curved)
                btnissue.setVisibility(View.INVISIBLE)
            }
            count3++

            b1.setBackgroundResource(R.drawable.curved)
            b2.setBackgroundResource(R.drawable.curved)
            b4.setBackgroundResource(R.drawable.curved)
            b5.setBackgroundResource(R.drawable.curved)
            b6.setBackgroundResource(R.drawable.curved)
            b7.setBackgroundResource(R.drawable.curved)
            b8.setBackgroundResource(R.drawable.curved)
            b9.setBackgroundResource(R.drawable.curved)
            b10.setBackgroundResource(R.drawable.curved)

            count1=0
            count2=0
            count4=0
            count5=0
            count6=0
            count7=0
            count8=0
            count9=0
            count10=0

            var bname = findViewById<TextView>(R.id.name3)
            txt = bname.text.toString()

            var aname = findViewById<TextView>(R.id.Aname3)
            atxt = aname.text.toString()
            qnt=3
        }

        b4.setOnClickListener{
            if(count4%2==0) {
                b4.setBackgroundResource(R.drawable.black_curved)
                btnissue.setVisibility(View.VISIBLE)
            }
            else {
                b4.setBackgroundResource(R.drawable.curved)
                btnissue.setVisibility(View.INVISIBLE)
            }
            count4++

            b1.setBackgroundResource(R.drawable.curved)
            b2.setBackgroundResource(R.drawable.curved)
            b3.setBackgroundResource(R.drawable.curved)
            b5.setBackgroundResource(R.drawable.curved)
            b6.setBackgroundResource(R.drawable.curved)
            b7.setBackgroundResource(R.drawable.curved)
            b8.setBackgroundResource(R.drawable.curved)
            b9.setBackgroundResource(R.drawable.curved)
            b10.setBackgroundResource(R.drawable.curved)

            count1=0
            count2=0
            count3=0
            count5=0
            count6=0
            count7=0
            count8=0
            count9=0
            count10=0

            var bname = findViewById<TextView>(R.id.name4)
            txt = bname.text.toString()

            var aname = findViewById<TextView>(R.id.Aname4)
            atxt = aname.text.toString()
            qnt=4
        }

        b5.setOnClickListener{
            if(count5%2==0) {
                b5.setBackgroundResource(R.drawable.black_curved)
                btnissue.setVisibility(View.VISIBLE)
            }
            else {
                b5.setBackgroundResource(R.drawable.curved)
                btnissue.setVisibility(View.INVISIBLE)
            }
            count5++

            b1.setBackgroundResource(R.drawable.curved)
            b2.setBackgroundResource(R.drawable.curved)
            b3.setBackgroundResource(R.drawable.curved)
            b4.setBackgroundResource(R.drawable.curved)
            b6.setBackgroundResource(R.drawable.curved)
            b7.setBackgroundResource(R.drawable.curved)
            b8.setBackgroundResource(R.drawable.curved)
            b9.setBackgroundResource(R.drawable.curved)
            b10.setBackgroundResource(R.drawable.curved)

            count1=0
            count2=0
            count3=0
            count4=0
            count6=0
            count7=0
            count8=0
            count9=0
            count10=0

            var bname = findViewById<TextView>(R.id.name5)
            txt = bname.text.toString()

            var aname = findViewById<TextView>(R.id.Aname5)
            atxt = aname.text.toString()
            qnt=5
        }

        b6.setOnClickListener{
            if(count6%2==0) {
                b6.setBackgroundResource(R.drawable.black_curved)
                btnissue.setVisibility(View.VISIBLE)
            }
            else {
                b6.setBackgroundResource(R.drawable.curved)
                btnissue.setVisibility(View.INVISIBLE)
            }
            count6++

            b1.setBackgroundResource(R.drawable.curved)
            b2.setBackgroundResource(R.drawable.curved)
            b3.setBackgroundResource(R.drawable.curved)
            b4.setBackgroundResource(R.drawable.curved)
            b5.setBackgroundResource(R.drawable.curved)
            b7.setBackgroundResource(R.drawable.curved)
            b8.setBackgroundResource(R.drawable.curved)
            b9.setBackgroundResource(R.drawable.curved)
            b10.setBackgroundResource(R.drawable.curved)

            count1=0
            count2=0
            count3=0
            count4=0
            count5=0
            count7=0
            count8=0
            count9=0
            count10=0

            var bname = findViewById<TextView>(R.id.name6)
            txt = bname.text.toString()

            var aname = findViewById<TextView>(R.id.Aname6)
            atxt = aname.text.toString()
            qnt=6
        }

        b7.setOnClickListener{
            if(count7%2==0) {
                b7.setBackgroundResource(R.drawable.black_curved)
                btnissue.setVisibility(View.VISIBLE)
            }
            else {
                b7.setBackgroundResource(R.drawable.curved)
                btnissue.setVisibility(View.INVISIBLE)
            }
            count7++

            b1.setBackgroundResource(R.drawable.curved)
            b2.setBackgroundResource(R.drawable.curved)
            b3.setBackgroundResource(R.drawable.curved)
            b4.setBackgroundResource(R.drawable.curved)
            b5.setBackgroundResource(R.drawable.curved)
            b6.setBackgroundResource(R.drawable.curved)
            b8.setBackgroundResource(R.drawable.curved)
            b9.setBackgroundResource(R.drawable.curved)
            b10.setBackgroundResource(R.drawable.curved)

            count1=0
            count2=0
            count3=0
            count4=0
            count5=0
            count6=0
            count8=0
            count9=0
            count10=0

            var bname = findViewById<TextView>(R.id.name7)
            txt = bname.text.toString()

            var aname = findViewById<TextView>(R.id.Aname7)
            atxt = aname.text.toString()
            qnt=7
        }

        b8.setOnClickListener{
            if(count8%2==0) {
                b8.setBackgroundResource(R.drawable.black_curved)
                btnissue.setVisibility(View.VISIBLE)
            }
            else {
                b8.setBackgroundResource(R.drawable.curved)
                btnissue.setVisibility(View.INVISIBLE)
            }
            count8++

            b1.setBackgroundResource(R.drawable.curved)
            b2.setBackgroundResource(R.drawable.curved)
            b3.setBackgroundResource(R.drawable.curved)
            b4.setBackgroundResource(R.drawable.curved)
            b5.setBackgroundResource(R.drawable.curved)
            b6.setBackgroundResource(R.drawable.curved)
            b7.setBackgroundResource(R.drawable.curved)
            b9.setBackgroundResource(R.drawable.curved)
            b10.setBackgroundResource(R.drawable.curved)

            count1=0
            count2=0
            count3=0
            count4=0
            count5=0
            count6=0
            count7=0
            count9=0
            count10=0

            var bname = findViewById<TextView>(R.id.name8)
            txt = bname.text.toString()

            var aname = findViewById<TextView>(R.id.Aname8)
            atxt = aname.text.toString()
            qnt=8
        }

        b9.setOnClickListener{
            if(count9%2==0) {
                b9.setBackgroundResource(R.drawable.black_curved)
                btnissue.setVisibility(View.VISIBLE)
            }
            else {
                b9.setBackgroundResource(R.drawable.curved)
                btnissue.setVisibility(View.INVISIBLE)
            }
            count9++


            b1.setBackgroundResource(R.drawable.curved)
            b2.setBackgroundResource(R.drawable.curved)
            b3.setBackgroundResource(R.drawable.curved)
            b4.setBackgroundResource(R.drawable.curved)
            b5.setBackgroundResource(R.drawable.curved)
            b6.setBackgroundResource(R.drawable.curved)
            b7.setBackgroundResource(R.drawable.curved)
            b8.setBackgroundResource(R.drawable.curved)
            b10.setBackgroundResource(R.drawable.curved)

            count1=0
            count2=0
            count3=0
            count4=0
            count5=0
            count6=0
            count7=0
            count8=0
            count10=0

            var bname = findViewById<TextView>(R.id.name9)
            txt = bname.text.toString()

            var aname = findViewById<TextView>(R.id.Aname9)
            atxt = aname.text.toString()
            qnt=9
        }

        b10.setOnClickListener{
            if(count10%2==0) {
                b10.setBackgroundResource(R.drawable.black_curved)
                btnissue.setVisibility(View.VISIBLE)
            }
            else {
                b10.setBackgroundResource(R.drawable.curved)
                btnissue.setVisibility(View.INVISIBLE)
            }
            count10++


            b1.setBackgroundResource(R.drawable.curved)
            b2.setBackgroundResource(R.drawable.curved)
            b3.setBackgroundResource(R.drawable.curved)
            b4.setBackgroundResource(R.drawable.curved)
            b5.setBackgroundResource(R.drawable.curved)
            b6.setBackgroundResource(R.drawable.curved)
            b7.setBackgroundResource(R.drawable.curved)
            b8.setBackgroundResource(R.drawable.curved)
            b9.setBackgroundResource(R.drawable.curved)

            count1=0
            count2=0
            count3=0
            count4=0
            count5=0
            count6=0
            count7=0
            count8=0
            count9=0
             var bname = findViewById<TextView>(R.id.name10)
             txt = bname.text.toString()

            var aname = findViewById<TextView>(R.id.Aname10)
            atxt = aname.text.toString()
             qnt=10
        }

        btnissue.setOnClickListener{






            when (qnt) {
                1 -> {
                    var qt = findViewById<TextView>(R.id.q1)
                    if(quan1==0){
                        Toast.makeText(this,"Book Not Available", Toast.LENGTH_SHORT).show()
                    }
                    else {
                        qt.setText("${--quan1}")

                        val intent = Intent(this,issuedBook::class.java);
                        intent.putExtra("BookImg", R.drawable.death)
                        intent.putExtra("BookName", txt)
                        intent.putExtra("AuthorName", atxt)
                        startActivity(intent)
                        Toast.makeText(this,"Book issues Scuucessfuly", Toast.LENGTH_SHORT).show()
                    }
                }
                2 -> {
                    var qt = findViewById<TextView>(R.id.q2)
                    if(quan2==0){
                        Toast.makeText(this,"Book Not Available", Toast.LENGTH_SHORT).show()
                    }
                    else {
                        qt.setText("${--quan2}")

                        val intent = Intent(this,issuedBook::class.java);
                        intent.putExtra("BookImg", R.drawable.atomic)
                        intent.putExtra("BookName", txt)
                        intent.putExtra("AuthorName", atxt)
                        startActivity(intent)
                        Toast.makeText(this,"Book issues Scuucessfuly", Toast.LENGTH_SHORT).show()
                    }
                }
                3 -> {
                    var qt = findViewById<TextView>(R.id.q3)
                    if(quan3==0){
                        Toast.makeText(this,"Book out of stock, choose another", Toast.LENGTH_SHORT).show()
                    }
                    else {
                        qt.setText("${--quan3}")

                        val intent = Intent(this,issuedBook::class.java);
                        intent.putExtra("BookImg", R.drawable.sapiens)
                        intent.putExtra("BookName", txt)
                        intent.putExtra("AuthorName", atxt)
                        startActivity(intent)
                        Toast.makeText(this,"Book issues Scuucessfuly", Toast.LENGTH_SHORT).show()
                    }
                }
                4 -> {
                    var qt = findViewById<TextView>(R.id.q4)
                    if(quan4==0){
                        Toast.makeText(this,"Book Not Available", Toast.LENGTH_SHORT).show()
                    }
                    else {
                        qt.setText("${--quan4}")

                        val intent = Intent(this,issuedBook::class.java);
                        intent.putExtra("BookImg", R.drawable.think)
                        intent.putExtra("BookName", txt)
                        intent.putExtra("AuthorName", atxt)
                        startActivity(intent)
                        Toast.makeText(this,"Book issues Scuucessfuly", Toast.LENGTH_SHORT).show()
                    }
                }
                5 -> {
                    var qt = findViewById<TextView>(R.id.q5)
                    if(quan5==0){
                        Toast.makeText(this,"Book Not Available", Toast.LENGTH_SHORT).show()
                    }
                    else {
                        qt.setText("${--quan5}")

                        val intent = Intent(this,issuedBook::class.java);
                        intent.putExtra("BookImg", R.drawable.rules)
                        intent.putExtra("BookName", txt)
                        intent.putExtra("AuthorName", atxt)
                        startActivity(intent)
                        Toast.makeText(this,"Book issues Scuucessfuly", Toast.LENGTH_SHORT).show()
                    }
                }
                6 -> {
                    var qt = findViewById<TextView>(R.id.q6)
                        if(quan6==0){
                            Toast.makeText(this,"Book Not Available", Toast.LENGTH_SHORT).show()
                        }
                        else {
                            qt.setText("${--quan6}")

                            val intent = Intent(this,issuedBook::class.java);
                            intent.putExtra("BookImg", R.drawable.dopamine)
                            intent.putExtra("BookName", txt)
                            intent.putExtra("AuthorName", atxt)
                            startActivity(intent)
                            Toast.makeText(this,"Book issues Scuucessfuly", Toast.LENGTH_SHORT).show()
                        }
                }
                7 -> {
                    var qt = findViewById<TextView>(R.id.q7)
                    if(quan7==0){
                        Toast.makeText(this,"Book Not Available", Toast.LENGTH_SHORT).show()
                    }
                    else {
                        qt.setText("${--quan7}")

                        val intent = Intent(this,issuedBook::class.java);
                        intent.putExtra("BookImg", R.drawable.ikigai)
                        intent.putExtra("BookName", txt)
                        intent.putExtra("AuthorName", atxt)
                        startActivity(intent)
                        Toast.makeText(this,"Book issues Scuucessfuly", Toast.LENGTH_SHORT).show()
                    }
                }
                8 -> {
                    var qt = findViewById<TextView>(R.id.q8)
                    if(quan8==0){
                        Toast.makeText(this,"Book Not Available", Toast.LENGTH_SHORT).show()
                    }
                    else {
                        qt.setText("${--quan8}")

                        val intent = Intent(this,issuedBook::class.java);
                        intent.putExtra("BookImg", R.drawable.rich)
                        intent.putExtra("BookName", txt)
                        intent.putExtra("AuthorName", atxt)
                        startActivity(intent)
                        Toast.makeText(this,"Book issues Scuucessfuly", Toast.LENGTH_SHORT).show()
                    }
                }
                9 -> {
                    var qt = findViewById<TextView>(R.id.q9)
                    if(quan9==0){
                        Toast.makeText(this,"Book Not Available", Toast.LENGTH_SHORT).show()
                    }
                    else {
                        qt.setText("${--quan9}")

                        val intent = Intent(this,issuedBook::class.java);
                        intent.putExtra("BookImg", R.drawable.aadi)
                        intent.putExtra("BookName", txt)
                        intent.putExtra("AuthorName", atxt)
                        startActivity(intent)
                        Toast.makeText(this,"Book issues Scuucessfuly", Toast.LENGTH_SHORT).show()
                    }
                }
                10 -> {
                    var qt = findViewById<TextView>(R.id.q10)
                    if(quan10==0){
                        Toast.makeText(this,"Book Not Available", Toast.LENGTH_SHORT).show()
                    }
                    else {
                        qt.setText("${--quan10}")

                        val intent = Intent(this,issuedBook::class.java);
                        intent.putExtra("BookImg", R.drawable.energies)
                        intent.putExtra("BookName", txt)
                        intent.putExtra("AuthorName", atxt)
                        startActivity(intent)
                        Toast.makeText(this,"Book issues Scuucessfuly", Toast.LENGTH_SHORT).show()
                    }
                }
            }


//            finish()

        }
        var logof = findViewById<ImageView>(R.id.logoff)

        logof.setOnClickListener{
            val editor = sharedPreferences.edit()
            editor.putString(is_login , "false")
            editor.commit()
            Toast.makeText(this, "Logout Successfull", Toast.LENGTH_SHORT).show()

            var intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
            finish()
        }


    }

}