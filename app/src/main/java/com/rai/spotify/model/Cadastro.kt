package com.rai.spotify.model

data class Cadastro(
    val nome: String? = null,
    val email: String? = null,
    val senha: String? = null
)
fun dados(){
    val nome = Cadastro().nome
    val email = Cadastro().email
    val senha = Cadastro().senha
}
