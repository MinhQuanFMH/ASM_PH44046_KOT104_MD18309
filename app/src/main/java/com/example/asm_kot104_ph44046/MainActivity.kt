package com.example.asm_kot104_ph44046

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.asm_kot104_ph44046.ui.theme.ASM_KOT104_PH44046Theme
import com.example.asm_kot104_ph44046.ui.theme.Screens


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ASM_KOT104_PH44046Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navControl = rememberNavController()

                    NavHost(navController = navControl, startDestination = "Welcome") {
                        composable("Welcome"){
                            Welcome(navControl)
                        }
                        composable("Login"){
                            Login(navControl)
                        }
                        composable("Signin"){
                            Signin(navControl)
                        }
                        composable("Home"){
                            BottomNavigation(navControl)
                        }
                        composable(Screens.ProductInformation.screen){
                            ProductDetail()
                        }
                    }
                }
            }
        }
    }
}

