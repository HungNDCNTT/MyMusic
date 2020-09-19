package com.hungnd.mypromusic.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hungnd.mypromusic.R
import com.hungnd.mypromusic.adapter.ArtistAdapter
import com.hungnd.mypromusic.model.ArtistModel
import java.util.ArrayList


class ArtistsFragment : Fragment() {

    private val dataArtist = ArrayList<ArtistModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_artists, container, false)
        initData()
        val rcvArtist = view.findViewById<RecyclerView>(R.id.rcv_artist)
        val adapter = ArtistAdapter(dataArtist)
        rcvArtist.layoutManager = LinearLayoutManager(activity)
        rcvArtist.adapter = adapter
        return view
    }

    private fun initData() {
        dataArtist.add(ArtistModel(R.drawable.ic_music_white, "<Unknown>", "Albums", "Songs"))
        dataArtist.add(ArtistModel(R.drawable.ic_music_white, "<Unknown>", "Albums", "Songs"))
        dataArtist.add(ArtistModel(R.drawable.ic_music_white, "<Unknown>", "Albums", "Songs"))
        dataArtist.add(ArtistModel(R.drawable.ic_music_white, "<Unknown>", "Albums", "Songs"))
        dataArtist.add(ArtistModel(R.drawable.ic_music_white, "<Unknown>", "Albums", "Songs"))
        dataArtist.add(ArtistModel(R.drawable.ic_music_white, "<Unknown>", "Albums", "Songs"))
        dataArtist.add(ArtistModel(R.drawable.ic_music_white, "<Unknown>", "Albums", "Songs"))
    }

}