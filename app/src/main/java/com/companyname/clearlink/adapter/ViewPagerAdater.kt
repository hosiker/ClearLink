package com.companyname.clearlink.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.companyname.clearlink.ContactListFragment
import com.companyname.clearlink.MyPageFragment
import com.companyname.clearlink.model.Tabs

class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    private val fragments = ArrayList<Tabs>()

    init {
        // 뷰페이저에 넣을 프래그먼트
        fragments.add(
            Tabs(ContactListFragment(), "Contact")
        )
        fragments.add(
            Tabs(MyPageFragment(), "MyPage")
        )
    }
    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position].fragment
    }

    fun getTitle(position: Int): String {
        return fragments[position].title
    }
}