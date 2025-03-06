package com.example.myapplicationenejun

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
//import com.example.myapplicationenejun.ui.InterfaceLiverpool.InterfaceLiverpool
import com.example.myapplicationenejun.ui.Screens.ComponentsScreen
import com.example.myapplicationenejun.ui.Screens.HomeScreens
import com.example.myapplicationenejun.ui.Screens.MainMenuScreens
import com.example.myapplicationenejun.ui.Screens.TestScreen
import com.example.myapplicationenejun.ui.theme.MyApplicationEneJunTheme

// Definición de la actividad principal
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {  // Método que se ejecuta al crear la actividad
        super.onCreate(savedInstanceState)
        setContent {  // Establece el contenido de la actividad usando Jetpack Compose
            MyApplicationEneJunTheme {  // Aplica el tema de la aplicación
                ComposableMultiScreenApp()  // Llama a la función principal de navegación
            }
        }
    }
}

// Función composable que maneja la navegación entre pantallas
@Composable
fun ComposableMultiScreenApp() {
    val navController = rememberNavController()  // Crea un controlador de navegación y lo recuerda
    SetupNavGraph(navController = navController)  // Configura la navegación con el controlador
}

// Configuración del sistema de navegación de la app
@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "Main_Menu") {
        // Define la estructura de navegación de la app con una pantalla de inicio

        composable("Main_Menu") { MainMenuScreens(navController) }  // Ruta para la pantalla del menú principal
        composable("Home_Screens") { HomeScreens(navController) }  // Ruta para la pantalla de inicio
        composable("Test_Screen") { TestScreen(navController) }  // Ruta para la pantalla de prueba
       // composable("Liverpool_Screen") { InterfaceLiverpool(navController) }  // Ruta para la pantalla de prueba
        composable("Components_Screen") { ComponentsScreen(navController) }  // Ruta para la pantalla de prueba
    }
}