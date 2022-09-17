package com.paradoxo.roomwordssample.application

import android.app.Application
import com.paradoxo.roomwordssample.database.WordRoomDatabase
import com.paradoxo.roomwordssample.repository.WordRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class WordsApplication : Application() {
    val applicationScope = CoroutineScope(SupervisorJob())

    val database by lazy { WordRoomDatabase.getDatabase(this, applicationScope) }
    val respository by lazy { WordRepository(database.wordDao()) }

}