package br.com.salosoftwares.apicollectionsok

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication

class TestArrayString

fun main(args: Array<String>) {
    println(LINE)
    val arrayString1 = Array<String>(4){""}
    arrayString1[0]="b"
    arrayString1[1]="a"
    arrayString1[2]="t"
    arrayString1[3]="l"
    println("arrayString1:")
    arrayString1.forEach { println(it) }
    arrayString1.sort()
    arrayString1.sort()
    println("Sorted arrayString1:")
    arrayString1.forEach { println(it) }
    println(LINE)
    println("arrayString2:")
    val arrayString2 = arrayOf("o","p","q","i")//This is an "arrayOf", where to declare the values immediately
    arrayString2.forEach {println(it)}
    println("Sorted arrayString2:")
    arrayString2.sort() //Organizes the values in alphabetical order
    arrayString2.forEach {println(it)}
    println(LINE)
}