package com.companyname.clearlink

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.companyname.clearlink.adapter.ViewPagerAdapter
import com.companyname.clearlink.databinding.MainActivityBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityBinding

    private val viewPagerAdapter by lazy {
        ViewPagerAdapter(this)
    }

    private val tabIcon = arrayListOf(
        R.drawable.ic_contact_list,
        R.drawable.ic_mypage
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Viewpager 어댑터 설정
        binding.viewPager2.adapter = viewPagerAdapter



        // 탭레이아웃, 뷰페이저 합치기
        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, position ->
            tab.setText(viewPagerAdapter.getTitle(position))
            tab.setIcon(tabIcon[position])
        }.attach()

    }
}