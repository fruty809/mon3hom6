package com.example.mon3hom6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var list = arrayListOf<MusicModel>()
    val data = R.id.music_name
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadData()
        val adapter = MusicAdapter(list,this::onClick)
        binding.recycle.adapter = adapter

        supportFragmentManager.beginTransaction().add(R.id.music_image,MusicImage()).commit()



    }
    private fun onClick(position:Int){
        intent.putExtra("Name",data.toString())
        val intent = Intent(this, ActivityMain2Binding::class.java)
        startActivity(intent)

    }

    private fun loadData() {
        list.add(MusicModel("1","Sweater Weather","Neighborhood"))
        list.add(MusicModel("2","After Dark","Mr.Kitty"))
        list.add(MusicModel("3","Perfect girl","Mareux"))
        list.add(MusicModel("4","Smell like a teen spirit","Nirvana"))
        list.add(MusicModel("5","Monster","Skillet"))
        list.add(MusicModel("6","ka&tro","In Essens"))
        list.add(MusicModel("7","Im still standing","Elton John"))
        list.add(MusicModel("8","Moog  City","C418"))
        list.add(MusicModel("9","Minecraft","C418"))
        list.add(MusicModel("10","Deftones","Change( in the house of Flies)"))
    }


}