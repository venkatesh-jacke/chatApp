package com.example.chatapp.composables

import androidx.compose.foundation.layout.fillMaxWidth
import com.example.chatapp.R
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordTextField(label: String,icon:Painter) {
    var password by remember {
        mutableStateOf("")

    }
    var passwordVisibility by rememberSaveable {
        mutableStateOf(false)
    }
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        label = { Text(text = label) },
        value = password,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Red, // Placeholder for focused color
            unfocusedBorderColor = Color.Gray,
            cursorColor = Color.Black
        ),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        onValueChange = { newPassword -> password = newPassword },
        leadingIcon = {
            Icon(painter = icon, contentDescription = null)
        },
        trailingIcon = {
            var passwordContentDesc = ""
            var imageIcon: Painter? = null
            when (passwordVisibility) {
                true -> {
                    imageIcon = painterResource(id = R.drawable.visibility_on)
                    passwordContentDesc = stringResource(id = R.string.show_password)
                }

                else -> {
                    imageIcon = painterResource(id = R.drawable.visibility_off)
                    passwordContentDesc = stringResource(id = R.string.hide_password)
                }
            }

            IconButton(onClick = { passwordVisibility=!passwordVisibility}) {
                Icon(painter = imageIcon, contentDescription = passwordContentDesc)
            }
        },
        visualTransformation = if (passwordVisibility) PasswordVisualTransformation() else VisualTransformation.None,
    )

}

@Composable
@Preview(showBackground = true)
fun PreviewPasswordTextField() {

  PasswordTextField(label = "PASSWORD", icon = painterResource(id = R.drawable.lock))
}