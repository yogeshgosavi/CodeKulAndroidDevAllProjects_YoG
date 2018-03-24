package com.codekul.yog.consoleprojkotlin

/**
 * Created by YOG on 3/24/2018.
 */

/*
Demonstrating use of , list , map , hashmap , hashset , Arrays
 */
fun list (){
    val smplist = arrayListOf<String>()
    smplist.add("THIS")
    smplist.add("IS")
    smplist.add("SAMPLE")
    smplist.add("LIST")
    smplist.add("EXAMPLE")
    //for loop for list
    smplist.forEach { //if function have only one perameter kotlin consider it as "$it
        println(it)
    }
    for (i in smplist) println(i) //you can use anything instead of i

    for( i in 1..22) println(i)
}

//Map
fun map(){
    val mp = mapOf(
            1 to "^_^",
            2 to "AWESOME",
            3 to "MAP"
    )
    mp.forEach { t, u -> println("key : $t value : $u")  }
}

fun hashmap(){
    var hmp= hashMapOf<Int, String>()
    hmp.put(1,"hello")
    hmp[2]="YOG"

    hmp.forEach { (t, u )-> println("key : $t value : $u")  }
    hmp.forEach ({ t, u -> println("key : $t value : $u")   })
    println(hmp[1])
    hmp.forEach(fun(t,u){
        println("key : $t value : $u")
    })
}

fun set(){ //set doesn't allow duplicate entries , order will not remain same
    var st= hashSetOf<String>()
    st.add("El 1")
    st.add("El 1")
    st.add("E2 2")

    st.forEach { println(it) }
}


    fun main(args: Array<String>) {
//list()
//map()
//hashmap()
        set()
    }
