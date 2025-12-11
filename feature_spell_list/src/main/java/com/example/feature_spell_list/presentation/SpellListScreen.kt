package com.example.feature_spell_list.presentation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.core_designsystem.theme.DnDTheme
import com.example.core_model.Spell
import com.example.core_model.mockSpells

@Composable
fun SpellListScreen(
    modifier: Modifier = Modifier,
    innerPadding: PaddingValues,
    spellList: List<Spell>
) {
    val listState = rememberLazyListState()
    LazyColumn(
        modifier = modifier.padding(
            start = 16.dp,
            end = 16.dp,
            top = innerPadding.calculateTopPadding() + 8.dp,
            bottom = innerPadding.calculateBottomPadding()
        ),
        state = listState
    ) {
        items(spellList, key = { spell ->
            spell.id
        }) { spell ->
            SpellCard(modifier = Modifier.padding(bottom = 8.dp), spell = spell)
        }
    }
}

@Preview
@Composable
private fun SpellCardListPreview() {
    DnDTheme(darkTheme = true) {
        SpellListScreen(innerPadding = PaddingValues(8.dp), spellList = mockSpells)
    }
}