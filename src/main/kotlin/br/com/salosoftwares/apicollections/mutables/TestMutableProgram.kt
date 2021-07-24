package br.com.salosoftwares.apicollections.mutables

import br.com.salosoftwares.apicollectionsok.Employee
import br.com.salosoftwares.apicollectionsok.LINE

fun main() {
    val pimpolho = Employee("pimpolho",1500.05,"CLT")
    val tiuu = Employee("tiuu",9999.99,"PJ")
    val vemk = Employee("vemk",3500.05,"CLT")
    val piupiu = Employee("piupiu",1350.05,"PJ")
    val gordox = Employee("gordox",2000.05,"CLT")

    val testRepositorio1 = TestRepositorio<Employee>()
    testRepositorio1.create(pimpolho.name,pimpolho)
    testRepositorio1.create(tiuu.name,tiuu)
    testRepositorio1.create(vemk.name,vemk)
    testRepositorio1.create(piupiu.name,piupiu)
    testRepositorio1.create(gordox.name,gordox)
    testRepositorio1.printAllValues()
    println(LINE)
    testRepositorio1.removeById(piupiu.name)
    testRepositorio1.printAllValues()
}