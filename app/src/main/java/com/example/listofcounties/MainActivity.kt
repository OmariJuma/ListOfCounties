package com.example.listofcounties

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val counties=arrayOf("1. Nairobi "," 2. Kajiado","3. Nakuru", "4. Taita Taveta","5. Kisumu","6.Isiolo","7. Marsabit","8. Isinya ","9. Kisumu","10. siaya ","11.Homabay","12. Eldoret ","13. Kisii","14. Uasin Gishu","15. Kitengela")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView=findViewById<ListView>(R.id.listView)
        val adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,counties)
        listView.adapter=adapter
        listView.onItemClickListener=
            AdapterView.OnItemClickListener { p0, p1, p2, p3 -> Toast.makeText(applicationContext,"Tapped County= "+counties[p2],Toast.LENGTH_LONG).show() }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mymenu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.rate->Toast.makeText(this,"Rate me!",Toast.LENGTH_LONG).show()
            R.id.share->Toast.makeText(this,"Please Share!",Toast.LENGTH_LONG).show()
            R.id.search->Toast.makeText(this,"Please search me",Toast.LENGTH_LONG).show()
            R.id.history->Toast.makeText(this,"my history!",Toast.LENGTH_LONG).show()
            R.id.town->Toast.makeText(this,"This is the town you selected!",Toast.LENGTH_LONG).show()



        }
        return super.onOptionsItemSelected(item)
    }
}