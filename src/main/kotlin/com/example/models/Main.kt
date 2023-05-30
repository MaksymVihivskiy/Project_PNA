package com.example.models

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import java.time.LocalDate

@SpringBootApplication
class Main

fun main() {
    val journalContainer =
        AnnotationConfigApplicationContext(AppConfig::class.java).getBean(Container::class.java) as JournalContainer

    val timeArticles = listOf(
        Article(
            "Biden Relents To Ukrainian Pressure For Fighter Jets",
            "W.J. HENNIGAN",
            LocalDate.of(2023, 5, 19),
            850,
            10,
            true
        ),
        Article(
            "Over 20,000 Wagner Fighters Dead in Drawn-Out Battle for Bakhmut, Chief Says",
            "JOANNA KOZLOWSKA AND SUSIE BLANN / AP",
            LocalDate.of(2023, 5, 24),
            1220,
            18,
            true
        ),
    )

    val theEconomistArticles = listOf(
        Article(
            "Who are the militias raiding Russia’s Belgorod region?",
            "The Economist",
            LocalDate.of(2023, 5, 25),
            1100,
            20,
            true
        ),
        Article(
            "Volodymyr Zelensky’s European trip secures a lot more military backing",
            "The Economist",
            LocalDate.of(2023, 5, 18),
            980,
            12,
            true
        ),
    )

    journalContainer.add(
        Journal(
            "Time",
            "Informative",
            "English",
            LocalDate.of(1923, 1, 1),
            "0040-781X",
            5,
            true,
            timeArticles,
        ),
    )

    journalContainer.add(
        Journal(
            "The Economist",
            "Informative",
            "English",
            LocalDate.of(1843, 9, 1),
            "0013-0613",
            4,
            true,
            theEconomistArticles,
        ),
    )
}
