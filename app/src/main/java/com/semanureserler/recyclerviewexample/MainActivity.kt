package com.semanureserler.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.semanureserler.recyclerviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val  kopeklerList= arrayListOf(
        KopekModel(R.drawable.kopek1,"kopek 1") ,
        KopekModel(R.drawable.kopek2,"kopek 2"),
        KopekModel(R.drawable.kopek3,"kopek 3"),

        KopekModel(R.drawable.kopek5,"kopek 5"),
        KopekModel(R.drawable.kopek6,"kopek 6"),
        KopekModel(R.drawable.kopek7,"kopek 7")


        )

        val kopeklerAdapter = KopeklerAdapter(kopeklerList =kopeklerList)
        binding.kopeklerRecyclerView.layoutManager=LinearLayoutManager(applicationContext,LinearLayoutManager.VERTICAL,false)
            //LinearLayoutManager(applicationContext,LinearLayoutManager.VERTICAL,false)
        binding.kopeklerRecyclerView.adapter=kopeklerAdapter
        binding.kopeklerRecyclerView.setHasFixedSize(true)

    }
}