package com.example.feature_spell_list.presentation.models

data class SpellUi(
    val id: String,
    val name: String,
    val nameEnglish: String,
    val sourceBooks: String?,
    val level: String,
    val school: String,
    val castingTime: String,
    val range: String,
    val components: String,
    val duration: String,
    val classes: String,
    val description: String,
)