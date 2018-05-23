package com.codekul.jsonparsetrialkotlin



data class myJson(
    val quiz: Quiz
) {
    data class Quiz(
        val sport: Sport,
        val maths: Maths
    ) {
        data class Maths(
            val q1: Q1,
            val q2: Q2
        ) {
            data class Q1(
                val question: String,
                val options: List<String>,
                val answer: String
            )
            data class Q2(
                val question: String,
                val options: List<String>,
                val answer: String
            )
        }
        data class Sport(
            val q1: Q1
        ) {
            data class Q1(
                val question: String,
                val options: List<String>,
                val answer: String
            )
        }
    }
}