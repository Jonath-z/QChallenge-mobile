package com.challenge.qchallenge_mobile.ui.buttons

import android.view.View.OnClickListener
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.challenge.qchallenge_mobile.ui.theme.PrimaryYello
import com.challenge.qchallenge_mobile.ui.theme.SecondaryDark

@Composable
fun PrimaryFilledButton(text: String, onClick: OnClickListener, modifier: Modifier){
    Button(
        onClick = { onClick },
        colors = ButtonDefaults.buttonColors(PrimaryYello),
        modifier = modifier
    ) {
        Text(
            text = text,
            color = Color.White,
            fontSize = 20.sp
        )
    }
}

@Composable
fun PrimaryNoFilledButton(text: String, onClick: OnClickListener, modifier: Modifier){
    Button(
        onClick = { onClick },
        colors = ButtonDefaults.buttonColors(SecondaryDark),
        modifier = modifier
    ) {
        Text(text = text,fontSize = 20.sp, color = Color.White)
    }
}
