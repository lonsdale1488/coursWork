package com.pllug.course

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class AuthorizationActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.authorization_layout)

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }




//          val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))
//            startActivity(intent)




}
