package com.example.models

interface Container<T> {
    fun add(journal: T)
    fun remove(index: Int)
    fun update(index: Int, journal: T)
    fun get(index: Int): T
    fun getAll(): List<T>
}

class JournalContainer : Container<Journal> {
    private val journals: MutableList<Journal> = mutableListOf()
    override fun add(journal: Journal) {
        journals.add(journal)
    }

    override fun remove(index: Int) {
        journals.removeAt(index)
    }

    override fun update(index: Int, journal: Journal) {
        journals[index] = journal
    }

    override fun get(index: Int): Journal {
        return journals[index]
    }

    override fun getAll(): List<Journal> {
        return journals
    }
}