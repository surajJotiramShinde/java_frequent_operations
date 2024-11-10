package org.example;

public class ReversNumber {

    public static void main(String[] args) {

        int number=2341;
        int revers=0;

        StringBuffer stringBuffer=new StringBuffer(Integer.toString(number));
        stringBuffer.reverse();
        revers = Integer.parseInt(stringBuffer.toString());

        System.out.println(revers);


    }
}
