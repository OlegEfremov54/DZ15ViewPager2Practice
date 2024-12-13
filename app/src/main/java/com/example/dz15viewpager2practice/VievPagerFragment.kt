package com.example.dz15viewpager2practice

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts


class VievPagerFragment : Fragment() {
    private var check= true

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_viev_pager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val avtor_viewPagerTV: TextView = view.findViewById(R.id.avtor_viewPagerTV)
        val pic_viewPagerTV: TextView = view.findViewById(R.id.pic_viewPagerTV)
        val startBTN:Button = view.findViewById(R.id.startButtonBTN)
        val viewPagerIV: ImageView = view.findViewById(R.id.viewPagerIV)

        val viewPagerItem = arguments?.getSerializable("vp") as OnBoardingFragmentViewModel
        check = viewPagerItem.checkButton
        avtor_viewPagerTV.text = viewPagerItem.avtor
        pic_viewPagerTV.text = viewPagerItem.title
        viewPagerIV.setImageResource(viewPagerItem.imageView)
        if (!check){
            startBTN.visibility= View.VISIBLE
            startBTN.setOnClickListener{
                startActivity(Intent(activity,StartActivity::class.java))
            }
        }
    }
}