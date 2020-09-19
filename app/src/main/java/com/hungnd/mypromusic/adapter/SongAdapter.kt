package com.hungnd.mypromusic.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hungnd.mypromusic.R
import com.hungnd.mypromusic.model.SongModel
import java.util.ArrayList

class SongAdapter(val dataSong: ArrayList<SongModel>) :
    RecyclerView.Adapter<SongAdapter.HungHolder>() {
    class HungHolder(view: View) : RecyclerView.ViewHolder(view) {
        val songAvt = view.findViewById<ImageView>(R.id.imv_avt_songs)
        val tvSongName = view.findViewById<TextView>(R.id.tv_song_name)
        val tvSongArtist = view.findViewById<TextView>(R.id.tv_song_artist)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HungHolder {
        return HungHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.items_rcv_songs, parent, false)
        )
    }

    override fun onBindViewHolder(holder: HungHolder, position: Int) {
        val position = dataSong[position]
        holder.songAvt.setImageResource(position.imgSongAvt)
        holder.tvSongName.text = position.songName
        holder.tvSongArtist.text = position.artist
    }

    override fun getItemCount(): Int {
        return dataSong.size
    }
}