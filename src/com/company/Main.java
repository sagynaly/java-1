package com.company;

import java.util.Scanner;

public class Main {
    public static void  main(String[] args ){

        

        String sagynaly ;
        final int NUM = -12;
        String word = "привет";
        sagynaly = NUM + word;
        System.out.println(NUM + "" + word + "" + sagynaly);
        if (NUM < 0 ){
            System.out.println("“Вы сохранили отрицательное число”");
        }else if (NUM >=0){
            System.out.println("Вы сохранили положительное число");
     }else {
            System.out.println("вы сохранили ноль");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("привет"+ ""+ scanner.nextLine());
    }

}
