package com.codekul.yog.consoleproj;

/**
 * Created by YOG on 3/24/2018.
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CollectionTry {

    public static void main(String Args[]) {


/*
ArrayListTry Trial JAVA
 */
        System.out.println("ARRAY LIST : ");
        // create an empty array list with an initial capacity
        ArrayList<String> arrayList = new ArrayList<String>(5);

        // use add() method to add values in the list
        arrayList.add("White");
        arrayList.add("Black");
        arrayList .add("Red");
        arrayList.add("White");
        arrayList .add("Yellow");

        // Print out the arrayelement in the ArrayList.
        for (int i = 0; i < 5; i++)
        {
            System.out.println(arrayList.get(i).toString());
        }



        /*
HashMap has implementation based on a hash table. (Use this class instead of Hashtable which is legacy class) .The HashMap gives you an unsorted, unordered Map. When you need a Map and you don't care about the order (when you iterate through it), then HashMap is the right choice. Keys of HashMap is like Set means no duplicates allowed and unordered while values can be any object even null or duplicate is also allowed. HashMap is very much similar to Hashtable only difference is Hashtable has all method synchronized for thread safety while HashMap has non-synchronized methods for better performance.We can visualize HashMap as below diagram where we have keys as per hash-code and corresponding values.
 */
        System.out.println("HashMap : ");

        Map<Integer , String> details = new HashMap<Integer, String>();
        details.put(1,"RON");
        details.put(1,"RON"); //can't add repeated element
        details.put(2,"ROBIN");
        details.put(3,"JEN");
        details.put(4,"ALIEN");
        details.put(5,"WOHAH");
        details.put(null,"UNKNOWN"); //value can be null
        System.out.println(details);

/*
HashSet
when you want a collection with no duplicates and you don't care about the order, when you iterate through it.
 */

        System.out.println("HashSet : ");
        HashSet <String> hashSet = new HashSet<String>();
        hashSet.add("HELLO");
        hashSet.add("HELLO");
        hashSet.add("ANDROID");
        hashSet.add("JAVA");
        hashSet.add("KOTLIN");

        /* hashtag methods are size() , remove(),contains() */

        System.out.println("HashSet Elements:" + hashSet);


    }
}
