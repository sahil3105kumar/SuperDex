package com.example.superdex.ui.screens

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superdex.ui.components.BottomNavigationBarUi
import com.example.superdex.ui.components.HeroCardFSUi
import com.example.superdex.ui.components.TopBarUi
import com.example.superdex.ui.theme.LocalAppColors
import com.example.superdex.ui.theme.SuperDexTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import com.example.superdex.ui.components.Button
import com.example.superdex.R

@Composable
fun HomeScreenUi() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 16.dp, end = 16.dp)
    ) {


        Scaffold(

            modifier = Modifier.fillMaxSize()
                .background(LocalAppColors.current.background),

            topBar = {
                TopBarUi()
            },
            bottomBar = {
                BottomAppBar(
                    modifier = Modifier.padding(0.dp)
                ) {
                    BottomNavigationBarUi()
                }
            },


            ) { innerPadding ->

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
            ) {

                item{

                    Text("Categories",
                        style = MaterialTheme.typography.titleLarge,
                        color = LocalAppColors.current.primary)
                    LazyRow(
                        modifier = Modifier.fillMaxWidth()
                            .height(100.dp)
                    ){

                    }
                }
            }




        }


    }
}


@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun DashboardScreenPreview() {
    SuperDexTheme {
        HomeScreenUi()
    }
}