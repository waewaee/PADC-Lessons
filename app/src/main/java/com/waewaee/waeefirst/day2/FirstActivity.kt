package com.waewaee.waeefirst.day2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.waewaee.waeefirst.R
import kotlinx.android.synthetic.main.day2_activity_first.*

class FirstActivity: AppCompatActivity() {

    companion object {
        val IE_DATA_TO_RETURN= "Data To Return"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.day2_activity_first)

        button.setOnClickListener {
//            Toast.makeText(this, "Welcome to PADC", Toast.LENGTH_SHORT).show()

//            val intent = Intent(this, SecondActivity::class.java)
//            startActivity(intent)
//
//            startActivity(SecondActivity.newIntent(this))

//            startActivity(SecondActivity.newIntent(this, "Hi! How are you?"))

            startActivityForResult(SecondActivity.newIntent(this, "Hi! How are you?"), 100)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 100 && resultCode == Activity.RESULT_OK && data != null) {
            val dataReturned = data.getStringExtra(IE_DATA_TO_RETURN)
            textView.text = dataReturned
        }
    }
}