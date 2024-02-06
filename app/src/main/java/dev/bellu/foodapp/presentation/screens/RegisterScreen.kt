import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dev.bellu.foodapp.presentation.composables.ButtonSample
import dev.bellu.foodapp.presentation.composables.InputSample
import dev.bellu.foodapp.presentation.shared.Colors
import dev.bellu.foodapp.presentation.shared.TextManager

@Composable
fun RegisterScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .background(color = Colors.primary)
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .padding(24.dp),
            content = {
                Box(modifier = Modifier
                    .offset(y = 30.dp), content = {
                    Text(
                        "Welcome to our FoodApplication", style = TextManager.titleWhite
                    )
                })
                Spacer(modifier = Modifier.fillMaxHeight(0.07f))
                InputSample(
                    label = "E-mail",
                    placeholder = "Example: bellu@foodapp.com",
                )
                InputSample(
                    label = "Password",
                    placeholder = "Enter your Password",
                )
                Spacer(modifier = Modifier.fillMaxHeight(0.1f))
                ButtonSample()
                Spacer(modifier = Modifier.fillMaxHeight(0.1f))
                HaveAccountButton(
                    haveAccount = false,
                    onClick = {
                        navController.navigate("login")
                    }
                )
            })
    }
}