package com.example.musicacompose.ui.theme.components

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.musicacompose.R

class SongImage {

    @SuppressLint("NotConstructor")
    @Composable
    fun DrawPortraitSongImage() {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(top = 70.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(R.drawable.song_cover_1),
                contentDescription = "song-cover",
                Modifier.size(350.dp)
            )
        }
    }

    @SuppressLint("NotConstructor")
    @Composable
    fun DrawLandscapeSongImage() {
        Column{
            Image(
                painter = painterResource(R.drawable.song_cover_1),
                contentDescription = "song-cover",
                Modifier.size(350.dp)
            )
        }
    }
}