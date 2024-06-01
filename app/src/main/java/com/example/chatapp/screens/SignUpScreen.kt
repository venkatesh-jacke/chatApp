package com.example.chatapp.screens

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
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
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.chatapp.R
import com.example.chatapp.composables.GradientButton
import com.example.chatapp.composables.MyTextField
import com.example.chatapp.composables.PasswordTextField
import com.example.chatapp.ui.theme.ChatAppTheme
import com.example.chatapp.utils.Constants

@Composable
fun SignUpScreen(navController: NavController) {
    val TAG = "SignupScreen"


    Surface (modifier = Modifier.fillMaxSize()) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "SignUp Screen", fontSize = 50.sp)
            Button(onClick = { navController.navigate(Screens.HomeScreen.route) }) {
                Text(text = "Go to Home")
            }
            Button(onClick = { navController.navigate(Screens.SettingScreen.route) }) {
                Text(text = "Go to Setting")
            }
            Button(onClick = { navController.navigate(Screens.LoginScreen.route) }) {
                Text(text = "Go to Login")
            }
        }
    }
}


@Composable
@Preview(showSystemUi = true)
fun PreviewSignUpScreen() {

    SignUpScreen(rememberNavController())


}
