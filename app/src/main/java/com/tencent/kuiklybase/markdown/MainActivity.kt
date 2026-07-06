package com.tencent.kuiklybase.markdown

import android.util.Log
import com.tencent.kuiklybase.markdown.ui.AndroidComposePageActivity

class MainActivity : AndroidComposePageActivity() {
    override fun onCreateComposePage() {
        compose.onCreate(
            this.application,
            findViewById(android.R.id.content),
            "demo",
            onFirstFrame = {
                Log.d("ComposePage", "onFirstFrame")
            }
        )
    }
}
