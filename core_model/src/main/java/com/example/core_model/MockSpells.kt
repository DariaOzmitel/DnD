package com.example.core_model

import com.example.core_model.enums.CharacterClass
import com.example.core_model.enums.School
import com.example.core_model.enums.SourceBook
import com.example.core_model.enums.SpellLevel

val mockSpell = Spell(
    id = "control_flames",
    name = "Власть над огнём",
    nameEnglish = "Control Flames",
    sourceBooks = listOf(SourceBook.XGE, SourceBook.POA),
    level = SpellLevel.CANTRIP,
    school = School.TRANSMUTATION,
    castingTime = "1 действие",
    range = "60 футов",
    components = "С",
    duration = "Мгновенная или 1 час",
    classes = listOf(CharacterClass.WIZARD, CharacterClass.DRUID, CharacterClass.SORCERER),
    description = "Вы выбираете немагическое пламя, которое вы можете видеть в пределах дистанции и которое помещается в куб с длиной ребра 5 футов. " +
            "Вы можете управлять им одним из нижеперечисленных способов:\n" +
            "- мгновенно распространить огонь на 5 футов в одном направлении, если там присутствует дерево или другое топливо;\n" +
            "- мгновенно потушить огонь в кубе;\n" +
            "- увеличить или уменьшить вдвое область яркого и тусклого света, излучаемого пламенем, а также поменять его цвет (эффект действует 1 час);\n" +
            "- сотворить в огне изображение, напоминающее существо, предмет или место, и двигаться согласно вашим указаниям (эффект действует 1 час).\n" +
            "Вы не можете поддерживать более 3 длительных эффектов одновременно."
)

val mockSpells = listOf(
    Spell(
        id = "control_flames",
        name = "Власть над огнём",
        nameEnglish = "Control Flames",
        sourceBooks = listOf(SourceBook.XGE, SourceBook.POA),
        level = SpellLevel.CANTRIP,
        school = School.TRANSMUTATION,
        castingTime = "1 действие",
        range = "60 футов",
        components = "С",
        duration = "Мгновенная или 1 час",
        classes = listOf(CharacterClass.WIZARD, CharacterClass.DRUID, CharacterClass.SORCERER),
        description = "Вы выбираете немагическое пламя, которое вы можете видеть в пределах дистанции и которое помещается в куб с длиной ребра 5 футов. " +
                "Вы можете управлять им одним из нижеперечисленных способов:\n" +
                "- мгновенно распространить огонь на 5 футов в одном направлении, если там присутствует дерево или другое топливо;\n" +
                "- мгновенно потушить огонь в кубе;\n" +
                "- увеличить или уменьшить вдвое область яркого и тусклого света, излучаемого пламенем, а также поменять его цвет (эффект действует 1 час);\n" +
                "- сотворить в огне изображение, напоминающее существо, предмет или место, и двигаться согласно вашим указаниям (эффект действует 1 час).\n" +
                "Вы не можете поддерживать более 3 длительных эффектов одновременно."
    ),
    Spell(
        id = "infestation",
        name = "Нашествие",
        nameEnglish = "Infestation",
        sourceBooks = listOf(SourceBook.XGE),
        level = SpellLevel.CANTRIP,
        school = School.CONJURATION,
        castingTime = "1 действие",
        range = "30 футов",
        components = "В, С, М (живая блоха)",
        duration = "Мгновенная",
        classes = listOf(
            CharacterClass.WIZARD,
            CharacterClass.DRUID,
            CharacterClass.WARLOCK,
            CharacterClass.SORCERER
        ),
        description = "Вы вызываете клещей, блох и других паразитов, которые мгновенно обволакивают одно существо в пределах дистанции. " +
                "Цель должна преуспеть в спасброске Телосложения, иначе получит 1к6 урона ядом и переместится на 5 футов в случайном направлении."
    ),
    Spell(
        id = "mending",
        name = "Починка",
        nameEnglish = "Mending",
        sourceBooks = listOf(SourceBook.PH14, SourceBook.PH24),
        level = SpellLevel.CANTRIP,
        school = School.TRANSMUTATION,
        castingTime = "1 минута",
        range = "Касание",
        components = "В, С, М (два магнетита)",
        duration = "Мгновенная",
        classes = listOf(
            CharacterClass.BARD,
            CharacterClass.WIZARD,
            CharacterClass.DRUID,
            CharacterClass.CLERIC,
            CharacterClass.ARTIFICER,
            CharacterClass.SORCERER
        ),
        description = "Это заклинание чинит одно повреждение или разрыв на предмете, которого касаетесь, не оставляя следов. " +
                "Может физически починить магический предмет или Конструкта, но не восстанавливает магию."
    )
)