package br.com.salosoftwares.apicollections.mutables

import br.com.salosoftwares.apicollectionsok.LINE


fun main(){
        val testBigDecimalEx1 = arrayOf("1583.65".toBigDecimal(),"1685.10".toBigDecimal(),"1000.05".toBigDecimal())
        println(testBigDecimalEx1.summation())
        println(testBigDecimalEx1.media())
        println(LINE)
        testBigDecimalEx1.forEach { println(it) }
    }
