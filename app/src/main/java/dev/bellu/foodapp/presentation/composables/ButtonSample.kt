package dev.bellu.foodapp.presentation.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.bellu.foodapp.presentation.shared.Colors

@Composable
fun ButtonSample() {

    val buttonColors = ButtonDefaults.buttonColors(
        containerColor = Colors.onPrimary
    )

    Button(
        colors = buttonColors,
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        onClick = { /*TODO*/ },
        content = {
            Text(text = "Continue")
        }
    )
}