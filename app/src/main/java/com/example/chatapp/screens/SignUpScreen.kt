package com.example.chatapp.screens

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chatapp.R
import com.example.chatapp.composables.GradientButton
import com.example.chatapp.composables.MyTextField
import com.example.chatapp.composables.PasswordTextField
import com.example.chatapp.ui.theme.ChatAppTheme
import com.example.chatapp.utils.Constants

@Composable
fun SignUpScreen() {
    val TAG="SignupScreen"
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.welcome),
                textAlign = TextAlign.Justify,
                style = MaterialTheme.typography.titleLarge
            )
            Spacer(modifier = Modifier.height(30.dp))
            MyTextField(label = stringResource(id = R.string.user_name), icon = painterResource(id = R.drawable.ic_person))
            Spacer(modifier = Modifier.height(16.dp))
            PasswordTextField(label = "PASSWORD", icon = painterResource(id = R.drawable.lock))
            Spacer(modifier = Modifier.height(16.dp))
            GradientButton(
                text = stringResource(id = R.string.register),
                onClick = { Log.d(TAG,"Button clicked") })
        }
    }
}


@Composable
@Preview(showSystemUi = true)
fun PreviewSignUpScreen() {

        SignUpScreen()


}
