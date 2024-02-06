import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.bellu.foodapp.presentation.shared.Colors
import dev.bellu.foodapp.presentation.shared.TextManager

@Composable
fun HaveAccountButton(
    haveAccount: Boolean,
    onClick: () -> Unit,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .height(50.dp),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = if (haveAccount) {
                    "Already have an account?"
                } else {
                    "Not Already have an account?"
                },
                style = TextManager.textHaveAccount
            )
            Text(
                text = if (haveAccount) {
                    "Log in"
                } else {
                    "Register"
                },
                style = TextManager.mediumWhite
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .height(56.dp)
                .width(80.dp)
                .background(
                    color = Colors.onPrimary.copy(alpha = 0.4f),
                    shape = RoundedCornerShape(10.dp)
                )
                .clickable { onClick() },
            content = {
                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = "Next Step",
                    tint = Colors.onPrimary
                )
            }
        )
    }
}