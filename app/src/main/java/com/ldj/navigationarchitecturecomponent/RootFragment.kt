package com.ldj.navigationarchitecturecomponent

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_root.*

class RootFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_root, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        route1Button.setOnClickListener { v ->
            v.findNavController().navigate(R.id.action_rootFragment_to_r1_1Fragment)
        }
        route2Button.setOnClickListener { v ->
            v.findNavController().navigate(R.id.action_rootFragment_to_r2_1Fragment)
        }
    }
}
