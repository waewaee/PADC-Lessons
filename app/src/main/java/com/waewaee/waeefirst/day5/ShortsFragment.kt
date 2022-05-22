package com.waewaee.waeefirst.day5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.waewaee.waeefirst.R
import kotlinx.android.synthetic.main.day5_fragment_shorts.view.*

class ShortsFragment : Fragment() {

    companion object {
        const val KEY_SHORTS_DESCRIPTION = "KEY_SHORTS_DESCRIPTION"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.day5_fragment_shorts, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle: Bundle? =  arguments.takeIf {
            it?.containsKey(KEY_SHORTS_DESCRIPTION) ?: false }
        view.tvShortsDescription.text = bundle?.getString(KEY_SHORTS_DESCRIPTION) ?: ""
    }

}