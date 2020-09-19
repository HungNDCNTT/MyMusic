package com.hungnd.mypromusic.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hungnd.mypromusic.R
import com.hungnd.mypromusic.model.AlbumsModel
import com.hungnd.mypromusic.model.SongModel
import java.util.ArrayList

class AlbumsAdapter(val dataAlbums: ArrayList<AlbumsModel>) :
    RecyclerView.Adapter<AlbumsAdapter.HungHolder>() {
    class HungHolder(view: View) : RecyclerView.ViewHolder(view) {
        val albumsAvt = view.findViewById<ImageView>(R.id.imv_albums_avt)
        val albumsName = view.findViewById<TextView>(R.id.tv_albums_name)
        val albumsArtist = view.findViewById<TextView>(R.id.tv_albums_aritst)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HungHolder {
        return HungHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.items_rcv_albums, parent, false)
        )
    }

    override fun onBindViewHolder(holder: HungHolder, position: Int) {
        val position = dataAlbums[position]
        holder.albumsAvt.setImageResource(position.imgAlbumsAvt)
        holder.albumsName.text = position.albumsName
        holder.albumsArtist.text = position.albumsArtist
    }

    override fun getItemCount(): Int {
        return dataAlbums.size
    }
}