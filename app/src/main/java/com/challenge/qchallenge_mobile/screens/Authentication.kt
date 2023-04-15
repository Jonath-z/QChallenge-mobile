package com.challenge.qchallenge_mobile.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.challenge.qchallenge_mobile.ui.buttons.PrimaryFilledButton
import com.challenge.qchallenge_mobile.ui.inputs.TextInput
import com.challenge.qchallenge_mobile.ui.theme.PrimaryYellow

@Composable
fun Authentication(){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
            Login();
    }
}

@Preview()
@Composable
fun Login(){
   val (emailValue , setEmailValue) = remember {mutableStateOf("")}
   val (passwordValue, setPasswordValue)  = remember {mutableStateOf("")}

    fun onLogin(){
        println("logged in")
    }

    Box(
        contentAlignment= Alignment.Center,
        modifier = Modifier
            .fillMaxSize()

    ){

        Column (
            modifier = Modifier
                .wrapContentSize()
                .align(Alignment.CenterEnd)
                .background(Color.Transparent)
                .padding(20.dp, 0.dp)

        ) {
            Logo(
                modifier = Modifier
                    .height(130.dp)
                    .scale(3f)
                    .align(Alignment.CenterHorizontally)
            )


            TextInput(
                value = emailValue,
                onValueChange = {value -> setEmailValue(value)},
                keyboardType = KeyboardType.Email,
                label = "Email",
                modifier = Modifier
                    .background(Color.Transparent)
                    .fillMaxWidth()
                    .padding(0.dp, 20.dp, 0.dp,0.dp)
            )

            TextInput(
                value = passwordValue,
                onValueChange = {value -> setPasswordValue(value)},
                keyboardType = KeyboardType.Password,
                label = "Password",
                modifier = Modifier
                    .background(Color.Transparent)
                    .fillMaxWidth()
                    .padding(0.dp, 10.dp)
            )

            PrimaryFilledButton(
                text= "Log in",
                onClick = { onLogin() },
                modifier = Modifier
                    .fillMaxWidth()
            )

            Row (
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(10.dp)
            ){
                Text(text="Don't have an account?", color = Color.White)
                Text(text= "Register", color = PrimaryYellow)
            }

        }
    }
}

