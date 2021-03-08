package com.example.addressbook

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AddressBookApplication

fun main(args: Array<String>) {
	runApplication<AddressBookApplication>(*args)
}
