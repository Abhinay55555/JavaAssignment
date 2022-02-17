package prg1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner kh = new Scanner(System.in);
        int f = kh.nextInt();
        int fact = 1;
        int i = 1;
        do{
            fact = fact * i;//1*2*3*4*5
            i++;
        }
        while(i<=f);
        System.out.println("Factorial of "+ --i + " is " + fact);
    }
}
