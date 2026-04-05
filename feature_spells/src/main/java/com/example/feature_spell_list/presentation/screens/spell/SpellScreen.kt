package com.example.feature_spell_list.presentation.screens.spell

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.core_designsystem.R
import com.example.core_designsystem.theme.DnDTheme
import com.example.core_designsystem.theme.elements.text.TextBodyMedium
import com.example.core_designsystem.theme.elements.text.TextTitleLarge
import com.example.feature_spell_list.presentation.SpellInfoText
import com.example.feature_spell_list.presentation.models.SpellUi
import com.example.feature_spell_list.presentation.models.mockSpellUI

//@Composable
//fun SpellScreen(
//    modifier: Modifier = Modifier,
//    innerPadding: PaddingValues
//) {
//    val viewModel: SpellListViewModel = koinViewModel()
//    val state by viewModel.state.collectAsStateWithLifecycle()
//
//    when (state) {
//        is SpellListState.Loading -> {}
//        is SpellListState.Content -> SpellScreenContent(
//            modifier = modifier,
//            innerPadding = innerPadding,
//            spellList = (state as SpellListState.Content).spellList.map { it.toUi() }
//        )
//    }
//}

@Composable
fun SpellScreenContent(
    modifier: Modifier = Modifier,
    innerPadding: PaddingValues,
    spell: SpellUi
) {
    val scrollState = rememberScrollState()
    Column(
        modifier = modifier
            .padding(
                start = 16.dp,
                end = 16.dp,
                top = innerPadding.calculateTopPadding() + 8.dp,
                bottom = innerPadding.calculateBottomPadding()
            )
            .verticalScroll(scrollState)
    ) {
        TextTitleLarge(
            modifier = Modifier.padding(bottom = 6.dp),
            text = "${spell.name} [${spell.nameEnglish}]",
            color = MaterialTheme.colorScheme.tertiary
        )
        SpellInfoText(
            modifier = Modifier.padding(bottom = 4.dp),
            title = stringResource(R.string.level),
            value = " ${spell.level}",
        )
        SpellInfoText(
            modifier = Modifier.padding(bottom = 4.dp),
            title = stringResource(R.string.range),
            value = " ${spell.range}",
        )
        SpellInfoText(
            modifier = Modifier.padding(bottom = 4.dp),
            title = stringResource(R.string.castingTime),
            value = " ${spell.castingTime}",
        )
        SpellInfoText(
            modifier = Modifier.padding(bottom = 4.dp),
            title = stringResource(R.string.components),
            value = " ${spell.components}",
        )
        SpellInfoText(
            modifier = Modifier.padding(bottom = 4.dp),
            title = stringResource(R.string.duration),
            value = " ${spell.duration}",
        )
        SpellInfoText(
            modifier = Modifier.padding(bottom = 8.dp),
            title = stringResource(R.string.classes),
            value = " ${spell.classes}",
        )
        TextBodyMedium(
            text = spell.description,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Preview
@Composable
fun SpellCardPreviewContent() {
    DnDTheme(darkTheme = true) {
        SpellScreenContent(innerPadding = PaddingValues(8.dp), spell = mockSpellUI)
    }
}