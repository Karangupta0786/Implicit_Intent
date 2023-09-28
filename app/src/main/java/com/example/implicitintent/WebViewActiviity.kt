package com.example.implicitintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class WebViewActiviity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view_activiity)

        val web = findViewById<WebView>(R.id.webView)
        loadWeb(web)


    }

    private fun loadWeb(web: WebView?) {
        web?.webViewClient = WebViewClient()
        web?.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://github.com/Karangupta0786")
        }

    }
}