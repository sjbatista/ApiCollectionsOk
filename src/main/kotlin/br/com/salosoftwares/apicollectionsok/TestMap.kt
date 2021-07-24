package br.com.salosoftwares.apicollectionsok

fun main() {
    val pair:Pair<String,Double> = Pair("Jao",5500.20)
    val map1=mapOf(pair)
    map1.forEach { (t, u) -> println("Chave: $t Valor: $u")}
    println(LINE)
    println("map2:")
    val map2= mapOf("lulu" to 1900,
                 "vittaos" to 8900)
    map2.forEach { (t, u) -> println("Chave: $t Valor: $u")}

}