package com.pllug.course

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment

class AuthorizationActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.authorization_layout)
         stsrtMainActiviti()
    }





    fun stsrtMainActiviti()
    {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun replaceFragment (fragment: Fragment)
    {
        supportFragmentManager.beginTransaction().
            replace(R.id.frameAuthorization, fragment).
            addToBackStack(null).
            commit()
    }

    fun raddeFragment (fragment: Fragment)
    {
        supportFragmentManager.beginTransaction().
            add(R.id.frameAuthorization, fragment).
            addToBackStack(null).
            commit()
    }


}
