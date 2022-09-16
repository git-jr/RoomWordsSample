package com.paradoxo.roomwordssample.repository

import androidx.annotation.WorkerThread
import com.paradoxo.roomwordssample.database.dao.WordDao
import com.paradoxo.roomwordssample.model.Word
import kotlinx.coroutines.flow.Flow

class WordRepository(private val wordDao: WordDao) {

    val allWords: Flow<List<Word>> = wordDao.getAlphabetizedWords()

    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}