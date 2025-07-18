package com.example.superdex.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superdex.R
import com.example.superdex.ui.theme.LocalAppColors
import com.example.superdex.ui.theme.SuperDexTheme


@Composable
fun BottomBarButton(
    text: String,
    img: Int,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.background(LocalAppColors.current.cardFills)
    ) {
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = LocalAppColors.current.buttonFills, // background color
//                contentColor = LocalAppColors.current.onPrimary // text/icon color
            ),
            modifier = Modifier
                .height(60.dp)
                .width(85.dp)

        ) {
            Image(
                painter = painterResource(img),
                contentDescription = "ButtonImage",
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
                    .background(LocalAppColors.current.buttonFills)
            )
        }

        Text(text = text, style = typography.bodyMedium)

    }

}

@Composable
fun BottomNavigationBarUi() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(LocalAppColors.current.cardFills),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.Bottom
    ) {
        BottomBarButton("Home", R.drawable.home)
        BottomBarButton("Heroes", R.drawable.heroes)

        BottomBarButton("Fav", R.drawable.fav)
        BottomBarButton("Settings", R.drawable.settings)
    }

}

@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)

@Composable
fun BottomNavigationBarPreview() {
    SuperDexTheme {
        BottomNavigationBarUi()
    }
}