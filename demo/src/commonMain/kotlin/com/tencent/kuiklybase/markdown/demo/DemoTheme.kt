package com.tencent.kuiklybase.markdown.demo

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable

internal object DemoTheme {

    val colorScheme: ColorScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalColorScheme.current

}