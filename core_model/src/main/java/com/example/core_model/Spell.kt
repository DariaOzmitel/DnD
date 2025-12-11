package com.example.core_model

data class Spell(
    val id: String,
    val name: String,
    val level: Int,
    val classes: List<String>,
    val school: String,
    val description: String
)

val mockSpell = Spell(
    id = "1",
    name = "Призыв животных",
    level = 3,
    classes = listOf("друид", "следопыт"),
    school = "Вызов",
    description = "Вы вызываете фейских духов, принимающих облик Зверей и появляющихся в свободном видимом вами пространстве в пределах дистанции. Выберите один из вариантов того, кто появляется:"
)

val mockSpellList = listOf(
    mockSpell,
    mockSpell.copy(id = "2"),
    mockSpell.copy(id = "3"),
    mockSpell.copy(id = "4"),
    mockSpell.copy(id = "5")
)