package com.example.musicacompose.ui.theme.components

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.musicacompose.R


class TopBar {

    @SuppressLint("NotConstructor")
    @Composable
    fun DrawPortraitTopBar() {
        Row(
            Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(30.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.down_chevron_9144316),
                contentDescription = "go-back",
                Modifier.size(20.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.more_5703560),
                contentDescription = "go-back",
                Modifier.size(20.dp)
            )
        }
    }
}