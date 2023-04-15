package com.challenge.qchallenge_mobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.challenge.qchallenge_mobile.screens.Authentication
import com.challenge.qchallenge_mobile.screens.SplashScreen
import com.challenge.qchallenge_mobile.ui.buttons.PrimaryFilledButton
import com.challenge.qchallenge_mobile.ui.buttons.PrimaryNoFilledButton
import com.challenge.qchallenge_mobile.ui.theme.PrimaryDark
import com.challenge.qchallenge_mobile.ui.theme.PrimaryYellow
import com.challenge.qchallenge_mobile.ui.theme.QChallengemobileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = PrimaryDark.toArgb()
        setContent {
            QChallengemobileTheme {
                Surface(
                   color = PrimaryDark,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Navigation()
                }
            }
        }
    }
}

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash_screen" ){
        composable("splash_screen"){
            SplashScreen(navController = navController)
        }
        composable("auth_screen"){
            Authentication()
        }

        composable("main_screen"){
            Box(modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            )
            {
                Text(text = "main screen", color = Color.White)
                Column() {
                    PrimaryFilledButton(
                        text = "Primary",
                        onClick = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .border(
                                width = 1.dp,
                                color = PrimaryYellow,
                                shape = RoundedCornerShape(60.dp)
                            ))
                    PrimaryNoFilledButton(
                        text = "No filled",
                        onClick = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .border(
                                width = 1.dp,
                                color = PrimaryYellow,
                                shape = RoundedCornerShape(10.dp)
                            ))
                }
            }
        }
    }
}
