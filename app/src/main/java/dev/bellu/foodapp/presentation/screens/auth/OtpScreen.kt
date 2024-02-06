package dev.bellu.foodapp.presentation.screens.auth

import HaveAccountButton
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dev.bellu.foodapp.presentation.composables.ButtonSample
import dev.bellu.foodapp.presentation.composables.InputSample
import dev.bellu.foodapp.presentation.shared.Colors
import dev.bellu.foodapp.presentation.shared.TextManager

@Composable
fun OtpScreen(navController: NavController) {
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
                        "Email Verification", style = TextManager.titleWhite
                    )
                })
                Spacer(modifier = Modifier.fillMaxHeight(0.07f))
                InputSample(
                    label = "Code OTP",
                    placeholder = "Example: EJS@#@S",
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Send Again",
                        style = TextManager.smallPurple,
                        modifier = Modifier
                            .clickable {  }
                    )
                    Text(
                        text = "Cancel Register",
                        style = TextManager.smallRed,
                        modifier = Modifier
                            .clickable {
                                navController.navigate("login")
                            }
                    )
                }
                Spacer(modifier = Modifier.fillMaxHeight(0.07f))
                ButtonSample(
                    onClick = {

                    }
                )
            })
    }
}