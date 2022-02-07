package com.example.roomvmodelinteraction

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.roomvmodelinteraction.databinding.FragmentSleepTrackerBinding


class SleepTrackerFragment : Fragment() {
    private var binding:FragmentSleepTrackerBinding ? = null
    private var adapter:SleepAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_sleep_tracker, container, false)

        return binding?.root
    }

}