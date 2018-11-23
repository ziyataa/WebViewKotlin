package com.ziyata.webviewkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO Menyeting agar javascriptnya dapat digunakan di aplikasi kita
        layoutWebView.settings.javaScriptEnabled
        //TODO Menampung alamat website
        layoutWebView.loadUrl("https://idn.sch.id/")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_web_view, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean = when (item?.itemId) {
        R.id.webProfile -> {
            layoutWebView.loadUrl("https://idn.sch.id/profil/")
            true
        }
        R.id.webDaftar -> {
            layoutWebView.loadUrl("https://idn.sch.id/daftar/")
            true
        }

        R.id.webTarget -> {
            layoutWebView.loadUrl("https://idn.sch.id/program/")
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}
