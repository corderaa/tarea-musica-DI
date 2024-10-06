package com.example.musicacompose.ui.theme.components

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.musicacompose.R

class SongInfo {

    @SuppressLint("NotConstructor")
    @Composable
    fun DrawPortraitSongInfo() {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(top = 46.dp, start = 57.dp, end = 57.dp)
                .height(60.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.dislike_3570004),
                contentDescription = "song-cover",
                Modifier.size(28.dp)
            )
            Text(text = "Matte Black", fontSize = 30.sp, fontWeight = FontWeight.Bold)
            Image(
                painter = painterResource(R.drawable.likegesture_3569999),
                contentDescription = "song-cover",
                Modifier.size(28.dp)
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .height(30.dp)
                .padding(start = 57.dp, end = 57.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "\$uicideboy$", fontSize = 18.sp)
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(top = 25.dp, start = 57.dp, end = 57.dp)
        ) {
            LinearProgressIndicator(
                trackColor = Color.LightGray,
                progress = 0.75f,
                color = Color.Black,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }

    @SuppressLint("NotConstructor")
    @Composable
    fun DrawLandscapeSongInfo() {
        Column(Modifier.fillMaxWidth()) {
            Row(
                Modifier
                    .padding(top = 46.dp, start = 57.dp, end = 57.dp)
                    .height(60.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.dislike_3570004),
                    contentDescription = "song-cover",
                    Modifier.size(28.dp)
                )
                Text(text = "Matte Black", fontSize = 30.sp, fontWeight = FontWeight.Bold)
                Image(
                    painter = painterResource(R.drawable.likegesture_3569999),
                    contentDescription = "song-cover",
                    Modifier.size(28.dp)
                )
            }
            Row(
                Modifier
                    .height(30.dp)
                    .padding(start = 57.dp, end = 57.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = "\$uicideboy$", fontSize = 18.sp)
            }
            Row(
                Modifier
                    .padding(top = 25.dp, start = 57.dp, end = 57.dp)
                    .fillMaxWidth()
            ) {
                LinearProgressIndicator(
                    trackColor = Color.LightGray,
                    progress = 0.75f,
                    color = Color.Black,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }

    }
}