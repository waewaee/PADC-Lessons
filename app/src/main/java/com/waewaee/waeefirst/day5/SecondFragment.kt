package com.waewaee.waeefirst.day5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.snackbar.Snackbar
import com.waewaee.waeefirst.R
import kotlinx.android.synthetic.main.day5_fragment_second.view.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.day5_fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.btnSecondFragment.setOnClickListener {
            Snackbar.make(view, "This is second fragment", Snackbar.LENGTH_SHORT).show()
        }
    }

}