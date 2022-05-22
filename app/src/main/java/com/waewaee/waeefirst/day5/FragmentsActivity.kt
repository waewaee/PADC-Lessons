package com.waewaee.waeefirst.day5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.waewaee.waeefirst.R

class FragmentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.day5_activity_fragments)

//        supportFragmentManager.beginTransaction()
//            .add(R.id.fragmentContainerFirst, SecondFragment())
//            .add(R.id.fragmentContainerSecond, FirstFragment())
//            .commit()

        supportFragmentManager.commit {
            add<SecondFragment>(R.id.fragmentContainerFirst)
            add<FirstFragment>(R.id.fragmentContainerSecond)
        }
    }
}