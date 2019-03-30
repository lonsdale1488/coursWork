package com.pllug.course

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.TextUtils
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_profile.*


class ProfileFragment : Fragment(), View.OnClickListener {
    lateinit var tell: String
    var LOGTAG = "ProfileFragment"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onResume() {
        InitLisener()
        super.onResume()
    }


    private fun InitLisener() {
        callt.setOnClickListener(this)
        sendmasseng.setOnClickListener(this)
    }


    override fun onClick(v: View) {
        tell = telphon.text.toString ()
        Log.d(LOGTAG, "onClick working")
        when (v.id) {
            R.id.callt -> tell()
            R.id.sendmasseng -> sendMesseng()

            }
        }

    private fun tell() {
        Log.d(LOGTAG, " tell working")
        val intentPhone = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", tell, null))
        startActivity(intentPhone)
    }

    private fun sendMesseng() {
        val intentSms = Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + tell))
        startActivity(intentSms)
    }

}
