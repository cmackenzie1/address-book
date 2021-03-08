package com.example.addressbook.graphql

import com.expediagroup.graphql.spring.operations.Query
import org.springframework.stereotype.Component

@Component
class Queries : Query {
    fun hello() : String = "Hi!"
}