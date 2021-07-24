package br.com.salosoftwares.apicollections.mutables

import br.com.salosoftwares.apicollectionsok.Employee
import br.com.salosoftwares.apicollectionsok.LINE

fun main() {
    println(LINE)
    val jefin = Employee("Jeffin",1950.20,"PJ")
    val leo = Employee("Leon",1250.20,"PJ")
    val mikael = Employee("Mikerola",1600.20,"CLT")

    val mutableListOf1 = mutableListOf(jefin,leo,mikael)
    println("Mutable List")
    mutableListOf1.forEach{println(it)
    println(" ")}
    println(LINE)
    val pedro = Employee("Pedro",9850.50,"CLT")
    mutableListOf1.add(pedro)
    println("Mutable List after change:\n")
    mutableListOf1.forEach{println(it)
    println(" ")}
    println(LINE)
    println("Mutable SetOf:")
    val mutableSetOf1 = mutableSetOf(pedro)
    mutableListOf1.add(jefin)
    mutableListOf1.forEach{println(it)}



}