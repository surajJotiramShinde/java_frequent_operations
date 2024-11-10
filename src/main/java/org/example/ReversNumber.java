package org.example;

public class ReversNumber {

    public static void main(String[] args) {

        int number=2341;
        int revers=0;
        while(number!=0){
            revers =  revers * 10 + number % 10 ;
            number = number / 10;
        }
        System.out.println(revers);
    }
}
