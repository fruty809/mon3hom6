package com.example.mon3hom6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MusicAdapter(val MusicList: ArrayList<MusicModel>,
                   val Onclick: (position: Int) -> Unit

): RecyclerView.Adapter <MusicAdapter.MusicViewHolder>() {






    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        return MusicViewHolder(MusicitemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int {
        return  MusicList.size
    }

    inner class MusicViewHolder(private val binding: MusicitemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind() {

            val item = MusicList[adapterPosition]
            binding.musicName.text = item.musicName
            binding.musicNumber.text = item.musicNumber
            binding.musicArtist.text = item.musicArtist

            itemView.setOnClickListener{
                Onclick
            }

        }

    }


}