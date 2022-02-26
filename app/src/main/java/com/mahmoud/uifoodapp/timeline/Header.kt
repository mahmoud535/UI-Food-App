package com.mahmoud.uifoodapp.timeline

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoud.uifoodapp.R
import com.mahmoud.uifoodapp.theme.iconsBackground
import com.mahmoud.uifoodapp.timeline.ui.theme.purple500


@Composable
fun Header() {

    TopAppBar(
        backgroundColor = Color.White,
        title = {
            Text(
                text = "LOGO",
                color = Color.Red,
                fontSize = 25.sp,
                //fontStyle = drawable.button_background,
                //style = androidx.compose.ui.text.TextStyle(drawable.button_background),
                // style = androidx.compose.ui.text.TextStyle(color = Color.Red)
            )

        },

        actions = {

            IconButton(
                onClick = {},
                modifier = Modifier
                    .size(36.dp)
                    .clip(CircleShape)
                    .background(iconsBackground)

            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_round_search_24),
                    contentDescription = "",
                    tint = Color.Black,
                )
            }

            Spacer(modifier = Modifier.padding(start = 8.dp))

            IconButton(
                onClick = {},
                modifier = Modifier
                    .size(36.dp)
                    .clip(CircleShape)
                    .background(iconsBackground)

            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_round_notifications_24),
                    contentDescription = "",
                    tint = Color.Black,
                )
            }

            Spacer(modifier = Modifier.padding(start = 8.dp))

            IconButton(
                onClick = {},
                modifier = Modifier
                    .size(36.dp)
                    .clip(CircleShape)
                    .background(iconsBackground)

            ) {
                Icon(
                    painter = painterResource(R.drawable.shopping_cart_24),
                    contentDescription = "",
                    tint = Color.Black,

                    )
            }

            Spacer(modifier = Modifier.padding(start = 8.dp))

        },


        )


    TabsLayout()
}




@Composable
fun TabsLayout() {

    val selectedTabIndex = remember { mutableStateOf(0) }



    val indicator = @Composable { tabPositions: List<TabPosition> ->
        TabRowDefaults.Indicator(
            color = colorResource(R.color.purple_500),
            modifier = Modifier.tabIndicatorOffset(tabPositions[selectedTabIndex.value])
        )
    }

    TabRow(
        selectedTabIndex = selectedTabIndex.value,
        indicator = indicator,
        backgroundColor = Color.White

    ) {



        Tab(
            selected = false,
            onClick = { selectedTabIndex.value = 0 },
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_round_home_24),
                contentDescription = "",
                modifier = Modifier.padding(16.dp),
                tint = if (selectedTabIndex.value == 0) purple500 else Color.Gray,
            )
        }


        Tab(selected = false, onClick = { selectedTabIndex.value = 1 }) {
            Icon(
                painter = painterResource(R.drawable.ic_baseline_fastfood_24),
                contentDescription = "",
                modifier = Modifier.padding(16.dp),
                tint = if (selectedTabIndex.value == 1) purple500 else Color.Gray,
            )
        }

        Tab(selected = false, onClick = { selectedTabIndex.value = 2 }) {
            Icon(
                painter = painterResource(R.drawable.ic_baseline_discount_24),
                contentDescription = "",
                modifier = Modifier.padding(16.dp),
                tint = if (selectedTabIndex.value == 2) purple500 else Color.Gray,
            )
        }

        Tab(selected = false, onClick = { selectedTabIndex.value = 3 }) {
            Icon(
                painter = painterResource(R.drawable.ic_baseline_people_24), contentDescription = "",
                modifier = Modifier.padding(16.dp),
                tint = if (selectedTabIndex.value == 3) purple500 else Color.Gray,
            )
        }

        Tab(selected = false, onClick = { selectedTabIndex.value = 4 }) {
            Icon(
                painter = painterResource(R.drawable.ic_baseline_person_24), contentDescription = "",
                modifier = Modifier.padding(16.dp),
                tint = if (selectedTabIndex.value == 4) purple500 else Color.Gray,
            )
        }
    }


}


// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
