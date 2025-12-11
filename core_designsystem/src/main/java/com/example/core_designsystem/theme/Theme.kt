package com.example.core_designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = BasicDarkGrey,
    secondary = BasicDarkGrey2,
    background = BasicBlack,
    onBackground = BasicGrey2,
    onPrimary = BasicGrey1,
    onSecondary = BasicWhite,
    surface = BasicDarkGrey3,
    onSurface = BasicWhite,
    tertiary = Orange
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40,
    background = Pink40
)

@Composable
fun DnDTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when {

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}