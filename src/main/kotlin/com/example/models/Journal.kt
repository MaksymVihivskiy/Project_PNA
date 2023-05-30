package com.example.models

import java.time.LocalDate

data class Journal(
    val title: String,
    val subject: String,
    val language: String,
    val dateOfEstablishment: LocalDate,
    val issn: String,
    val recommendedPrice: Int,
    val periodical: Boolean,
    val articles: List<Article>,
) : Comparable<Journal> {
    override fun compareTo(journal: Journal): Int {
        return title.compareTo(journal.title)
    }
}