package com.example.superdex.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LoadingIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.room.util.TableInfo
import com.example.superdex.R
import com.example.superdex.ui.theme.Inter
import com.example.superdex.ui.theme.LocalAppColors
import com.example.superdex.ui.theme.SuperDexTheme

@Composable
fun Button(
    text: String,
    image: Int,
    modifier: Modifier = Modifier,

    ) {

    val buttonColor = Color.White
    val contentColor = Color.White

    Column(
        modifier = Modifier.padding()
            .background(LocalAppColors.current.cardFills),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedButton(
            onClick = {},
            modifier = modifier
                .height(60.dp)
                .width(90.dp),
            border = BorderStroke(1.dp, contentColor),
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = buttonColor,
                contentColor = contentColor,

                )
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = text,
                modifier = modifier
                    .padding(end = 8.dp)
                    .fillMaxWidth()
                    .background(LocalAppColors.current.tertiary),
//                alignment =Alignment.Center

            )

        }

        Text(
            text, style = MaterialTheme.typography.bodySmall,
            color = LocalAppColors.current.primary,
            textAlign = TextAlign.Center,
            fontFamily = Inter
        )

    }
}


@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)

@Composable
fun ButtonPreview() {
//    SuperDexTheme {
    Button(
        "Home",
        R.drawable.home,
    )
//    }
}