package dev.bellu.foodapp.presentation.shared

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import dev.bellu.foodapp.R

val fontFamily = FontFamily(
    Font(R.font.sf_regular, FontWeight.Normal),
    Font(R.font.sf_medium, FontWeight.Medium),
    Font(R.font.sf_bold, FontWeight.Bold)
)

object Colors {
    val primary = Color(0xFF291E43)
    val onPrimary = Color(0xFF8C63EE)
    val tertiary = Color(0xFF49CC76)
    val onTertiary = Color(0xFFAEA3C8)

    val white = Color(0xFFFFFFFF)
    val white30 = Color(0xFFF7F7F7)
    val error = Color(0xFFD95151)
}

object TextManager {
    val titleWhite = TextStyle(
        fontSize = 32.sp,
        fontWeight = FontWeight.Medium,
        color = Colors.white,
        fontFamily = fontFamily
    )
    val textHaveAccount = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
        color = Colors.onTertiary
    )
    val mediumWhite = TextStyle(
        fontSize = 24.sp,
        fontWeight = FontWeight.SemiBold,
        color = Colors.white
    )
}