package com.bigbang.githubapp

import android.app.Application
import android.content.ContextWrapper

/**
 * @author Ting
 * @date 2018/7/11
 */

private lateinit var INSTANCE: Application

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
    }
}

object AppContext : ContextWrapper(INSTANCE)