package com.hungnd.mypromusic.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hungnd.mypromusic.R
import com.hungnd.mypromusic.adapter.AlbumsAdapter
import com.hungnd.mypromusic.model.AlbumsModel
import java.util.ArrayList


class AlbumsFragment : Fragment() {
    private val dataAlbums = ArrayList<AlbumsModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_albums, container, false)
        initData()
        val rcvAlbums = view?.findViewById<RecyclerView>(R.id.rcv_albums)
        val adapter = AlbumsAdapter(dataAlbums)
        rcvAlbums?.layoutManager = GridLayoutManager(activity, 3)
        rcvAlbums?.adapter = adapter
        return view
    }

    private fun initData() {
        dataAlbums.add(AlbumsModel(R.drawable.ic_radio, "Music", "<UnKnow>"))
        dataAlbums.add(AlbumsModel(R.drawable.ic_radio, "Music", "<UnKnow>"))
        dataAlbums.add(AlbumsModel(R.drawable.ic_radio, "Music", "<UnKnow>"))
        dataAlbums.add(AlbumsModel(R.drawable.ic_radio, "Music", "<UnKnow>"))
        dataAlbums.add(AlbumsModel(R.drawable.ic_radio, "Music", "<UnKnow>"))
        dataAlbums.add(AlbumsModel(R.drawable.ic_radio, "Music", "<UnKnow>"))
        dataAlbums.add(AlbumsModel(R.drawable.ic_radio, "Music", "<UnKnow>"))
        dataAlbums.add(AlbumsModel(R.drawable.ic_radio, "Music", "<UnKnow>"))
    }

}