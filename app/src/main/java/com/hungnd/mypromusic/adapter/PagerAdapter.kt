package com.hungnd.mypromusic.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.hungnd.mypromusic.fragment.AlbumsFragment
import com.hungnd.mypromusic.fragment.ArtistsFragment
import com.hungnd.mypromusic.fragment.SongsFragment


class PagerAdapter internal constructor(fragmentManager: FragmentManager?) :
    FragmentStatePagerAdapter(fragmentManager!!) {
    override fun getItem(position: Int): Fragment {
        var frag: Fragment? = null
        when (position) {
            0 -> frag = SongsFragment()
            1 -> frag = AlbumsFragment()
            2 -> frag = ArtistsFragment()
        }
        return frag!!
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        var title = ""
        when (position) {
            0 -> title = "SONGS"
            1 -> title = "ALBUMS"
            2 -> title = "ARTIST"
        }
        return title
    }
}