package com.droidli.dictionaryapi.feature_dictionary.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.droidli.dictionaryapi.feature_dictionary.domain.model.Meaning
import com.droidli.dictionaryapi.feature_dictionary.domain.model.WordInfo

@Entity(tableName = "wordInfoEntity")
data class WordInfoEntity(
    val word: String,
    val phonetic: String,
    val origin: String,
    val meanings: List<Meaning>,
    @PrimaryKey val id: Int? = null
) {
    fun toWordInfo(): WordInfo {
        return WordInfo(
            meanings = meanings,
            word = word,
            phonetic = phonetic,
            origin = origin
        )
    }
}
