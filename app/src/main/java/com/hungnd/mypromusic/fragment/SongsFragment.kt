package com.hungnd.mypromusic.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.hungnd.mypromusic.R
import com.hungnd.mypromusic.adapter.SongAdapter
import com.hungnd.mypromusic.model.SongModel
import java.util.*


class SongsFragment : Fragment() {

    private val dataSong = ArrayList<SongModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_songs, container, false)
        val rcvSong = view?.findViewById<RecyclerView>(R.id.rcv_songs)
        val adapter = SongAdapter(dataSong)
        initData()
        rcvSong?.addItemDecoration(
            DividerItemDecoration(
                activity,
                DividerItemDecoration.VERTICAL
            )
        )
        rcvSong?.adapter = adapter
        return view
    }

    private fun initData() {
        dataSong.add(SongModel(R.drawable.ic_music_white, "Stronger", "<Unknown>"))
        dataSong.add(SongModel(R.drawable.ic_music_white, "Stronger", "<Unknown>"))
        dataSong.add(SongModel(R.drawable.ic_music_white, "Stronger", "<Unknown>"))
        dataSong.add(SongModel(R.drawable.ic_music_white, "Stronger", "<Unknown>"))
        dataSong.add(SongModel(R.drawable.ic_music_white, "Stronger", "<Unknown>"))
        dataSong.add(SongModel(R.drawable.ic_music_white, "Stronger", "<Unknown>"))
        dataSong.add(SongModel(R.drawable.ic_music_white, "Stronger", "<Unknown>"))
        dataSong.add(SongModel(R.drawable.ic_music_white, "Stronger", "<Unknown>"))

    }


}