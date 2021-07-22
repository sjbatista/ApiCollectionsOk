package br.com.salosoftwares.apicollectionsok

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication

class TestArraysDouble

fun main(args: Array<String>) {

    var doubleArray1 = DoubleArray(4)
    doubleArray1[0] = 1245.2
    doubleArray1[1] = 1355.3
    doubleArray1[2] = 2144.8
    doubleArray1[3] = 4612.2
    println(LINE)
    println("doubleArray1:")
    doubleArray1.forEach { println(it) }
    println("Sorted doubleArray1:")
    doubleArray1.sort()
    doubleArray1.forEach { println(it) }
    println(LINE)
    }


