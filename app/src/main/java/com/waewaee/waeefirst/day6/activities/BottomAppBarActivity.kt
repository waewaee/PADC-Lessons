package com.waewaee.waeefirst.day6.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.waewaee.waeefirst.R
import com.waewaee.waeefirst.day4.UIHomeworkActivity
import kotlinx.android.synthetic.main.day6_activity_bottom_app_bar.*

class BottomAppBarActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, BottomAppBarActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.day6_activity_bottom_app_bar)

        setSupportActionBar(bab)

        fab.setOnClickListener {
            Toast.makeText(this, "Notifications On!", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_bottom_nav, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.actionHome -> Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
            R.id.actionProfile-> Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show()
            R.id.actionNotifications -> Toast.makeText(this, "Notifications", Toast.LENGTH_SHORT).show()
            else -> super.onOptionsItemSelected(item)
        }
        return true
    }


}