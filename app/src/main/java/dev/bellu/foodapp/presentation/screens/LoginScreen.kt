package dev.bellu.foodapp.presentation.screens

import HaveAccountButton
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
fun LoginScreen(navController: NavController) {
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
                    label = "Name",
                    placeholder = "Example: John...",
                )
                InputSample(
                    label = "E-mail",
                    placeholder = "Example: bellu@foodapp.com",
                )
                InputSample(
                    label = "Password",
                    placeholder = "Enter your password",
                )
                Spacer(modifier = Modifier.fillMaxHeight(0.1f))
                ButtonSample()
                Spacer(modifier = Modifier.fillMaxHeight(0.1f))
                HaveAccountButton(
                    haveAccount = true,
                    onClick = {
                        navController.navigate("register")
                    }
                )
            })
    }
}

