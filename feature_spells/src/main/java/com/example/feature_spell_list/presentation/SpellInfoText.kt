package com.example.feature_spell_list.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import com.example.core_designsystem.theme.elements.text.TextTitleMedium

@Composable
fun SpellInfoText(
    modifier: Modifier = Modifier,
    title: String,
    value: String
) {
    TextTitleMedium(
        modifier = modifier,
        text = buildAnnotatedString {
            withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                append("$title:")
            }
            append(value)
        }
    )
}