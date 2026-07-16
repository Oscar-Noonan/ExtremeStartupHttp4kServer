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
}
