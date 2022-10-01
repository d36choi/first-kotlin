package com.example.firstkotlin

import com.example.firstkotlin.configuration.BlogProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class FirstKotlinApplication

fun main(args: Array<String>) {
	runApplication<FirstKotlinApplication>(*args)
}
