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
            //What is 82 plus 87?
            //What is 51 multiplied by 98?
        } else if (question.startsWith("What is your name?")) {
            return "oscar"
        }
        else if (question.startsWith("What is")) {
            var expressionStrings = question.substringAfter("What is ").dropLast(1).trim().split(" ")
            var numbers = mutableListOf<Int>()
            numbers.add(expressionStrings.first().toInt())
            numbers.add(expressionStrings.last().toInt())
            if (expressionStrings[1] == "plus") {
                return numbers.sum().toString()
            } else if (expressionStrings[1] == "multiplied") {
                return (numbers.first() * numbers.last()).toString()
            }
        }
        return "oscar"
    }
}