package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      method(1,2,2,3,3,4,5,6,6,7);
        }
     static void method (int ...var){
         int sum = 0;
         for (int i=0; i< var.length;i++ ){
          sum+=var[i] ;

         }
         System.out.println(sum);
     }





   }

