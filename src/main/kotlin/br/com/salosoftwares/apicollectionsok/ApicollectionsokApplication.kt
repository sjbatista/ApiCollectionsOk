package br.com.salosoftwares.apicollectionsok

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication

class ApicollectionsokApplication
const val LINE="-------------------"
fun main(args: Array<String>) {
	runApplication<ApicollectionsokApplication>(*args)
	println(LINE)
	println("intArray1:")
	val intArray1 = IntArray(5)
	intArray1[0]=5
	intArray1[1]=4
	intArray1[2]=2
	intArray1[3]=1
	intArray1[4]=3
	intArray1.forEach {println(it)}
	println("Sorted intArray1:")
	intArray1.sort()
	intArray1.forEach {println(it)}
	println(LINE)
	val intArray2 = intArrayOf(30,10,50,20,40) //This is an "intArrayOf", where to declare the values immediately
	println("intArray2:")
	intArray2.forEach {println(it)}
	intArray2.sort()
	println("Sorted intArray2:")
	intArray2.forEach {println(it)}
	println(LINE)
	println("Safe iteration of intArray2, via Index:")
	for(index in intArray2.indices){ //Safe iteration, via Index
		println(intArray2[index])
	}


}
