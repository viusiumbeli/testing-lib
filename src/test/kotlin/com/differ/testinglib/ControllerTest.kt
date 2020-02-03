package com.differ.testinglib

import com.differ.differcore.controllers.DifferController
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.ContextConfiguration

@WebMvcTest(DifferController::class)
@ContextConfiguration(classes = [Application::class])
internal class ControllerTest {

    @Test
    fun home() {
        assertTrue(true)
    }
}