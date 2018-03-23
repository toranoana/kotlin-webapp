package io.github.toranoana.kotlinanimelist.network.model.response

import io.github.toranoana.kotlinanimelist.network.model.Ogp

data class AnimeResponse(
    // TODO : API から取得する項目を追加
    val id: Int = 0,
    val title: String = "",
    val public_url: String = "",
    val twitter_hash_tag: String = "",
    val ogp: Ogp = Ogp()
)