package com.example.fannypresidentlist

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class AdapterPres(
    private val context: Activity,
    private val name: Array<String>,
    private val deskripsi: Array<String>,
    private val iconpres: Array<Int>)
    : ArrayAdapter<String>(context, R.layout.scnlayout, name) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.scnlayout, null, true)
        val titleText = rowView.findViewById(R.id.name) as TextView
        val imageView = rowView.findViewById(R.id.iconpresiden) as ImageView

        titleText.text = name[position]
        imageView.setImageResource(iconpres[position])

        return rowView
    }
}