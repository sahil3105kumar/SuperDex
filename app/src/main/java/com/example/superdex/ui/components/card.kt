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

fun SuperheroCardUi(
    modifier: Modifier,
    img: Int,
    name: String,
    universe: String,

    ) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .heightIn(min = 60.dp, max = 120.dp)
            .background(LocalAppColors.current.tertiary),

        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Min)
                .background(LocalAppColors.current.tertiary)
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(16.dp)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = name, style = MaterialTheme.typography.titleMedium
                    .copy(
                        color = LocalAppColors.current.primary
                    )
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = universe, style = MaterialTheme.typography.bodyMedium
                    .copy(
                        color = LocalAppColors.current.primary
                    )
                )
            }

            Image(
                painter = painterResource( id = img), contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .width(60.dp)
                    .fillMaxHeight()
                    .padding(end = 8.dp),
                alignment = Alignment.CenterEnd

            )
        }
    }

}


@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun CardPreview() {
    SuperheroCardUi(
        Modifier.fillMaxWidth(),
        R.drawable.ironman,
        "Thor",
        "Marvel"
    )
}