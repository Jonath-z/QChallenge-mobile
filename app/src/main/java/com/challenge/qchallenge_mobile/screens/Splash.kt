package com.challenge.qchallenge_mobile.screens

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.challenge.qchallenge_mobile.R
import kotlinx.coroutines.delay

@Composable
fun Logo( modifier: Modifier = Modifier.scale(1f)){
    Image(painter = painterResource(id = R.drawable.qchallenge_logo),
        contentDescription = "Splash logo",
        modifier = modifier
    )
}

@Composable
fun SplashScreen(navController: NavController){
    val scale = remember{
        Animatable(0f)
    }

    LaunchedEffect(key1 = true){
        scale.animateTo(targetValue = 1f, animationSpec = tween(
            durationMillis = 500,
            easing = {
                OvershootInterpolator(2f).getInterpolation(it)
            }
        ))
        delay(3000L)
        navController.navigate("auth_screen")
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Logo(modifier = Modifier.scale(scale.value))
//        Image(painter = painterResource(id = R.drawable.qchallenge_logo),
//            contentDescription = "Splash logo",
//            modifier = Modifier.scale(scale.value)
//        )
    }
}