package com.example.core_network

import com.example.core_model.Spell
import com.example.core_model.enums.CharacterClass
import com.example.core_model.enums.School
import com.example.core_model.enums.SourceBook
import com.example.core_model.enums.SpellLevel
import com.example.core_network.models.SpellDto

fun SpellDto.toDomain(): Spell =
    Spell(
        id = id,
        name = name,
        nameEnglish = nameEnglish,
        sourceBooks = sourceBooks?.mapNotNull(SourceBook::fromCode) ?: emptyList(),
        level = SpellLevel.fromInt(level),
        school = School.fromEnglish(school),
        castingTime = castingTime,
        range = range,
        components = components,
        duration = duration,
        classes = classes.map(CharacterClass::valueOf),
        description = description
    )
