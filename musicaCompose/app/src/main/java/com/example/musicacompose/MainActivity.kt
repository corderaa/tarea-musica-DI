package com.example.musicacompose

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicacompose.ui.theme.MusicaComposeTheme
import com.example.musicacompose.ui.theme.components.SongControls
import com.example.musicacompose.ui.theme.components.SongImage
import com.example.musicacompose.ui.theme.components.SongInfo
import com.example.musicacompose.ui.theme.components.TopBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MusicaComposePreview()
        }
    }
}

@Preview(
    showSystemUi = true,
    device = "spec:width=448dp,height=998dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape"
)
@Composable
fun MusicaComposePreview() {
    MusicaComposeTheme {
        val configuration = LocalConfiguration.current
        when (configuration.orientation) {
            Configuration.ORIENTATION_LANDSCAPE -> {
                LandscapeScreen()
            }

            else -> {
                PortraitScreen()
            }
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun PortraitScreen() {

    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        TopBar().DrawPortraitTopBar()

        SongImage().DrawPortraitSongImage()
        SongInfo().DrawPortraitSongInfo()

        SongControls().DrawPortraitSongControls()
    }
}

@Composable
fun LandscapeScreen() {
    Column(Modifier.height(400.dp)) {
        TopBar().DrawPortraitTopBar()
        Row (Modifier.fillMaxWidth()){
            SongImage().DrawLandscapeSongImage()
            Column {
                Row {
                    SongInfo().DrawLandscapeSongInfo()
                }
                Row {
                    SongControls().DrawLandscapeSongControls()
                }
            }
        }
    }
}

fun changeButtonIcon(icon: Int): Int {
    return if (icon == R.drawable.play_12052806) {
        R.drawable.pause_4349515
    } else {
        R.drawable.play_12052806
    }
}