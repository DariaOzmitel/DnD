package com.example.core_model.enums

enum class SpellLevel(val level: Int, val displayName: String) {
    CANTRIP(0, "Заговор"),
    LEVEL_1(1, "1 уровень"),
    LEVEL_2(2, "2 уровень"),
    LEVEL_3(3, "3 уровень"),
    LEVEL_4(4, "4 уровень"),
    LEVEL_5(5, "5 уровень"),
    LEVEL_6(6, "6 уровень"),
    LEVEL_7(7, "7 уровень"),
    LEVEL_8(8, "8 уровень"),
    LEVEL_9(9, "9 уровень"),
    UNDEFINED(10, "Уровень неизвестен");

    override fun toString() = displayName

    companion object {
        fun fromInt(value: Int): SpellLevel = entries.firstOrNull { it.level == value } ?: UNDEFINED
    }
}
