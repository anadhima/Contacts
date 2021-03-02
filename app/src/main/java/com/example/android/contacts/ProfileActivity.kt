package com.example.android.contacts

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.contacts_row.*

class ProfileActivity : AppCompatActivity() {

    var name: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        name = intent.getStringExtra("name")
        text_view_name?.text = name
    }
}
