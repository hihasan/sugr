package xyz.hihasan.sugr.ui.views.home.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import xyz.hihasan.sugr.R
import xyz.hihasan.sugr.ui.theme.colorAsh
import xyz.hihasan.sugr.ui.theme.colorBlack

@Composable
fun HeaderSection() {
    Column (modifier = Modifier.padding(bottom = 20.dp)){
        Text(
            text = "Good Morning",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 22.sp,
                fontFamily = FontFamily(Font(R.font.sf_pro_text)),
                fontWeight = FontWeight(400),
                color = colorAsh,
            )
        )

        Text(
            text = "Omar Calzoni",

            // Body Text/Inter/Semi Bold/16
            style = TextStyle(
                fontSize = 16.sp,
                lineHeight = 22.sp,
                fontFamily = FontFamily(Font(R.font.sf_pro_text)),
                fontWeight = FontWeight(600),
                color = colorBlack,
            )
        )
    }
}