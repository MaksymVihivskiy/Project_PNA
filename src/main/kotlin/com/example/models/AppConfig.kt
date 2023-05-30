package com.example.models

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class AppConfig {
    @Bean
    open fun journalContainer(): JournalContainer {
        return JournalContainer()
    }
}