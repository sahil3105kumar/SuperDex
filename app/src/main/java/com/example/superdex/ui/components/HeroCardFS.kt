package com.example.superdex.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superdex.R
import com.example.superdex.ui.theme.LocalAppColors

@Composable
fun HeroCardFSUi(
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(1.dp)
            .background(LocalAppColors.current.tertiary),

        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(LocalAppColors.current.tertiary)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(IntrinsicSize.Min)
                    .background(LocalAppColors.current.tertiary)

            ) {
                SuperheroCardUi(
                    Modifier.fillMaxWidth(),
                    R.drawable.heroes,
                    "Thor",
                    "Marvel"

                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(LocalAppColors.current.tertiary),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Top

            ) {
                Text(
                    text = "BackStory", style = MaterialTheme.typography.bodyLarge
                        .copy(
                            color = LocalAppColors.current.primary
                        )
                )

            }

            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .height(IntrinsicSize.Min)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    Text(
                        text = "stats", style = MaterialTheme.typography.bodyLarge
                            .copy(
                                color = LocalAppColors.current.primary
                            )
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Power", style = MaterialTheme.typography.bodyMedium
                            .copy(
                                color = LocalAppColors.current.primary
                            )
                    )
                }
            }
        }

    }

}

@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun HeroCardFSUiPreview() {
    HeroCardFSUi()
}