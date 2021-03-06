package com.example.messageshareapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.messageshareapp.R
import com.example.messageshareapp.showToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            showToast("Button was clicked")
        }

        btnSendMsgToNextActivity.setOnClickListener {
            val message: String = setUserMessage.text.toString()
            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("user_message", message)
            startActivity(intent)
        }

        btnShareToOtherApps.setOnClickListener{

            val message: String = setUserMessage.text.toString()
            var intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Share to"))
        }

        btnRecyclerViewDemo.setOnClickListener {
            val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }
    }
}