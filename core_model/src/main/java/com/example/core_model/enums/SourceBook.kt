package com.example.core_model.enums

enum class SourceBook(val code: String, val fullName: String) {
    PHB("PHB", "Player's Handbook"),
    PH14("PHB", "Player's Handbook 2014"),
    PH24("PHB", "Player's Handbook 2024"),
    DMG("DMG", "Dungeon Master's Guide"),
    MM("MM", "Monster Manual"),
    XGE("XGE", "Xanathar's Guide to Everything"),
    TCE("TCE", "Tasha's Cauldron of Everything"),
    SCAG("SCAG", "Sword Coast Adventurer's Guide"),
    VGM("VGM", "Volo's Guide to Monsters"),
    GGtR("GGtR", "Guildmasters' Guide to Ravnica"),
    EoW("EoW", "Eberron: Rising from the Last War"),
    MOT("MOT", "Mythic Odysseys of Theros"),
    COF("COF", "Candlekeep Mysteries"),
    COS("COS", "Curse of Strahd"),
    POA("POA", "Princes of the Apocalypse"),
    ROA("ROA", "Rise of Tiamat"),
    HOTDQ("HOTDQ", "Hoard of the Dragon Queen"),
    OotA("OotA", "Out of the Abyss"),
    SKT("SKT", "Storm King's Thunder");

    companion object {
        fun fromCode(code: String): SourceBook? =
            entries.firstOrNull { it.code.equals(code, ignoreCase = true) }
    }
}
