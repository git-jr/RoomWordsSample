package com.paradoxo.roomwordssample.application

import android.app.Application
import com.paradoxo.roomwordssample.database.WordRoomDatabase
import com.paradoxo.roomwordssample.repository.WordRepository

class WordsApplication : Application() {
    val database by lazy { WordRoomDatabase.getDatabase(this) }
    val respository by lazy { WordRepository(database.wordDao()) }
}