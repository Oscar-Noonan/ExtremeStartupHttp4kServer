package com.oocode

class Answerer {
    fun answerFor(question: String): String {
        //Which of the following numbers is the largest: 15, 57, 36?
        if (question.startsWith("Which of the following numbers is the largest:")) {
            var numberStrings = question.substringAfter("Which of the following numbers is the largest:").dropLast(1).trim().split(", ")
            var numbers = mutableListOf<Int>()
            for (number in numberStrings) {
                numbers.add(number.toInt())
            }
            return numbers.max().toString()
        }
        return "oscar"
    }
}