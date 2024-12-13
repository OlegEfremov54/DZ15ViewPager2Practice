package com.example.dz15viewpager2practice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignInFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_sign_in, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name = arguments?.getString("name")
        val password = arguments?.getString("password")

        val userNameSignInET = view.findViewById<EditText>(R.id.userNameSignInET)
        val userPasswordSignInET = view.findViewById<EditText>(R.id.userPasswordSignInET)
        val loginSignInButtonBTN = view.findViewById<Button>(R.id.loginSignInButtonBTN)

        loginSignInButtonBTN.setOnClickListener {
            if (name != userNameSignInET.text.toString() || password != userPasswordSignInET.text.toString()) {
                Toast.makeText(context, "Введены неверные пароль или логин", Toast.LENGTH_LONG)
                    .show()
                return@setOnClickListener
            } else {
                fragmentManager?.beginTransaction()?.replace(R.id.containerID, MainFragment())
                    ?.commit()
            }
        }
    }
}

