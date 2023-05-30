package com.example.models

import java.time.LocalDate

data class Article(
    val title: String,
    val author: String,
    val dateOfWriting: LocalDate,
    val numOfWords: Int,
    val numOfLinks: Int,
    val isNativeLang: Boolean
) : Comparable<Article> {
    override fun compareTo(article: Article): Int {
        return title.compareTo(article.title)
    }
}