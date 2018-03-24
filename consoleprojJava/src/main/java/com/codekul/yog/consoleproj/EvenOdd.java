package com.codekul.yog.consoleproj;

/**
 * Created by YOG on 3/24/2018.
 * Even or Odd JAVA
 */

public class EvenOdd{

    public static void main(String args[]){
        int[] num = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        System.out.println(" Passed numbers are  : ");
        for (int i = 0; i < num.length; i++) System.out.print(num[i]+",");

        System.out.println("\n Even Numbers are : ");
        for(int i=0 ; i<20 ; i++){
            if(num[i] %2 ==0 ) System.out.print(num[i] + ",");
        }
        System.out.println("\n Odd Numbers are : ");

        for(int i=0 ; i<20 ; i++){
            if(num[i] %2 !=0 ) System.out.print(num[i]+ ",");
        }


    }

}


