package com.tencent.kuiklybase.markdown

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.tencent.kuikly.compose.ui.Modifier
import com.tencent.kuiklybase.markdown.annotator.LocalUriHandler
import com.tencent.kuiklybase.markdown.annotator.UriHandler
import com.tencent.kuiklybase.markdown.compose.Markdown
import com.tencent.kuiklybase.markdown.model.MarkdownState
import com.tencent.kuiklybase.markdown.model.markdownPadding
import com.tencent.kuiklybase.markdown.qqkuiklybase.DemoImageLinkHandler
import com.tencent.kuiklybase.markdown.qqkuiklybase.markdownColor
import com.tencent.kuiklybase.markdown.qqkuiklybase.markdownTypography
import com.tencent.kuiklybase.markdown.qqkuiklybase.rememberMarkdownRefAnnotator
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


@Composable
fun ThemedMarkdown(
    modifier: Modifier = Modifier,
    state: MarkdownState,
) {

    CompositionLocalProvider(
        LocalUriHandler provides object : UriHandler {
            override suspend fun openUri(uri: String) = withContext(Dispatchers.Main) {
                println("openUri: $uri")
            }

            override suspend fun openRef(ref: List<String>, x: Float, y: Float) = withContext(Dispatchers.Main) {
                println("openRef: $ref, $x, $y")
            }
        },
    ) {

        Markdown(
            state = state,
            modifier = modifier,
            padding = markdownPadding(),
            colors = markdownColor(),
            typography = markdownTypography(),
            annotator = rememberMarkdownRefAnnotator(state),
            imageLinkHandler = DemoImageLinkHandler()
        )
    }
}

