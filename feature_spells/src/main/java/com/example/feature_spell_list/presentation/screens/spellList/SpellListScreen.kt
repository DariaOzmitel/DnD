package com.example.feature_spell_list.presentation.screens.spellList

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.core_designsystem.theme.DnDTheme
import com.example.feature_spell_list.data.toUi
import com.example.feature_spell_list.presentation.SpellCard
import com.example.feature_spell_list.presentation.models.SpellUi
import com.example.feature_spell_list.presentation.models.mockSpellsUi
import org.koin.androidx.compose.koinViewModel

@Composable
fun SpellListScreen(
    modifier: Modifier = Modifier,
    innerPadding: PaddingValues
) {
    val viewModel: SpellListViewModel = koinViewModel()
    val state by viewModel.state.collectAsStateWithLifecycle()

    when (state) {
        is SpellListState.Loading -> {}
        is SpellListState.Content -> SpellListScreenContent(
            modifier = modifier,
            innerPadding = innerPadding,
            spellList = (state as SpellListState.Content).spellList.map { it.toUi() }
        )
    }
}

@Composable
fun SpellListScreenContent(
    modifier: Modifier = Modifier,
    innerPadding: PaddingValues,
    spellList: List<SpellUi>
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
private fun SpellCardListPreviewContent() {
    DnDTheme(darkTheme = true) {
        SpellListScreenContent(innerPadding = PaddingValues(8.dp), spellList = mockSpellsUi)
    }
}