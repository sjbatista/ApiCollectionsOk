package br.com.salosoftwares.apicollectionsok

fun main() {
    val zeze = Employee("Zezinho",1500.05)
    val lulu = Employee("lulu",9999.99)
    val vittaos = Employee("Vantui",3500.05)
    val perecles = Employee("Pericles",1350.05)
    val moises = Employee("MoiPeixes",2000.05)
    val employees = listOf(zeze,lulu,vittaos,perecles,moises)
    employees.forEach { println(it) }
    println(LINE)
    println("lulu's information")
    println(employees.find { it.name=="lulu" })
    println(LINE)
    employees.sortedBy { it.salary }.forEach { println(it) }
}
data class Employee(val name:String,val salary:Double){
    override fun toString(): String="""
        Nome: $name
        Salário: $salary
    """.trimIndent()
    }
