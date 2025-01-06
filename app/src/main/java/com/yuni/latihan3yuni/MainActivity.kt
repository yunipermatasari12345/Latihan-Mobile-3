package com.yuni.latihan3yuni

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private  lateinit var  btnRelative : Button
    private lateinit var btnTable : Button
    private lateinit var btnFrame : Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState   )
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnRelative = findViewById(R.id.btnRelative)
        btnTable=findViewById(R.id.btnTable)
        btnFrame=findViewById(R.id.btnFrame)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnRelative.setOnClickListener()
        {
            val intentMenu2 = Intent(this@MainActivity,RelativeActivity::class.java)
            startActivity(intentMenu2)
        }


        btnFrame.setOnClickListener()
        {
            val intentMenu2 = Intent(this@MainActivity,FrameActivity::class.java)
            startActivity(intentMenu2)
        }

        btnTable.setOnClickListener()
        {
            val intentMenu2 = Intent(this@MainActivity,TableActivity::class.java)
            startActivity(intentMenu2)
        }

    }
}