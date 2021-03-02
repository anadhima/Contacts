package com.example.android.contacts

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.android.contacts.contacts.Contacts
import com.example.android.contacts.contacts.ContactsAdapter
import com.example.android.contacts.contacts.Interface
import kotlinx.android.synthetic.main.contacts_activity.*
import kotlinx.android.synthetic.main.contacts_row.*

class ContactsActivity : AppCompatActivity(), Interface {


    private lateinit var adapter: ContactsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contacts_activity)

        adapter = ContactsAdapter()
        adapter.setOnClickListener(this)
        contacts_recycler_view.layoutManager = LinearLayoutManager(this)
        contacts_recycler_view.adapter = adapter

        getContactsData()
    }

    private fun getContactsData() {

        val contactsList: List<Contacts> = listOf(

            Contacts(1, R.drawable.dubai_ana, "Ana", "Bluebell", ""),
            Contacts(2, R.drawable.dubai_ana, "Maria", "Bluebell", ""),
            Contacts(3, R.drawable.dubai_ana, "Makis", "Bluebell", "")


        )

        adapter.setContactsData(contactsList)
    }

    override fun onItemClicked(contacts: Contacts) {
        val intent = Intent(this, ProfileActivity::class.java)
        intent.putExtra("name", text_view_name.text.toString())
        startActivity(intent)
    }
}



