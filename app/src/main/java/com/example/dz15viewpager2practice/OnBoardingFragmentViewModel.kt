package com.example.dz15viewpager2practice

import java.io.Serializable

class OnBoardingFragmentViewModel(
    val title:String,
    val avtor:String,
    val imageView: Int,
    val checkButton:Boolean
    ):
    Serializable {
    companion object{
        val viewPagerList = mutableListOf(
            OnBoardingFragmentViewModel(
                "Ожидание",
                "Васильев К.",
                (R.drawable.ojidanie),
                true
            ),
            OnBoardingFragmentViewModel(
                "Вождь",
                "Васильев К.",
                (R.drawable.vojd),
                true
            ),
            OnBoardingFragmentViewModel(
                "Князь",
                "Васильев К.",
                (R.drawable.kniaz),
                false
            )
        )
    }
}