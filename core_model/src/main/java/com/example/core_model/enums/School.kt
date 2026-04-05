package com.example.core_model.enums

enum class School(val ru: String, val en: String) {
    ABJURATION("Ограждение", "Abjuration"),
    CONJURATION("Вызов", "Conjuration"),
    DIVINATION("Прорицание", "Divination"),
    ENCHANTMENT("Очарование", "Enchantment"),
    EVOCATION("Воплощение", "Evocation"),
    ILLUSION("Иллюзия", "Illusion"),
    NECROMANCY("Некромантия", "Necromancy"),
    TRANSMUTATION("Преобразование", "Transmutation"),
    UNDEFINED("Неизвестная", "Undefined school");

    override fun toString() = ru

    companion object {
        fun fromEnglish(enName: String): School =
            entries.firstOrNull { it.en.equals(enName, ignoreCase = true) } ?: UNDEFINED
    }
}
