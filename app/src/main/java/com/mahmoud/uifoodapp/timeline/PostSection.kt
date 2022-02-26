package com.mahmoud.uifoodapp.timeline

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.mahmoud.uifoodapp.R
import com.mahmoud.uifoodapp.theme.softGray


@Composable
fun PostSection() {

    Column(modifier = Modifier.background(Color.White)) {


        ConstraintLayout(
            modifier = Modifier
                .fillMaxWidth()
        ) {

            val (image, text) = createRefs()



            Image(
                painter = painterResource(R.drawable.me),
                contentDescription = "",
                modifier = Modifier
                    .constrainAs(image) {
                        linkTo(parent.top, parent.bottom, 16.dp, 16.dp)
                        start.linkTo(parent.start, margin = 16.dp)
                    }
                    .width(38.dp)
                    .clip(CircleShape)

            )


            Text(
                text = stringResource(R.string.Share_your_food_experiences),
                color = Color.Gray,
                modifier = Modifier
                    .constrainAs(text) {
                        start.linkTo(image.end, margin = 16.dp)
                        end.linkTo(parent.end, margin = 16.dp)
                        top.linkTo(image.top)
                        bottom.linkTo(image.bottom)
                        width = Dimension.fillToConstraints
                    }
                    .border(width = 1.dp, color = softGray, shape = CircleShape)
                    .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp),
                fontSize = 16.sp

            )
//            Button(onClick = {}, shape = CutCornerShape(10)) {
//                Text(text = "Cut corner shape")
//            }
        }


        Divider(color = softGray, thickness = 1.dp)

    }
}

