package br.com.salosoftwares.apicollections.mutables

import java.math.BigDecimal


    fun Array<BigDecimal>.summation()=this.reduce { acc, bigDecimal -> acc + bigDecimal}

    fun Array<BigDecimal>.media()=if(this.isEmpty())BigDecimal.ZERO
    else this.summation()/this.size.toBigDecimal()




