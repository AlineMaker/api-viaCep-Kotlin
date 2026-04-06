package com.aline.consumoapi.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {

    val Base_URL = "https://viacep.com.br/ws/"
    private val retrofitFactory = Retrofit
        .Builder()// metodo biulder trazer as configuracoes
        .addConverterFactory(GsonConverterFactory.create())//
        .baseUrl(Base_URL)
        .build()// instanciar com as configuracoes pedidas ele nao é a requisicao é uma configurtacao para requisicao
    //http ->gson -> objeto
    //gson eh um intermediario
    //service execucao de algo especifico assim com api
    // quem controlaa eh a controller eh a service fecture


    //essa nao eh a requisicao eh a instruvcao que vai auxiliar a fazer a requisicao corretamente
    fun  getEnderecoService(): EnderecoService {
        return retrofitFactory.create(EnderecoService::class.java)
    }
}