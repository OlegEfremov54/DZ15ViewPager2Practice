package com.example.dz15viewpager2practice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText


class SignUpFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val userNameSignUpET = view.findViewById<EditText>(R.id.userNameSignUpET)
        val userPasswordSignUpET = view.findViewById<EditText>(R.id.userPasswordSignUpET)
        val loginSignUpButtonBTN = view.findViewById<Button>(R.id.loginSignUpButtonBTN)

    }



}