package com.example.android.contacts.contacts

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.android.contacts.R

class ContactsAdapter : RecyclerView.Adapter<ContactsViewHolder>() {

    private var contactsList: List<Contacts> = emptyList()
    private var listener: Interface? = null

    fun setOnClickListener(listener: Interface) {
        this.listener = listener
    }

    fun setContactsData(list: List<Contacts>) {
        this.contactsList = list

    }

    override fun getItemCount(): Int {
        return contactsList.size

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ContactsViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.contacts_row, viewGroup, false)
        return ContactsViewHolder(view, listener)
    }


    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val contacts = contactsList[position]
        holder.bind(contacts)
    }
}

interface Interface {
    fun onItemClicked(contacts: Contacts)
}
