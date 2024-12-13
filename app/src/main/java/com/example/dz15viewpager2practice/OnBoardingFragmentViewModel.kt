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
                "От Чингисхана до Мамая",
                "Банк Империал - Сохраняя традиции",
                (R.drawable.ojidanie),
                true
            ),
            OnBoardingFragmentViewModel(
                "Надежное вложение средств",
                "Гарантии АСВ",
                (R.drawable.vojd),
                true
            ),
            OnBoardingFragmentViewModel(
                "Банк Империал",
                "Приглашаем к сотрудничеству",
                (R.drawable.kniaz),
                false
            )
        )
    }
}