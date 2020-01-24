package com.xueqi.lin.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_random.*
import java.util.*

class RandomActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total_count"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)
        showRandomNumber()
    }

    fun showRandomNumber(){
        // get count from the extra
        var count = intent.getIntExtra(TOTAL_COUNT,0)

        var random = Random()


        var randomInt = 0

        // add one because the bound is exclusive
        if(count>0){
            randomInt = random.nextInt(count+1)

        }

        // display
        textView2.text = Integer.toString(randomInt)

        // update the headling

        textView_lable.text = getString(R.string.random_number,count)
    }
}
