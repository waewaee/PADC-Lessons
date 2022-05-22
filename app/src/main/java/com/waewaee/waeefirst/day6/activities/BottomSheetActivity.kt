package com.waewaee.waeefirst.day6.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.waewaee.waeefirst.R
import com.waewaee.waeefirst.day4.UIHomeworkActivity
import kotlinx.android.synthetic.main.day6_activity_bottom_sheet.*

class BottomSheetActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, BottomSheetActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.day6_activity_bottom_sheet)

        val sheet: BottomSheetBehavior<View> = BottomSheetBehavior.from(bottomSheet)
//        sheet.peekHeight = 64
//        sheet.isHideable = false

        btnShowSheet.setOnClickListener {
            when {
                sheet.state != BottomSheetBehavior.STATE_EXPANDED -> {
                    sheet.state = BottomSheetBehavior.STATE_EXPANDED
                }
                else -> {
                    sheet.state = BottomSheetBehavior.STATE_COLLAPSED
                }
            }
        }
    }
}