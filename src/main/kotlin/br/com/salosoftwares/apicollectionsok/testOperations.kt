package br.com.salosoftwares.apicollectionsok

fun main() {
    val salary = doubleArrayOf(1200.50,1900.50,4600.20,9000.00,500.02,2.00,8500.90)
    println("salary:")
    salary.forEach { println(it) }
    println("Sort salary:")
    salary.sort()
    salary.forEach { println(it) }
    println("Highest salary:")
    println(salary.max())
    println("Lowest salary:")
    println(salary.min())
    println("Average salary:")
    println(salary.average())
    println(LINE)
    println("High salaries:")
    val salaryFilter=salary.filter { it>1900.0 }
    salaryFilter.forEach { println(it) }



}