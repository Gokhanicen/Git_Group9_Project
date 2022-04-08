package practice01;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter your numbers");
        Scanner scan = new Scanner(System.in);
                int nums = scan.nextInt();
                boolean result = true;
if(nums<= 1){
    result = false;
}
        for (int i = 2; i < nums; i++) {
    if(nums % i ==0){
        result =false;
    }


        }
        System.out.println(result);


    }





}
