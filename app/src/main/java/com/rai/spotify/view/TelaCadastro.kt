package com.rai.spotify.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.rai.spotify.R
import com.rai.spotify.model.Cadastro
import com.rai.spotify.repositorio.RepositorioCadastro
import com.rai.spotify.ui.theme.Black
import com.rai.spotify.ui.theme.Green
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaCadastro(navController: NavController) {

    val scope = rememberCoroutineScope()
    val context = LocalContext.current
    val cadastroRepositorio = RepositorioCadastro()

//  Aqui começa o layout de uma logo centralizada na imagem de fundo
    Box(
        modifier = Modifier
            .fillMaxSize() // Preenche toda a tela
            .background(color = Black)
    ) {
        // Imagem de fundo
        Image(
            painter = painterResource(id = R.drawable.fundo),
            contentDescription = "",
            modifier = Modifier
                .fillMaxSize(), // Preenche a tela inteira
            contentScale = ContentScale.Crop // Mantém a proporção da imagem
        )

        // Conteúdo sobreposto
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .align(Alignment.Center), // Centraliza verticalmente no Box
            horizontalAlignment = Alignment.CenterHorizontally // Centraliza horizontalmente
        ) {
            // Logo no topo
            Image(
                painter = painterResource(id = R.drawable.logo1),
                contentDescription = "",
                modifier = Modifier
                    .size(120.dp) // Tamanho da logo
            )

            //  Aqui encerra o layout de uma logo centralizada na imagem de fundo


            Spacer(modifier = Modifier.height(32.dp)) // Espaço entre a logo e as caixas de texto


            TextField(
                value = "",
                onValueChange = {},
                placeholder = { Text(text = "Digite seu nome") },
                modifier = Modifier
                    .fillMaxWidth() // Preenche a largura disponível
            )


            Spacer(modifier = Modifier.height(16.dp)) // Espaço entre as caixas de texto

            // Caixa de texto: E-mail
            TextField(
                value = "",
                onValueChange = {},
                placeholder = { Text(text = "Digite seu e-mail") },
                modifier = Modifier
                    .fillMaxWidth() // Preenche a largura disponível
            )

            Spacer(modifier = Modifier.height(16.dp)) // Espaço entre as caixas de texto

            // Caixa de texto: Senha
            TextField(
                value = "",
                onValueChange = {},
                placeholder = { Text(text = "Digite sua senha") },
                modifier = Modifier
                    .fillMaxWidth() // Preenche a largura disponível
            )

            Spacer(modifier = Modifier.height(30.dp))

            Button(
                onClick = {

                    var mensagem: Boolean
                    scope.launch(Dispatchers.IO) {}


                },
                modifier = Modifier
                    .fillMaxWidth(10f) // Preenche 80% da largura
                    .height(50.dp), // Define a altura do botão
                colors = ButtonDefaults.buttonColors(
                    containerColor = Green // Cor de fundo do botão
                ),
                shape = androidx.compose.foundation.shape.RoundedCornerShape(8.dp) // Bordas arredondadas
            ) {
                Text(
                    text = "Cadastrar",
                    color = Color.White, // Texto em branco
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.height(16.dp)) // Espaço entre elementos

            Text(
                text = "Já tem uma conta? Fazer login",
                color = Color.White, // Texto em branco
                modifier = Modifier.clickable {
                    navController.navigate("telaInicial")
                }
            )
        }
    }
}

