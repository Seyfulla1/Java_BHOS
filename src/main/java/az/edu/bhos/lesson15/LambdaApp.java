package az.edu.bhos.lesson15;

import java.awt.*;
import java.util.Scanner;
public class LambdaApp {
    public static void main(String[] args) {
        IsOdd oddCheck=(num)->num%2!=0;
        IsPrime primeCheck=(num)->{
            if(num<2) return false;
            for(int i=2;i<=num/2;i++){
                if(num%i==0) return false;
            }
            return true;
        };
        IsPalindrome palindromeCheck=(num)->{
            int temp=num;
            int reverse=0;
            while(temp!=0){
                reverse=reverse*10+temp%10;
                temp/=10;
            }
            return num==reverse;
        };
        Scanner sc=new Scanner(System.in);
        int testNum=sc.nextInt();
        for(int i=0;i<testNum;i++){
          int operation=sc.nextInt();
          int num=sc.nextInt();
            switch(operation){
                case 1:
                    System.out.println(oddCheck.isOdd(num)? "ODD":"EVEN");
                    break;
                case 2:
                    System.out.println(primeCheck.isPrime(num)? "PRIME":"COMPOSITE");
                    break;
                case 3:
                    System.out.println(palindromeCheck.isPalindrome(num)? "PALINDROME":"NOT PALINDROME");
                    break;
            }
        }
    }

}
