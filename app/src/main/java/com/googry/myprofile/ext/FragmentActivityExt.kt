package com.googry.myprofile.ext

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import com.googry.myprofile.R

internal fun FragmentActivity.addFragment(fragment: Fragment) {
    supportFragmentManager.beginTransaction()
            .add(R.id.content_frame, fragment)
            .commit()
}

internal fun FragmentActivity.replaceFragment(fragment: Fragment) {
    supportFragmentManager.popBackStack()
    supportFragmentManager.beginTransaction()
            .replace(R.id.content_frame, fragment)
            .commit()
}