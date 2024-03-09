package com.example.chatapp.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun Test(){
    var name by remember {
        mutableStateOf("")
    }
    Hello(name, onNameChange = {name=it})
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Hello(name:String,onNameChange:(String)->Unit){
    Column {
        Text(text = "Hello $name")
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = name,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Red, // Placeholder for focused color
                unfocusedBorderColor = Color.Gray,
                cursorColor = Color.Black
            ),
            keyboardOptions = KeyboardOptions.Default,
            onValueChange = { onNameChange(it) },

        )

    }
}

@Composable
@Preview
fun PreviewTest(){
    Test()
}