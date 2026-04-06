package com.aline.consumoapi.service

import com.aline.consumoapi.model.Endereco
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface EnderecoService {
    //interface é um intermediario uma padronizacao que vai ensinar como usar nossa api
    //usa call para ensinar o que precisa passar e o que sera retornado
    //api é uma interface onde instrui como algo funciona e de qual forma e o resultado esperado
    //quem esta interagindo e agindo.
    //retrofit cliente http


    //https://viacep.com.br/ws/01001000/json/
    @GET("{cep}/json/")
    fun getEnderecoByCep(@Path("cep") cep: String) : Call<Endereco>

    //viacep.com.br/ws/RS/Porto Alegre/Domingos/json/
    //viacep.com.br/ws/RS/Porto Alegre/Domingos Jose/json/
    @GET("{uf}/{cidade}/{rua}/json/")
    fun getEnderecosByUfCidadeRua(
        @Path("uf") uf:String,
        @Path("cidade") cidade:String,
        @Path("rua") rua:String,
    ) : Call<List<Endereco>>
}



//fabrica de clientes conexoes http
//configuracao