package com.example.feature_spell_list.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
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
import com.example.core_designsystem.theme.elements.text.TextBodySmall
import com.example.core_designsystem.theme.elements.text.TextTitleSmall
import com.example.core_model.Spell
import com.example.core_model.mockSpell

@Composable
fun SpellCard(modifier: Modifier = Modifier, spell: Spell) {

    Card(
        modifier,
        border = BorderStroke(width = 1.dp, color = MaterialTheme.colorScheme.secondary),
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(modifier = Modifier.padding(6.dp)) {
            TextTitleSmall(
                modifier = Modifier.padding(bottom = 2.dp),
                text = spell.name,
                color = MaterialTheme.colorScheme.tertiary
            )
            TextBodySmall(
                modifier = Modifier.padding(bottom = 2.dp),
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6F),
                text = "${stringResource(R.string.level)} ${spell.level} - ${spell.classes.joinToString()}"
            )
            TextBodyMedium(
                text = spell.description,
                maxLines = MAX_LINES_OF_DESCRIPTION,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Preview
@Composable
private fun SpellCardPreview() {
    DnDTheme(darkTheme = true) {
        SpellCard(spell = mockSpell)
    }
}

private const val MAX_LINES_OF_DESCRIPTION = 4
