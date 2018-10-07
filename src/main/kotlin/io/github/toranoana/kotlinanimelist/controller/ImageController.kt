package io.github.toranoana.kotlinanimelist.controller

import org.springframework.http.HttpEntity
import org.apache.catalina.manager.StatusTransformer.setContentType
import org.springframework.http.HttpHeaders
import java.io.IOException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.io.ResourceLoader
import org.springframework.core.io.support.ResourcePatternUtils
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import java.io.File
import java.util.*


@RestController
class ImageController {

    @Autowired
    var resourceLoader: ResourceLoader? = null

    @ResponseBody
    @RequestMapping("/image", method = [(RequestMethod.GET)])
    @Throws(IOException::class)
    fun getImage(
            @RequestParam(value = "a", required = false)
            a: String
    ): HttpEntity<ByteArray> {
        val resources = ResourcePatternUtils.getResourcePatternResolver(resourceLoader).getResources("classpath:/static/*");
        val rand = Random()
        val randomInt = rand.nextInt(resources.size);

        // リソースファイルを読み込み
        //val resource = resourceLoader!!.getResource("classpath:/static/DSC00011.JPG")
        val image = resources[randomInt].getInputStream()

        // byteへ変換
        val b = image.readBytes();

        // レスポンスデータとして返却
        val headers = HttpHeaders()
        headers.contentType = MediaType.IMAGE_JPEG
        headers.contentLength = b.size.toLong()
        return HttpEntity(b, headers)
    }

    @ResponseBody
    @RequestMapping("/images/hoge.jpg", method = [(RequestMethod.GET)])
    @Throws(IOException::class)
    fun getImageJpg(): HttpEntity<ByteArray> {

        // リソースファイルを読み込み
        val resource = resourceLoader!!.getResource("classpath:/static/DSC00011.JPG")
        val image = resource.getInputStream()

        // byteへ変換
        val b = image.readBytes();

        // レスポンスデータとして返却
        val headers = HttpHeaders()
        headers.contentType = MediaType.IMAGE_JPEG
        headers.contentLength = b.size.toLong()
        return HttpEntity(b, headers)
    }

}