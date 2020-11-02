package com.example.messageshareapp.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.messageshareapp.R
import com.example.messageshareapp.showToast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? =  intent.extras
        val msg = bundle!!.getString("user_message")

        showToast(msg!!)
        txvUserMessage.text = msg
    }
}