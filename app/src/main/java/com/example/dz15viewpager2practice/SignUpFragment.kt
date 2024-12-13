package com.example.dz15viewpager2practice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


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
        loginSignUpButtonBTN.setOnClickListener{
            val userNameSignUp = userNameSignUpET.text.toString()
            val userPasswordSignUp = userPasswordSignUpET.text.toString()
            if (userPasswordSignUp.isEmpty() || userNameSignUp.isEmpty()){
                Toast.makeText(context,"Данные не введены",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            val bundle = Bundle()
            val signInFragment = SignInFragment()
            bundle.putString("name", userNameSignUp)
            bundle.putString("password", userPasswordSignUp)
            signInFragment.arguments= bundle
            fragmentManager?.beginTransaction()?.replace(R.id.containerID, signInFragment)?.commit()
            Toast.makeText(context,"Вы успешно зарегистрированы",Toast.LENGTH_LONG).show()


        }

    }



}