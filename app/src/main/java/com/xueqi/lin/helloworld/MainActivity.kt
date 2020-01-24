package com.xueqi.lin.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total_count"

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun toastme(view: View){
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countme(view: View){
        // get the textview
        //val showCountTextView = findViewById<TextView>(R.id.textView)


        // get the value
        //val countString = showCountTextView.text.toString()
        val countString = textView.text.toString()


        var count = Integer.parseInt(countString)
        count++

        // dispoly the new value
        //showCountTextView.text = count.toString()
        textView.text = count.toString()

    }

    fun randomMe(view: View){

        //create an Inter to start to second activity

        var randomIntent = Intent( this, RandomActivity::class.java)

        // get the current count
        var countString = textView.text.toString()
        val count = Integer.parseInt(countString)

        // add the count to the extra for the intent
        randomIntent.putExtra(RandomActivity.TOTAL_COUNT,count)

        startActivity(randomIntent)


    }
}
