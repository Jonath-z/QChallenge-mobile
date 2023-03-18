package com.challenge.qchallenge_mobile.ui

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.res.painterResource
import com.challenge.qchallenge_mobile.R

@Composable
fun TranlateYImage(target: Int){
        val offsetY = remember { androidx.compose.animation.core.Animatable(0f) }

        Image(painter = painterResource(id = R.drawable.qchallenge_logo),
            contentDescription = "Splash logo",
        )

}