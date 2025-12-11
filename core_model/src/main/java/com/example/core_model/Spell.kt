package com.example.core_model

import com.example.core_model.enums.CharacterClass
import com.example.core_model.enums.School
import com.example.core_model.enums.SourceBook
import com.example.core_model.enums.SpellLevel

data class Spell(
    val id: String,
    val name: String,
    val nameEnglish: String,
    val sourceBooks: List<SourceBook>,
    val level: SpellLevel,
    val school: School,
    val castingTime: String,
    val range: String,
    val components: String,
    val duration: String,
    val classes: List<CharacterClass>,
    val description: String,
)