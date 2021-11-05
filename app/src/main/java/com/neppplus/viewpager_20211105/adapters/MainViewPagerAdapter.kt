package com.neppplus.viewpager_20211105.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.viewpager_20211105.fragments.HelloFragment
import com.neppplus.viewpager_20211105.fragments.IntroduceFragment
import com.neppplus.viewpager_20211105.fragments.NameFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {


//    함수의 결과가 한줄(계산식 포함)로 끝나면, = 로 결과 대입 가능.
    override fun getCount() = 3

    override fun getItem(position: Int): Fragment {

        return when(position) {
            0 -> HelloFragment()
            1 -> NameFragment()
            else -> IntroduceFragment()
        }

    }
}