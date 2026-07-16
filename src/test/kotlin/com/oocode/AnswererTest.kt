package com.oocode

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.jupiter.api.Test

class AnswererTest {
    @Test
    fun canAnswerMyName() {
        val contents = Answerer().answerFor("What is your name?")
        assertThat(contents, equalTo("oscar"))
    }

    @Test
    fun plusQuestion() {
        val contents = Answerer().answerFor("What is 82 plus 87?")
        assertThat(contents, equalTo("169"))
    }

    @Test
    fun multipliedQuestion() {
        val contents = Answerer().answerFor("What is 4 multiplied 5?")
        assertThat(contents, equalTo("20"))
    }

    @Test
    fun minusQuestion() {
        val contents = Answerer().answerFor("What is 6 minus 2?")
        assertThat(contents, equalTo("4"))
    }

    @Test
    fun largestNumberQuestion() {
        val contents = Answerer().answerFor("Which of the following numbers is the largest: 15, 57, 36?")
        assertThat(contents, equalTo("57"))
    }

    @Test
    fun edevvfdQuestion() {
        val contents = Answerer().answerFor("Which of the following numbers are primes: 3, 4, 5?")
        assertThat(contents, equalTo("3, 5"))
    }
}
