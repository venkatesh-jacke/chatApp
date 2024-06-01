package com.example.chatapp.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun MyButton(text:String,onclick:()->Unit){
    Button(onClick = { onclick}) {
        Text(text = text)
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun PreviewMyButton(){
    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        MyButton("Click Me"){

        }
    }

}