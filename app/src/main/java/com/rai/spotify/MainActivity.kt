package com.rai.spotify

import TelaInicial
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import com.rai.spotify.ui.theme.SpotifyTheme
import com.rai.spotify.view.TelaCadastro



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            appNavigation()
        }
    }
}

@Composable
fun appNavigation(){
    //Cria um controlador de navegação (NavController)
    //rememberNavController() garante que o controlador seja lembrado durante recomposições,
    // mantendo o estado da navegação
    val navController = rememberNavController()

    // O NavHost é um contêiner que gerencia a navegação entre telas
    // navController controla as transições entre telas
    // startDestination = "telaInicial" define a primeira tela exibida quando o app inicia
    NavHost(navController = navController, startDestination = "telaInicial"){

        //Define um destino de navegação com a rota "telaInicial"
        composable(
            route = "telaInicial"
        ){

            //Quando essa rota for acessada, a função TelaInicial(navController) é chamada
            //navController navega para outras telas
            TelaInicial(navController)
        }
        composable(
            route = "telaCadastro"
        ){
            TelaCadastro(navController)
        }
    }
}


