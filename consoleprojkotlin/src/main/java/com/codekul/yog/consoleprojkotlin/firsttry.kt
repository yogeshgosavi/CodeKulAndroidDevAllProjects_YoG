package com.codekul.yog.consoleprojkotlin

/**
 * Created by YOG on 3/24/2018.
 */
/**
 * Created by YOG on 3/9/2018.
 */
/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */

var AutoDet = "Auto Detects veriable type"  ///Auto detects veriable type by value

var num1  = 10

var num2 : Int = 20

var sum : Int = 0

var var1 : Any =0;


val Strdata = """
helllo i am yog
i am here at codekul
"""
fun sunmof () = (num1+num2)


fun sumwithreturn() : Int {
    sum=num1+num2
    return sum
}



fun main(args : Array<String>){
    println(AutoDet)
    println()
    sum = num1+num2
    println(sum)

    println(sunmof())

    println( "Var with any type:  \n Var = $var1 " )
    var1 = "String stored"
    println(" var = $var1")

    println("Sum returned with return ${sumwithreturn()}")

}