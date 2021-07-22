package br.com.salosoftwares.apicollectionsok

fun main() {

    val zeze = Employee("Zezinho",1500.05,"CLT")
    val lulu = Employee("lulu",9999.99,"PJ")
    val vittaos = Employee("Vantui",3500.05,"CLT")
    val perecles = Employee("Pericles",1350.05,"PJ")
    val moises = Employee("MoiPeixes",2000.05,"CLT")
    val jeffin = Employee("Jeffaum",8000.05,"PJ")

    val employees1 = setOf(zeze,lulu,vittaos)
    val employees2 = setOf(perecles,moises,vittaos,jeffin)

    val employeesUnion=employees1.union(employees2)
    println("Union of employees1 and employees2:")
    employeesUnion.forEach { println(it)
    println(" ")}
    println(LINE)

    val employeesSubtraction = employeesUnion.subtract(employees2)
    println("employeesUnion subtrated by employees2:")
    employeesSubtraction.forEach { println(it)
        println(" ")}
    println(LINE)

    val employeesIntersect = employees1.intersect(employees2)
    println("employees1 intersected by employees2:")
    employeesIntersect.forEach { println(it)
        println(" ")}



}