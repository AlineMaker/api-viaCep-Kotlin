package com.aline.consumoapi.model

import com.google.gson.annotations.SerializedName

//gjon para indicar que vi extrair de um nome diferente os dados que quero como rua e cidade
data class Endereco (
    val cep: String = "",
    @SerializedName("logradouro") val rua: String = "",
    @SerializedName("localidade")val cidade: String = "",
    val bairro: String = "",
    val uf: String = ""
)

//ele procura o item para comecar instanciar
//criar uma service