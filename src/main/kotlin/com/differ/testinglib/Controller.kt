package com.differ.testinglib

import org.springframework.web.bind.annotation.*
import java.text.SimpleDateFormat
import java.util.*

@RestController
class Controller {
    @GetMapping(value = ["/"])
    fun home(): String {
        val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")
        return simpleDateFormat.format(Date())
    }

    @PostMapping(value = ["/people"])
    fun people(@RequestBody people: People): String {
        val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")
        return simpleDateFormat.format(Date())
    }

}