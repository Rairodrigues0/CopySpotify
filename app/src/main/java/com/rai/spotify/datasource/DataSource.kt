package com.rai.spotify.datasource

import com.google.firebase.Firebase
import com.google.firebase.firestore.FirebaseFirestore

class DataSource {

    private val bancoDados = FirebaseFirestore.getInstance()
    fun salvar(nome: String, email: String, senha: String){

        val cadastrosMap = hashMapOf(
            "nome" to nome,
            "email" to email,
            "senha" to senha
        )
        bancoDados.collection("cadastro").document("cadastro").set(cadastrosMap).addOnCompleteListener{

        }.addOnFailureListener{}
    }
}