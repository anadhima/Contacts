package com.example.android.contacts.contacts

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.contacts_row.view.*

class ContactsViewHolder(private val view: View, private val listener: Interface?) : RecyclerView.ViewHolder(view) {


    fun bind(contacts: Contacts) {

        view.contact_id.text = contacts.id.toString()
        view.text_view_name.text = contacts.name
        view.text_view_last_name.text = contacts.lastName
        // view.text_view_description.text= contacts.description
        view.image_view_photo.setImageResource(contacts.photo)

        view.setOnClickListener {
            listener?.onItemClicked(contacts)
        }

    }
}