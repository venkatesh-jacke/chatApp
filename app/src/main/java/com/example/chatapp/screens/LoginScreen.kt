package com.example.chatapp.screens

import android.graphics.Paint.Align
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.background
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chatapp.composables.MyTextField
import com.example.chatapp.R
import com.example.chatapp.composables.GradientButton
import com.example.chatapp.composables.PasswordTextField
import com.example.chatapp.utils.Constants


@Composable
fun LoginScreen() {
    val TAG = "LoginScreen"
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.welcome_again),
                textAlign = TextAlign.Justify,
                style = MaterialTheme.typography.titleLarge
            )
            Spacer(modifier = Modifier.height(30.dp))
            MyTextField(
                label = stringResource(id = R.string.user_name),
                icon = painterResource(id = R.drawable.ic_person)
            )
            Spacer(modifier = Modifier.height(16.dp))
            PasswordTextField(label = "PASSWORD", icon = painterResource(id = R.drawable.lock))
            Spacer(modifier = Modifier.height(16.dp))
            GradientButton(
                text = stringResource(id = R.string.login),
                onClick = { Log.d(TAG,"Button clicked") })
        }
    }
}


@Composable
@Preview(showSystemUi = true)
fun PreviewLoginScreen() {

    LoginScreen()
}
