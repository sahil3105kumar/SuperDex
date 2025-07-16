package com.example.superdex.ui.screens

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superdex.ui.components.TopBarUi
import com.example.superdex.ui.theme.LocalAppColors
import com.example.superdex.ui.theme.SuperDexTheme

@Composable
fun HomeScreenUi() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 16.dp, end = 16.dp)
            .background(LocalAppColors.current.background)
    ) {
        TopBarUi()



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