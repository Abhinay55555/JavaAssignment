package prg1;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner kh = new Scanner(System.in);
        int A = kh.nextInt() , org , rem , op = 0;
        org = A;

        while (org !=0){
            rem = org % 10;
            op +=Math.pow(rem,3);
            org = org/10;
        }
        if(op == A){
            System.out.println("It is an Armstrong number");
        }
        else{
            System.out.println("It is not an Armstrong number");
        }
// 153 = (1*1*1) + (5*5*5) + (3*3*3) = (1) + (125) + (27) = 153
        // 0,1,153,370,371,407  --> These are Armstrong numbers below 1000
    }
}
