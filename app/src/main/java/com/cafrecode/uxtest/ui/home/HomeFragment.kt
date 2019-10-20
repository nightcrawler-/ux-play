package com.cafrecode.uxtest.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cafrecode.uxtest.ContentFragment
import com.cafrecode.uxtest.R
import kotlinx.android.synthetic.main.card_footer.view.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_main, container, false)

        view.forward.setOnClickListener {
            ContentFragment.display(activity!!.supportFragmentManager)
        }

        return view.rootView
    }
}
