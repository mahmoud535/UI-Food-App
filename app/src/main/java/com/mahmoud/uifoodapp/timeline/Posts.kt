package com.mahmoud.uifoodapp.timeline

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoud.uifoodapp.R
import com.mahmoud.uifoodapp.theme.softGray


@Composable
fun Post(singlePost: SinglePost) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp)
            .background(Color.White)
    ) {

        Row(modifier = Modifier.padding(8.dp)) {


            Card(
                shape = CircleShape,
                modifier = Modifier
                    .width(45.dp),
                backgroundColor = Color.Gray
            ) {
                Image(
                    painter = painterResource(id = singlePost.authorPhoto),
                    contentDescription = null
                )
            }

            Column(modifier = Modifier.padding(start = 16.dp), verticalArrangement = Arrangement.Center) {

                Row (verticalAlignment = Alignment.CenterVertically) {
                    Text(text = singlePost.authorName, fontWeight = FontWeight.Bold)
                    Icon(
                        painter = painterResource(R.drawable.sale),
                        contentDescription = null,
                        modifier = Modifier.width(14.dp),
                        tint = Color.Blue
                    )
                }
                Row (verticalAlignment = Alignment.CenterVertically){

                    Text(text = "2 days ago ", color = Color.Gray, fontSize = 13.sp)
//                    Icon(
//                        painter = painterResource(R.drawable.sale),
//                        contentDescription = null,
//                        modifier = Modifier.width(14.dp),
//                        tint = Color.Blue
//                    )
                }

            }

        }

        if (!singlePost.text.isNullOrBlank()) {
            Text(text = singlePost.text, modifier = Modifier.padding(8.dp))
        }

        if (singlePost.photo != null) {
            Spacer(modifier = Modifier.padding(8.dp))
            Image(
                painter = painterResource(id = singlePost.photo),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth()
            )
        }


        Divider(
            color = softGray,
            thickness = 0.5.dp,
            modifier = Modifier.padding(start = 8.dp, end = 8.dp)
        )

        PostActionsSection()


    }

}


@Composable
fun PostActionsSection() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp)
    ) {

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.weight(0.33f),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
            elevation = ButtonDefaults.elevation(0.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_like),
                contentDescription = null,
                modifier = Modifier.width(33.dp)
            )
            Text(text = "Like", color = Color.Gray)
        }


        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.weight(0.33f),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
            elevation = ButtonDefaults.elevation(0.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_comment),
                contentDescription = null,
                modifier = Modifier.width(33.dp)
            )
            Text(text = "Comment", color = Color.Gray)
        }


        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.weight(0.33f),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
            elevation = ButtonDefaults.elevation(0.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_share),
                contentDescription = null,
                modifier = Modifier.width(35.dp)
            )
            Text(text = "Share", color = Color.Gray)
        }

    }

}


data class SinglePost(
    val id: Long = System.currentTimeMillis(),
    val authorName: String,
    val authorPhoto: Int,
    val text: String? = null,
    val photo: Int? = null,
    val timestamp: Long = System.currentTimeMillis(),
)

