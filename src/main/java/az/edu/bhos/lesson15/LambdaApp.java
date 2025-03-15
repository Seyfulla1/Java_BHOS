package az.edu.bhos.lesson15;

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

    }

}
