package com.example.musicacompose.ui.theme.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.musicacompose.R
import com.example.musicacompose.changeButtonIcon

class SongControls {

    @Composable
    fun DrawPortraitSongControls() {
        var icon by remember { mutableIntStateOf(R.drawable.play_12052806) }

        Row() {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp, start = 57.dp, end = 57.dp)
                    .height(110.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.shuffle_9637489),
                    contentDescription = "song-cover",
                    Modifier.size(30.dp)
                )
                Image(
                    painter = painterResource(R.drawable.back_7881760),
                    contentDescription = "song-cover",
                    Modifier.size(30.dp)
                )
                IconButton(
                    onClick = { icon = changeButtonIcon(icon) },
                    modifier = Modifier.size(70.dp),
                    content = {
                        Icon(
                            painter = painterResource(icon),
                            contentDescription = "play",
                        )
                    }
                )
                Image(
                    painter = painterResource(R.drawable.next_7881819),
                    contentDescription = "song-cover",
                    Modifier.size(30.dp)
                )
                Image(
                    painter = painterResource(R.drawable.repeat_8944334),
                    contentDescription = "song-cover",
                    Modifier.size(30.dp)
                )
            }
        }
    }

    @Composable
    fun DrawLandscapeSongControls() {
        var icon by remember { mutableIntStateOf(R.drawable.play_12052806) }

        Row() {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 57.dp, end = 57.dp)
                    .height(110.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.shuffle_9637489),
                    contentDescription = "song-cover",
                    Modifier.size(30.dp)
                )
                Image(
                    painter = painterResource(R.drawable.back_7881760),
                    contentDescription = "song-cover",
                    Modifier.size(30.dp)
                )
                IconButton(
                    onClick = { icon = changeButtonIcon(icon) },
                    modifier = Modifier.size(70.dp),
                    content = {
                        Icon(
                            painter = painterResource(icon),
                            contentDescription = "play",
                        )
                    }
                )
                Image(
                    painter = painterResource(R.drawable.next_7881819),
                    contentDescription = "song-cover",
                    Modifier.size(30.dp)
                )
                Image(
                    painter = painterResource(R.drawable.repeat_8944334),
                    contentDescription = "song-cover",
                    Modifier.size(30.dp)
                )
            }
        }
    }
}
