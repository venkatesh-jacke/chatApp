package com.example.chatapp.utils

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp


val componentShape = Shapes(
    small= RoundedCornerShape(4.dp),
    medium= RoundedCornerShape(6.dp),
    large= RoundedCornerShape(8.dp)
)

enum class ButtonSize{
    SMALL,MEDIUM,LARGE
}

