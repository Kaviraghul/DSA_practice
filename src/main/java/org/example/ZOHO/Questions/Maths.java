package org.example.ZOHO.Questions;

import java.util.ArrayList;

public class Maths {

    // Program to find Prime Numbers Between given Interval

    public void PrimeNumbBtwRange(int A, int B){
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = A+1; i < B; i++){
            int x = 2;
            boolean isPrime = true;
            while (x*x <= i){
                if(i % x == 0){
                    isPrime = false;
                    break;
                }
                x++;
            }
            if(isPrime)ans.add(i);
        }
        System.out.println(ans);
    }

    // Twisted Prime Number

    public void TwistedPrimeNumber(int A){
        int temp = A;
        int twisted_A = 0;

        for(int i = 0; i < Integer.toString(A).length(); i++){
            int x = temp % 10;
            twisted_A = twisted_A*10 + x;
            temp = temp/10;
        }

        boolean A_prime = true, twisted_A_prime = true;

        for(int i = 2; i*i <=  A; i++){
            if(A % i == 0){
                A_prime = false;
                break;
            }
        }

        for(int i = 2; i*i <=  twisted_A; i++){
            if(twisted_A % i == 0){
                twisted_A_prime = false;
                break;
            }
        }

        System.out.println(A_prime && twisted_A_prime);

    }

}
