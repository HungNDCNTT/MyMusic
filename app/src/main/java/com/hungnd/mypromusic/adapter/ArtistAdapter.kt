package com.hungnd.mypromusic.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hungnd.mypromusic.R
import com.hungnd.mypromusic.model.AlbumsModel
import com.hungnd.mypromusic.model.ArtistModel
import com.hungnd.mypromusic.model.SongModel
import java.util.ArrayList

class ArtistAdapter(val dataArtist: ArrayList<ArtistModel>) :
    RecyclerView.Adapter<ArtistAdapter.HungHolder>() {
    class HungHolder(view: View) : RecyclerView.ViewHolder(view) {
        val artistAvt = view.findViewById<ImageView>(R.id.imv_artist_avt)
        val artistName = view.findViewById<TextView>(R.id.tv_artist_name)
        val artistAlbums = view.findViewById<TextView>(R.id.tv_artist_albums)
        val artistSongs = view.findViewById<TextView>(R.id.tv_artist_songs)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HungHolder {
        return HungHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.items_rcv_artist, parent, false)
        )
    }

    override fun onBindViewHolder(holder: HungHolder, position: Int) {
        val position = dataArtist[position]
        holder.artistAvt.setImageResource(position.imgArtistAvt)
        holder.artistName.text = position.artistName
        holder.artistAlbums.text = position.artistAlbums
        holder.artistSongs.text = position.artistSongs
    }

    override fun getItemCount(): Int {
        return dataArtist.size
    }
}