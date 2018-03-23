package io.github.toranoana.kotlinanimelist.controller

import io.github.toranoana.kotlinanimelist.network.ApiManager
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/")
class AnimeController {
    val api = ApiManager()

    @GetMapping("/")
    fun list(
        model: Model
    ): String {
        // API からアニメ情報を取得
        val animes = api.getAnimeList().blockingGet()
        // ビューに値をセット
        model.addAttribute("animes", animes)
        // ビューを表示
        return "list"
    }

    @GetMapping("/detail")
    fun detail(
        @RequestParam(value = "id", required = true)
        id: Int,
        model: Model
    ): String {
        // TODO : 詳細ページを作成
        // API からアニメ情報を取得
        val animes = api.getAnimeList().blockingGet()
        // リストから ID に一致するアニメを探す
        // ビューに値をセット
        // ビューに表示 : return "detail"
        return ""
    }
}
