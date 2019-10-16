package com.example.fannypresidentlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val namepresiden = arrayOf<String>(
        "Ir. Soekarno",
        "Soeharto",
        "BJ. Habibie",
        "Abdurahman Wahid",
        "Megawati Soekarno Putri",
        "Susilo Bambang Yudhoyono",
        "Joko Widodo"
    )
    val deskripsi= arrayOf<String>(
        "Bapak Proklamasi",
        "Bapak Pembangunan",
        "Disebut sebagai Mr.Crack oleh para insiyur pesawat",
        "Penhapus peraturan orde baru",
        "Presiden wanita pertama Indonesia",
        "Presiden 2 periode",
        "Identik dengan blusukan"
    )
    val iconpres = arrayOf<Int>(
        R.drawable.soekarno,
        R.drawable.suharto,
        R.drawable.habibi,
        R.drawable.gusdur,
        R.drawable.megawati,
        R.drawable.susilo,
        R.drawable.jokowi
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapterpres = AdapterPres(this,namepresiden,deskripsi,iconpres)
        itempresident.adapter = adapterpres

        itempresident.setOnItemClickListener() { adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(this, "${namepresiden[position]} " +
                    "Jabatannya diketahui  ${deskripsi[position]}",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}
