package com.example.dnd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.core_designsystem.theme.DnDTheme
import com.example.feature_spell_list.presentation.screens.spell.SpellCardPreviewContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DnDTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SpellCardPreviewContent()
                }
            }
        }
    }
}