package io.github.toranoana.kotlinanimelist.network

import com.github.kittinunf.fuel.gson.gsonDeserializerOf
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.fuel.rx.rx_object
import io.github.toranoana.kotlinanimelist.logger
import io.github.toranoana.kotlinanimelist.network.model.Anime
import io.reactivex.Single


class ApiManager {
    companion object {
        private val API_URI = "http://api.moemoe.tokyo/anime/v1/"
        private val logger by logger()
    }

    fun getAnimeList(): Single<List<Anime>> =
        "${API_URI}master/2018/1?ogp=1"
            .httpGet()
            .rx_object(gsonDeserializerOf<List<Anime>>())
            .map {
                it.component1() ?: throw it.component2() ?: throw Exception()
            }
}