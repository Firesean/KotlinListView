package com.example.tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.ListAdapter as ListAdapter1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val shows = arrayOf("Ted Talk", "SuperNatural", "Lucifer", "Pokemon", "Yu-Gi-Oh", "Starwars")


        // Sets itself to the Main Activity Application and its expected contents
        val theAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, shows)
        // Sets a list to be displayed
        val theListView = findViewById<ListView>(R.id.theListView)
        // Sets the list's adapter
        theListView.adapter = theAdapter

        // For each item in the list set a command
        theListView.setOnItemClickListener(AdapterView.OnItemClickListener { adapterView, view, i, l ->  val tvShowPicked:String = "You selected ${adapterView.getItemAtPosition(i).toString()}"
        Toast.makeText(this, tvShowPicked, Toast.LENGTH_SHORT).show()})
    }
}