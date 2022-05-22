package com.waewaee.waeefirst.day4

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog
import com.waewaee.waeefirst.R
import kotlinx.android.synthetic.main.day4_activity_main2.*
import java.util.*
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.day4_activity_main2)

//        tvHello.text = getString(R.string.greeting)
//        imageView.setImageResource(R.drawable.pic1)

        btnSayHi.setOnClickListener {
            val name = etName.text.toString()
            Toast.makeText(this, "Hello, $name", Toast.LENGTH_SHORT).show()
        }

        val images = intArrayOf(
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5
        )

        btnRandom.setOnClickListener {
            val randomIndex = Random.nextInt(0, images.size)
            ivGreetingImage.setImageResource(images[randomIndex])
        }

        btnCheckFruit.setOnClickListener {
            var selectedFruit = ""
            if (cbApple.isChecked) {
                selectedFruit = getString(R.string.cb_apple)
            }

            if (cbOrange.isChecked) {
                selectedFruit += " ${getString(R.string.cb_orange)}"
            }

            if (cbBanana.isChecked) {
                selectedFruit += " ${getString(R.string.cb_banana)}"
            }

            val alertDialog = AlertDialog.Builder(this).create()
            alertDialog.setTitle(getString(R.string.fruit_alert_dialog_title))
            alertDialog.setMessage("Your selected fruits: $selectedFruit")
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                DialogInterface.OnClickListener { dialog, which -> dialog.dismiss() })
            alertDialog.show()
        }

        rbMale.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                Toast.makeText(this, getString(R.string.rb_male), Toast.LENGTH_SHORT).show()
            }
        }

        rbFemale.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                Toast.makeText(this, getString(R.string.rb_female), Toast.LENGTH_SHORT).show()
            }
        }

        tbLight.setOnCheckedChangeListener { compoundButton, b ->
            when {
                b -> {
                    Toast.makeText(this, "Turning on the guest room light", Toast.LENGTH_SHORT)
                        .show()
                }
                else -> {
                    Toast.makeText(this, "Turning off the guest room light", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        }

        swtDoorLock.setOnCheckedChangeListener { compoundButton, b ->
            when {
                b -> {
                    Toast.makeText(this, "Locking the door", Toast.LENGTH_SHORT).show()
                }
                else -> {
                    Toast.makeText(this, "Unlocking the door", Toast.LENGTH_SHORT).show()
                }
            }
        }

        sbBrightness.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
//                p0?.progress = p1
                Toast.makeText(this@MainActivity2, "Progress: $p1", Toast.LENGTH_SHORT).show()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
//                Toast.makeText(this@MainActivity2, "Progress: ${p0?.progress}", Toast.LENGTH_SHORT).show()
            }

        })

        rbRating.setOnRatingBarChangeListener { ratingBar, fl, b ->
            Toast.makeText(this, "Rating: $fl", Toast.LENGTH_SHORT).show()
        }

        val drinksAdapter: ArrayAdapter<String?> = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            resources.getStringArray(R.array.additional_drinks)
        )
        actvDrinks.setAdapter(drinksAdapter)

        btnSelectDate.setOnClickListener {
            val calendar = Calendar.getInstance()
            val day = calendar[Calendar.DAY_OF_MONTH]
            val month = calendar[Calendar.MONTH]
            val year = calendar[Calendar.YEAR]

            val picker = DatePickerDialog(
                this,
                { view, year, month, dayOfMonth ->
                    tvSelectedDate.text = "Date: $dayOfMonth/${month + 1}/ $year"
                },
                day,
                month,
                year
            )
            picker.show()
        }

        btnSelectTime.setOnClickListener {
            val calendar= Calendar.getInstance()
            val hour = calendar[Calendar.HOUR_OF_DAY]
            val minutes = calendar[Calendar.MINUTE]

            val picker = TimePickerDialog(this,
//                android.R.style.Theme_Holo_Light_Dialog,
                { view, hourOfDay, minute ->
                    tvSelectedTime.text = "Time: $hourOfDay : $minute"
                },
                hour,
                minutes,
                false)
//            picker.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            picker.show()
        }

        btnUIHomeWorkActivity.setOnClickListener {
            startActivity(UIHomeworkActivity.newIntent(this))
        }

        btnViewGroupActivity.setOnClickListener {
            startActivity(ViewGroupActivity.newIntent(this))
        }

        btnAppCompatComponentsActivity.setOnClickListener {
            startActivity(AppCompatComponentsActivity.newIntent(this))
        }

    }
}