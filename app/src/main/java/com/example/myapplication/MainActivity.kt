package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


//        a?b() means-----
//        if(a != null){
//            a.b()
//        }

//        a!!b() means----
//        if(a == null){
//            throw nullPointerException;
//        }
//        else{
//            a.b()
//        }
        binding.button.setOnClickListener(View.OnClickListener{
            Toast.makeText(this@MainActivity,"Hello,",Toast.LENGTH_SHORT).show()
        })
//        for a temp commit
    }
}