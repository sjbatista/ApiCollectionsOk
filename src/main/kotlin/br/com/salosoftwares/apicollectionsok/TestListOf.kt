package br.com.salosoftwares.apicollectionsok

fun main() {
    val zeze = Employee("Zezinho",1500.05,"CLT")
    val lulu = Employee("lulu",9999.99,"PJ")
    val vittaos = Employee("Vantui",3500.05,"CLT")
    val perecles = Employee("Pericles",1350.05,"PJ")
    val moises = Employee("MoiPeixes",2000.05,"CLT")
    val employees = listOf(zeze,lulu,vittaos,perecles,moises)
    employees.forEach { println(it) }
    println(LINE)
    println("lulu's information")
    println(employees.find { it.name=="lulu" })
    println(LINE)
    employees.groupBy { it.typeEmployee }.forEach { println(it) }
}

