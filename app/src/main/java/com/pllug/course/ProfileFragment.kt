package com.pllug.course

import android.app.Activity.RESULT_OK
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_profile.*



class ProfileFragment : Fragment(), View.OnClickListener {
    lateinit var tell: String
    var LOGTAG = "ProfileFragment"
    private  val REQUEST_CODE_IMAGE_GALLERY = 2
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
        avatar.setOnClickListener(this)
    }


    override fun onClick(v: View) {
        tell = telphon.text.toString ()
        Log.d(LOGTAG, "onClick working")
        when (v.id) {
            R.id.callt -> tell()
            R.id.sendmasseng -> sendMesseng()
            R.id.avatar  -> lookAvatar()
            R.id.city-> (activity as MainActivity).showDialog()
            R.id.cantry-> (activity as MainActivity).showDialog()
            R.id.telphon-> (activity as MainActivity).showDialog()
            R.id.city-> (activity as MainActivity).showDialog()
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

    private fun lookAvatar() {
        val RESULT_GALLERY = 0
        val galleryIntent = Intent(
            Intent.ACTION_PICK,
            android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
        )
        startActivityForResult(galleryIntent, RESULT_GALLERY)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == RESULT_OK)
        {
            Log.d(LOGTAG, "Result come")
            val setAvatar:Uri?
            setAvatar = data!!.data
            avatar.setImageURI(setAvatar)
        }
    }
}
