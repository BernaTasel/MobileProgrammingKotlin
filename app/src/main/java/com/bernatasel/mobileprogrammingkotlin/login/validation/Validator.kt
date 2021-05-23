package com.bernatasel.mobileprogrammingkotlin.login.validation

interface Validator {
    fun validate(field: String): Int?
}