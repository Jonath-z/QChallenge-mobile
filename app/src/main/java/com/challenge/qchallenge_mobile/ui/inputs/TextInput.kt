package com.challenge.qchallenge_mobile.ui.inputs

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.TextDelegate
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import com.challenge.qchallenge_mobile.ui.theme.PrimaryYellow

@Composable
fun TextInput(
    value: String,
    label: String,
    onValueChange: (value: String) -> Unit,
    keyboardType: KeyboardType = KeyboardType.Text,
    modifier: Modifier
    ){

    val textFileColors = TextFieldDefaults.textFieldColors(
        textColor = Color.White,
        focusedLabelColor = PrimaryYellow,
        unfocusedLabelColor = PrimaryYellow
    )

    TextField(
        value = value,
        colors = textFileColors,
        onValueChange = onValueChange,
        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = keyboardType),
        label = {Text(text = label)},
        modifier = modifier
    )
}

