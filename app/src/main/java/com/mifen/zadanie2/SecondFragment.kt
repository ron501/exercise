package com.mifen.zadanie2

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController

class SecondFragment : Fragment(R.layout.fragment_second) {

    lateinit var controller: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        controller = findNavController()
        val button = view.findViewById<Button>(R.id.switchButton)
        button.setOnClickListener {
            controller.navigateUp()
        }
    }
}