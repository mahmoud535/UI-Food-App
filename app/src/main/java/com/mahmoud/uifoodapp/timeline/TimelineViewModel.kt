package com.mahmoud.uifoodapp.timeline

import androidx.lifecycle.ViewModel
import com.mahmoud.uifoodapp.R

class TimelineViewModel : ViewModel() {

    fun getPosts(): List<SinglePost> {

        return arrayListOf<SinglePost>().apply {

            add(
                SinglePost(
                    authorName = "Charles",
                    authorPhoto = R.drawable.charles,
                    text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
                    photo = R.drawable.beef,
                )
            )


            add(
                SinglePost(
                    authorName = "Cesar",
                    authorPhoto = R.drawable.cesar,
                    text = "Hello World, This is first jetpack compose project",
                    photo = R.drawable.testy,
                )
            )

        }

    }

}