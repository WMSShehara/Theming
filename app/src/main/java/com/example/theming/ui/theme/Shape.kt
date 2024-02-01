package com.example.theming.ui.theme

 import androidx.compose.foundation.shape.RoundedCornerShape
 import androidx.compose.material3.MaterialTheme

 import androidx.compose.material3.Shapes
 import androidx.compose.runtime.Composable
 import androidx.compose.runtime.ReadOnlyComposable
 import androidx.compose.runtime.compositionLocalOf
 import androidx.compose.ui.unit.dp


val shapes = Shapes(
    extraSmall = RoundedCornerShape(4.dp),
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(16.dp),
    large = RoundedCornerShape(24.dp),
    extraLarge = RoundedCornerShape(32.dp)
)