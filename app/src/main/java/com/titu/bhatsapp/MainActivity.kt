package com.titu.bhatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var UserArrayList:ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView=findViewById<RecyclerView>(R.id.recycler)
        recyclerView.layoutManager= LinearLayoutManager(this, LinearLayoutManager.VERTICAL,true)
        val Username = arrayOf("Radha","Rashi","Sakshi","Arpita","jhanwi","Astha","Divya","Anisha","Siya","khushi")
        val Pfp = intArrayOf(R.drawable.css1,R.drawable.figma1,R.drawable.firebase1,R.drawable.js1,R.drawable.k1,R.drawable.reactjs1,R.drawable.github,R.drawable.html,R.drawable.mongodb,R.drawable.nodejs)
        val Lstmess = arrayOf("call krr","sorry yrr","mujhse ni hoga","bhej rahi huin","hello","kuch bhi pgl","tumse na ek baat karni thi","sukriya sukriya","pata hai aaj kya huwa?","rakhi bandhwa lo")
        val Lsttime = arrayOf("5:30 AM","4:30 PM","5:30 AM","4:30 PM","5:30 AM","4:30 PM","5:30 AM","4:30 PM","5:30 AM","4:30 PM")

        UserArrayList=ArrayList()


        for (i in Username.indices)
        {
            val user = User(Pfp[i],Username[i],Lstmess[i],Lsttime[i])
            UserArrayList.add(user)
        }

        recyclerView.adapter=MyAdapter(this,UserArrayList)
    }
}