package com.example.chatapp.composables

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import com.example.chatapp.R
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.chatapp.ui.theme.LightBlue50


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextField(label: String,icon:Painter) {
    var text by remember {
        mutableStateOf("")

    }
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        label = {Text(text = label) },
        value = text,

        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Red,
            unfocusedBorderColor = Color.Gray,
            cursorColor = Color.Black,
            containerColor = LightBlue50.copy(.2f)

        ),
        shape= RoundedCornerShape(18.dp),
        keyboardOptions = KeyboardOptions.Default,
        onValueChange = { newValue -> text = newValue },
        leadingIcon = {
            Icon(painter = icon, contentDescription = null )
        }
    )

}

@Composable
@Preview(showBackground = true)
fun PreviewMyTextField() {
Box(modifier = Modifier.fillMaxSize().padding(40.dp), contentAlignment = Alignment.Center){
    MyTextField("Label", icon = painterResource(id = R.drawable.ic_person))
}

}