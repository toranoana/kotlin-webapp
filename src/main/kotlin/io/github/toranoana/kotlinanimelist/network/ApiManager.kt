package io.github.toranoana.kotlinanimelist.network

import com.github.kittinunf.fuel.gson.gsonDeserializerOf
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.fuel.rx.rx_object
import io.github.toranoana.kotlinanimelist.logger
import io.github.toranoana.kotlinanimelist.network.model.response.AnimeResponse
import io.reactivex.Single

const val API_URI = "http://api.moemoe.tokyo/anime/v1/"

class ApiManager {
    private val logger by logger()

    fun getAnimeList(): Single<List<AnimeResponse>> =
        "${API_URI}master/2018/1?ogp=1"
            .httpGet()
            .rx_object(gsonDeserializerOf<List<AnimeResponse>>())
            .map {
                // TODO : ログ出力
                logger.info(it.toString())
                it.component1() ?: throw it.component2() ?: throw Exception()
            }
}