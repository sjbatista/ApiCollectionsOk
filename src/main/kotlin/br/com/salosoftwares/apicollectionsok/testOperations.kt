package br.com.salosoftwares.apicollectionsok

fun main() {
    val salary = doubleArrayOf(1200.50,1900.50,4600.20,9000.00,500.02,2.00,8500.90)
    println("salary:")
    salary.forEach { println(it) }
    println("Sort salary:")
    salary.sort()
    salary.forEach { println(it) }
    println("Highest salary:")
    println(salary.maxOrNull())
    println("Lowest salary:")
    println(salary.minOrNull())
    println("Average salary:")
    println(salary.average())
    println(LINE)
    println("High salaries:")
    val salaryFilter=salary.filter { it>1900.0 }
    salaryFilter.forEach { println(it) }
    println(LINE)
    println("How many salaries above 1000?")
    println(salary.count { it>1000.00})
    println("'.find' method using value > 4000 \n")
    println(salary.find { it>4000.00 })
    println("'.find' method using value == 2.00 \n")
    println(salary.find { it == 2.00 })
    println("'.find' method using value == 3.00 \n")
    println(salary.find { it == 3.00 })
    println("'.any' method using value == 2.00 \n")
    println(salary.any { it == 2.00 })
    println("'.find' method using value == 3.00 \n")
    println(salary.any { it == 3.00 })

}