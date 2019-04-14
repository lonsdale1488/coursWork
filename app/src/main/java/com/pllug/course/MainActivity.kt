package com.pllug.course

import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity;


class MainActivity : AppCompatActivity()  {
    var LOGTAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showProfile ()
        showDialog()
    }

 private fun replaseFragment (fragment: Fragment)
 {
     supportFragmentManager.beginTransaction()
     .replace(R.id.frame, fragment)
     .addToBackStack(null)
     .commit()

 }

     fun showProfile ()
    {
        replaseFragment(ProfileFragment())
    }

     fun showDialog()
    {
        val dialogFragment = IDialogFragment()
        dialogFragment.show(supportFragmentManager, "tag")
    }
}
