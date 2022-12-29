package com.example.mon3hom6

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MusicName : Fragment() {
    private lateinit var binding: FragmentMusicNameBinding

    private var list = arrayListOf<MusicModel>()
    val data = R.id.music_name
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {


        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMusicNameBinding.inflate(layoutInflater)
        return binding.root

    }



}
