package com.example.core_model.enums

enum class CharacterClass(val ru: String, val en: String) {
    BARBARIAN("Варвар", "Barbarian"),
    BARD("Бард", "Bard"),
    CLERIC("Жрец", "Cleric"),
    DRUID("Друид", "Druid"),
    FIGHTER("Воин", "Fighter"),
    MONK("Монах", "Monk"),
    PALADIN("Паладин", "Paladin"),
    RANGER("Следопыт", "Ranger"),
    ROGUE("Плут", "Rogue"),
    SORCERER("Чародей", "Sorcerer"),
    WARLOCK("Колдун", "Warlock"),
    WIZARD("Волшебник", "Wizard"),
    ARTIFICER("Изобретатель", "Artificer"),
    UNDEFINED("Неизвестный", "Undefined");

    companion object {
        fun fromEnglish(name: String): CharacterClass =
            entries.firstOrNull { it.en.equals(name, ignoreCase = true) } ?: UNDEFINED

        fun fromRussian(name: String): CharacterClass =
            entries.firstOrNull { it.ru.equals(name, ignoreCase = true) } ?: UNDEFINED
    }
}
