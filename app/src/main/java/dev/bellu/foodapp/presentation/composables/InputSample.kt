package dev.bellu.foodapp.presentation.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.unit.dp
import dev.bellu.foodapp.presentation.shared.Colors

@Composable
fun InputSample(
    placeholder: String,
    label: String,
) {

    var text by remember {
        mutableStateOf("")
    }

    val colors = TextFieldDefaults.colors(
        // Indicators
        focusedIndicatorColor = Colors.white,
        unfocusedIndicatorColor = Colors.white30.copy(alpha = 0.5f),
        errorIndicatorColor = Colors.error,
        // Containers
        focusedContainerColor = Color.Transparent,
        unfocusedContainerColor = Color.Transparent,
        errorContainerColor = Color.Transparent,
        // Text
        focusedTextColor = Colors.white,
        errorTextColor = Colors.error,
        // Focused
        focusedLabelColor = Colors.white,
        errorLabelColor = Colors.error,
        // Placeholder
        focusedPlaceholderColor = Colors.white30.copy(alpha = 0.5f),
        unfocusedPlaceholderColor = Colors.white30.copy(alpha = 0.5f),
        errorPlaceholderColor = Colors.error
    )


    OutlinedTextField(
        value = text,
        onValueChange = {
            text = it
        },
        colors = colors,
        placeholder = {
            Text(text = placeholder)
        },
        label = {
            Text(text = label)
        },
        shape = RoundedCornerShape(10.dp),

        modifier = Modifier
            .fillMaxWidth()
            .padding(
                top = 10.dp,
                bottom = 10.dp
            )
    )
}
