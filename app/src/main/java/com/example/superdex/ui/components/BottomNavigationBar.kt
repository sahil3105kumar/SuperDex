package com.example.superdex.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superdex.R
import com.example.superdex.ui.theme.LocalAppColors

open class NavigationItem( val icon: Int, val title: String){
    object Home: NavigationItem( R.drawable.home, "Home")
    object Heroes: NavigationItem( R.drawable.ironman, "Music")
    object Fav: NavigationItem( R.drawable.fav, "Movies")
    object Settings: NavigationItem( R.drawable.settings, "Books")

}




@Composable
fun BottomNavigationBarUi(){
   Row(
       modifier = Modifier
           .fillMaxSize()
           .height(100.dp)
           .background(LocalAppColors.current.buttonFills),
       horizontalArrangement = Arrangement.SpaceAround,
       verticalAlignment = Alignment.Bottom
   ){
        Button("Home", R.drawable.home)
        Button("Heroes", R.drawable.ironman)
        Button("Fav", R.drawable.fav)
        Button("Settings", R.drawable.settings)
   }

}

@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)

@Composable
fun BottomNavigationBarPreview(){
//    SuperDexTheme {
        BottomNavigationBarUi()
//    }
}