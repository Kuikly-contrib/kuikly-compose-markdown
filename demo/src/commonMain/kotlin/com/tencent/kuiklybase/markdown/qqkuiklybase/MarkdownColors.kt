package com.tencent.kuiklybase.markdown.qqkuiklybase

import androidx.compose.runtime.Composable
import com.tencent.kuikly.compose.ui.graphics.Color
import com.tencent.kuiklybase.markdown.model.DefaultMarkdownColors
import com.tencent.kuiklybase.markdown.model.MarkdownColors

@Composable
internal fun markdownColor(
    text: Color = DemoTheme.colorScheme.t1,
    codeBackground: Color = DemoTheme.colorScheme.bgBlock,
    inlineCodeBackground: Color = codeBackground,
    dividerColor: Color = DemoTheme.colorScheme.lineFine,
    tableBackground: Color = DemoTheme.colorScheme.bgBlock,
    tableStroke: Color = DemoTheme.colorScheme.lineStroke,
    tableHeaderBackground: Color = DemoTheme.colorScheme.newBgBlock,
): MarkdownColors = DefaultMarkdownColors(
    text = text,
    codeText = Color.Unspecified,
    inlineCodeText = Color.Unspecified,
    linkText = Color.Unspecified,
    codeBackground = codeBackground,
    inlineCodeBackground = inlineCodeBackground,
    dividerColor = dividerColor,
    tableText = Color.Unspecified,
    tableBackground = tableBackground,
    tableHeaderBackground = tableHeaderBackground,
    tableStroke = tableStroke
)