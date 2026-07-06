package com.tencent.kuiklybase.markdown.qqkuiklybase

import com.tencent.kuiklybase.markdown.model.ImageData
import com.tencent.kuiklybase.markdown.model.ImageLinkHandlerImpl

class DemoImageLinkHandler : ImageLinkHandlerImpl() {
    override fun preview(image: ImageData) {
        println("preview images: $image")
    }
}