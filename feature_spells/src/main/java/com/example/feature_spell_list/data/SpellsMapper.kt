package com.example.feature_spell_list.data

import com.example.core_model.Spell
import com.example.core_model.enums.CharacterClass
import com.example.core_model.enums.School
import com.example.core_model.enums.SourceBook
import com.example.core_model.enums.SpellLevel
import com.example.core_network.models.SpellDto
import com.example.feature_spell_list.presentation.models.SpellUi

internal fun SpellDto.toDomain() = Spell(
    id = id,
    name = name,
    nameEnglish = nameEnglish,
    sourceBooks = sourceBooks?.mapNotNull { SourceBook.fromString(it) },
    level = SpellLevel.fromInt(level),
    school = School.fromEnglish(school),
    castingTime = castingTime,
    range = range,
    components = components,
    duration = duration,
    classes = classes.map { CharacterClass.fromEnglish(it) },
    description = description
)

internal fun List<SpellDto>.toDomain() = map { it.toDomain() }

internal fun Spell.toUi() = SpellUi(
    id = id,
    name = name,
    nameEnglish = nameEnglish,
    sourceBooks = sourceBooks?.joinToString { it.code },
    level = level.toString(),
    school = school.toString(),
    castingTime = castingTime,
    range = range,
    components = components,
    duration = duration,
    classes = classes.joinToString { it.ru },
    description = description
)