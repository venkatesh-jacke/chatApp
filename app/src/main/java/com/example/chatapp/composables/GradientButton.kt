package com.example.chatapp.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chatapp.ui.theme.DodgerBlue
import com.example.chatapp.ui.theme.Purple50

@Composable
fun GradientButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit = {},
    buttonHeight: Dp = 48.dp, // Default height
    buttonWidth: Float = 1f // Default width
) {
    Button(
        onClick = { onClick() },
        modifier = Modifier
            .fillMaxWidth(buttonWidth)
            .height(buttonHeight)
            .then(modifier), // Apply additional modifier
        contentPadding = PaddingValues(),
        colors = ButtonDefaults.buttonColors(Color.Transparent)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(buttonHeight)
                .border(2.dp, color = Color.Black, shape = RoundedCornerShape(buttonHeight / 2f))
                .background(
                    brush = Brush.horizontalGradient(listOf(Purple50, Color.White)),
                    shape = RoundedCornerShape(buttonHeight / 2f)
                ),
            contentAlignment = Alignment.Center,
        ) {
            Text(text = text,fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color.Black)
        }
    }
}



@Composable
@Preview(showBackground = true, showSystemUi = true)
fun PreviewGradientButton() {

    GradientButton(text = "Button", onClick = {})
}