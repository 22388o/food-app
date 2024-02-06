import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import dev.bellu.foodapp.presentation.screens.LoginScreen

@Composable
fun AppNavigation(
    navController: NavHostController,
    startNavigation: String
){
    NavHost(
        navController = navController,
        startDestination = startNavigation,
        builder = {
            composable("login") { LoginScreen(navController) }
            composable("register") { RegisterScreen(navController)}
        }
    )
}