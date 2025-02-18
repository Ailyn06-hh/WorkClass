package com.example.myapplicationenejun.ui.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

// Función composable que representa el menú principal
@Composable
fun MainMenuScreens(navController: NavHostController) {
    Column(
        modifier = Modifier
            .padding(10.dp)  // Aplica un margen de 10dp alrededor de la columna
            .fillMaxSize()  // Hace que la columna ocupe toda la pantalla
    ) {
        // Sección para la pantalla "Home Screens"
        Text("Home Screens")  // Texto descriptivo
        Button(
            onClick = { navController.navigate("Home_Screens") }  // Navega a la pantalla HomeScreens
        ) {
            Text("Go to Home Screens")  // Texto del botón
        }

        // Sección para la pantalla "Test Screen"
        Text("Test Screen")  // Texto descriptivo
        Button(
            onClick = { navController.navigate("Test_Screen") }  // Navega a la pantalla TestScreen
        ) {
            Text("Go to Test Screen")  // Texto del botón
        }
    }
}
