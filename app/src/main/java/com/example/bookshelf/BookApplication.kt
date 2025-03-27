package com.example.bookshelf

import android.app.Application
import com.example.bookshelf.data.RepositoryContainer
import com.example.bookshelf.data.DefaultRepositoryContainer

class BookApplication : Application() {
    lateinit var container: RepositoryContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultRepositoryContainer()
    }
}