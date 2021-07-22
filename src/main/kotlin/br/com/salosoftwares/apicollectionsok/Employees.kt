package br.com.salosoftwares.apicollectionsok

data class Employee(val name:String,val salary:Double,val typeEmployee:String){
    override fun toString(): String="""
        Nome: $name
        Salário: $salary
        Tipo de contratação: $typeEmployee
    """.trimIndent()
}