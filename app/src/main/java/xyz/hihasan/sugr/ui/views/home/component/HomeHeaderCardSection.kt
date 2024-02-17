package xyz.hihasan.sugr.ui.views.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.CalendarMonth
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import xyz.hihasan.sugr.R
import xyz.hihasan.sugr.ui.theme.colorPrimary
import xyz.hihasan.sugr.ui.theme.colorWhite

@Composable
fun HomeHeaderCardSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(181.dp)
            .shadow(
                elevation = 16.dp,
                spotColor = Color(0x26000000),
                ambientColor = Color(0x26000000)
            )

            .background(color = colorPrimary, shape = RoundedCornerShape(size = 16.dp))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Today's Eaten",
                    style = TextStyle(
                        fontSize = 18.sp,
                        lineHeight = 26.sp,
                        fontFamily = FontFamily(Font(R.font.sf_pro_text)),
                        fontWeight = FontWeight(600),
                        color = Color(0xFFF7F7F7),
                    )
                )

                Row(
                    modifier = Modifier
                        .width(146.dp)
                        .height(30.dp)
                        .background(
                            color = Color(0x1FFFFFFF),
                            shape = RoundedCornerShape(size = 20.dp)
                        )
                        .padding(start = 12.dp, top = 6.dp, end = 12.dp, bottom = 6.dp),
                    horizontalArrangement = Arrangement.spacedBy(6.dp, Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Icon(
                        imageVector = Icons.Outlined.CalendarMonth,
                        contentDescription = null,
                        tint = colorWhite
                    )

                    Text(
                        text = "Nov 23, 2023",
                        style = TextStyle(
                            fontSize = 12.sp,
                            lineHeight = 16.sp,
                            fontFamily = FontFamily(Font(R.font.sf_pro_text)),
                            fontWeight = FontWeight(400),
                            color = Color(0xFFFFFFFF),
                        )
                    )
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp, bottom = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "24 Gl Of",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 22.sp,
                        fontFamily = FontFamily(Font(R.font.sf_pro_text)),
                        fontWeight = FontWeight(500),
                        color = colorWhite,
                    )
                )

                Text(
                    text = "68 Gl",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 22.sp,
                        fontFamily = FontFamily(Font(R.font.sf_pro_text)),
                        fontWeight = FontWeight(400),
                        color = colorWhite,
                    ),
                    modifier = Modifier.padding(start = 6.dp)
                )
            }

            Text(
                text = "Progress",

                // Body Text/Inter/Regular/12
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 16.sp,
                    fontFamily = FontFamily(Font(R.font.sf_pro_text)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFFFFFFFF),
                )
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 4.dp, bottom = 17.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.Start),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Box(modifier = Modifier.fillMaxWidth(0.8f).height(4.dp).background(colorWhite))
                Text(
                    text = "38%",
                    // Body Text/Inter/Medium/14
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 22.sp,
                        fontFamily = FontFamily(Font(R.font.sf_pro_text)),
                        fontWeight = FontWeight(500),
                        color = Color(0xFFFFFFFF),
                    ),
                    modifier = Modifier.padding(start = 10.dp)
                )
            }

            Row(
                modifier = Modifier
                    .width(87.dp)
                    .height(28.dp)
                    .background(color = Color(0x1FFFFFFF), shape = RoundedCornerShape(size = 20.dp))
                    .padding(start = 12.dp, top = 6.dp, end = 12.dp, bottom = 6.dp),
                horizontalArrangement = Arrangement.spacedBy(6.dp, Alignment.Start),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "40 Gl left",

                    // Body Text/Inter/Regular/12
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        fontFamily = FontFamily(Font(R.font.sf_pro_text)),
                        fontWeight = FontWeight(400),
                        color = Color(0xFFFFFFFF),
                    )
                )
            }
        }

    }
}