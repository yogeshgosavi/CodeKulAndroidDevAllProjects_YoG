package com.codekul.yog.consoleprojkotlin

/**
 * Created by YOG on 3/24/2018.
 */
/**
 * Created by YOG on 3/13/2018.
 */
/*
codekul Practice Oops Concepts
 13/3/18
 */

//Interfaces
interface Carpurchase {
    fun display(){
    }
}

//class without anything
class empty

//class with veriables and data
open class demo {
    var num : Int =10
    fun demomethod() {
        println(num)
    }

    fun demoinline() : Int = num //Inline function  returns $num

}

//Exending class
class demo1 (
        //constructor or properties

): demo() {

}

/*Constructors
Types : primary Constructors  , Secondary Constructors
*/
//Primary Constructor example
open class car (
        //primary constructors
        private var price : Int =100
){
    //  fuction without parameter
//fun price() {
//    println(" The price of Car is : $price")
//}
    fun price(price : Int = 10){
        println("The price of Car is : $price")
    }
}
//secondary Constructor example
open class car1{
    private var carname:String = "BMW" //default value BMW
    constructor(tx : String){
        this.carname=tx
    }
}
/*Assigning value to the constructor
var car_1 = car1("AUDI") //Assigning constructor value
*/

/*
inheritance
Types of classes : Opened class sealed Class
*/


class BMW  (
        private var  price: Int =50,
        private  var tx: String ,
        private var speed :Float ): car1 (tx = "BMW Sample"){
    fun print(){
        println( "Name of Car : $tx \nPrice of Car : $price \nSpeed of Car : $speed")
    }
}



fun main(args: Array<String>) {
    //Demo class

    var var1 = demo() //object of class

    var1.demomethod(); //accessing class method

    var num1= var1.demoinline() +1
    println(num1)

    //Car Class
    var cars = car() //object of car class
    cars.price() //calling function
    //calling fuction with optional input value
    cars.price(100)

    //Car_1 Class
    var car_1 = car1("AUDI") //Assigning constructor value
    println(car_1)
//BMW class
    var bmw = BMW(10,"BMW i10",100f)
    bmw.print()

    //overloading method of Interface
    var carp = object : Carpurchase{
    }
}
