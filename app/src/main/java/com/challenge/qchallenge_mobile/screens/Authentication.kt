package com.challenge.qchallenge_mobile.screens


import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateIntAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.challenge.qchallenge_mobile.R
import com.challenge.qchallenge_mobile.ui.TranlateYImage

@Composable
fun Authentication(){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        TranlateYImage(target = 400)
            Login()

    }
}

@Composable
fun Login(){
//    val animatedHeight by animateIntAsState(targetValue = 40)
    Box(
        contentAlignment= Alignment.BottomCenter,
        modifier = Modifier
            .fillMaxSize()
    ){
        Box(
            modifier = Modifier
                .height(100.dp)
                .background(Color.White)
        ) {

        }
    }
}

