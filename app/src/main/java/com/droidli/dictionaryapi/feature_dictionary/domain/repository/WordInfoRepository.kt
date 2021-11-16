package com.droidli.dictionaryapi.feature_dictionary.domain.repository

import com.droidli.dictionaryapi.core.util.Resource
import com.droidli.dictionaryapi.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}