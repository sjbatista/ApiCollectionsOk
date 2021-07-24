package br.com.salosoftwares.apicollections.mutables

class TestRepositorio<T> {
    private val map1 = mutableMapOf<String,T>()

    fun create(id: String, value:T){map1[id]=value}
    fun findById(id: String)=map1[id]
    fun printAllValues()=map1.forEach{println(it)
    println(" ")}

}