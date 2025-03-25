package br.senai.sp.jandira.bmi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.bmi.screens.BMIResultScreen
import br.senai.sp.jandira.bmi.screens.HomeScreens
import br.senai.sp.jandira.bmi.screens.UserScreen
import br.senai.sp.jandira.bmi.ui.theme.BMITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BMITheme {
                val controleDeNavegacao = rememberNavController()
                NavHost(
                    navController = controleDeNavegacao,
                    startDestination = "home"
                ){
                    composable(route =  "home"){ HomeScreens(controleDeNavegacao)}
                    composable(route =  "user_Data"){ UserScreen(controleDeNavegacao) }
                    composable(route =  "bmi_result"){ BMIResultScreen(controleDeNavegacao) }

                }
            }
        }
    }

    private fun useDataScreen() {
        TODO("Not yet implemented")
    }

}
