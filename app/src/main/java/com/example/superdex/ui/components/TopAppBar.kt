package com.example.superdex.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superdex.ui.theme.LocalAppColors

@Composable
fun TopBar(
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 32.dp)
    ) {
        Text(
            text = stringResource(com.example.superdex.R.string.app_name),
            style = MaterialTheme.typography.displayMedium.copy(
                fontFamily = FontFamily.Default,
                color = LocalAppColors.current.textColor
            ),
            modifier = Modifier.align(Alignment.Center)
        )


    }
}

@Preview
@Composable
fun TopAppBarPreview() {
    TopBar()
}
