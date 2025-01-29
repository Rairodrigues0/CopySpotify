package com.rai.spotify.repositorio

import com.rai.spotify.datasource.DataSource

class RepositorioCadastro() {

    private val dataSource = DataSource()
    fun salvar(nome: String, email: String, senha: String){
        dataSource.salvar(nome, email, senha)
    }
}