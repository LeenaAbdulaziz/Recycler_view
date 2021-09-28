package com.example.week5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var names = mutableListOf("Amal", "Amed", "Hayat", "Ragad", "Emmanuel", "Mmedara", "Ranjith")
        var clRoot: ConstraintLayout
        val myRecyclerView = findViewById<RecyclerView>(R.id.rvMain)
        clRoot = findViewById(R.id.clRoot)
        myRecyclerView.adapter = RecycleViewAdapter(names)
        myRecyclerView.layoutManager = LinearLayoutManager(this)

        val text = findViewById<EditText>(R.id.addname)
        val addButton = findViewById<Button>(R.id.button)
        addButton.setOnClickListener {
            //names.add(text.text.toString())
        val meg = text.text.toString()
            if(meg.isNotEmpty()){
                names.add(meg)
                text.text.clear()
                text.clearFocus()
            } else {
                Snackbar.make(clRoot, "Please enter some text", Snackbar.LENGTH_LONG).show()
            }

        }
        }
    }
