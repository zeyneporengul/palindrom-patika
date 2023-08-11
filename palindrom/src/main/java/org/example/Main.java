package org.example;
import java.util.Scanner;
public class Main {
    static boolean isPalindrom(int number){
        int temp = number, reverse = 0, lastNumber;
        while(temp!=0){
            lastNumber = temp%10;
            reverse = (reverse*10) + lastNumber;
            temp /= 10;
        }
        if(number==reverse){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();
        System.out.println(isPalindrom(number));
    }
}