package com.example.dz15viewpager2practice

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(
    fragment: FragmentActivity,
    private val viewPadgerList:MutableList<OnBoardingFragmentViewModel>
) : FragmentStateAdapter(fragment)
{
    override fun getItemCount(): Int {
        return viewPadgerList.size
    }

    override fun createFragment(position: Int): Fragment {
        val fragment = VievPagerFragment()
        fragment.arguments = bundleOf("vp" to viewPadgerList[position])
        return fragment
    }


}