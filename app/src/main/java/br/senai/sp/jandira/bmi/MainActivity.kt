package br.senai.sp.jandira.bmi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import br.senai.sp.jandira.bmi.ui.theme.BMITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BMITheme {
                useDataScreen()
            }
        }
    }

    private fun useDataScreen() {
        TODO("Not yet implemented")
    }

}
