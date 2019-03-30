package com.pllug.course

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity;
import android.util.Log
import kotlinx.android.synthetic.main.fragment_profile.*


class MainActivity : AppCompatActivity()  {
    var LOGTAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showProfile ()
    }

 private fun replaseFragment (fragment: Fragment)
 {
     var meneger = supportFragmentManager.beginTransaction()
     .replace(R.id.frame, fragment)
     .addToBackStack(null)
     .commit()

 }

    private fun showProfile ()
    {
        replaseFragment(ProfileFragment())
    }


}
