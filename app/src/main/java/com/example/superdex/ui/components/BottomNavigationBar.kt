package com.example.superdex.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.tooling.preview.Preview
import com.example.superdex.R
import com.example.superdex.ui.theme.SuperDexTheme
import java.nio.file.WatchEvent

open class NavigationItem( val icon: Int, val title: String){
    object Home: NavigationItem( R.drawable.home, "Home")
    object Heroes: NavigationItem( R.drawable.heroes, "Music")
    object Fav: NavigationItem( R.drawable.fav, "Movies")
    object Settings: NavigationItem( R.drawable.settings, "Books")

}




@Composable
fun BottomNavigationBar(){
   Row(
       modifier = Modifier
           .fillMaxWidth(),
//       horizontalArrangement = Arrangement.SpaceAround
   ){
        Button("Home", R.drawable.home)
        Button("Heroes", R.drawable.heroes)
        Button("Fav", R.drawable.fav)
        Button("Settings", R.drawable.settings)
   }

}

@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)

@Composable
fun BottomNavigationBarPreview(){
//    SuperDexTheme {
        BottomNavigationBar()
//    }
}