/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundtosecondprime;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class RoundToSecondPrime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<5;i++) {
            System.out.println(roundToSecondPrime(sc.nextInt()));
        }
    }

    private static int roundToSecondPrime(int a) {
        
        int i=getPrimeLess(getPrimeLess(a));
        int j=getPrimeGreat(getPrimeGreat(a));
        if (j-a<=a-i) return j;
        else return i;
    }
    
    private static int getPrimeLess(int a) {
        a--;
        while (!isPrime(a)) a--;
        return a;
    }
    private static int getPrimeGreat(int a) {
        a++;
        while (!isPrime(a)) a++;
        return a;
    }

    private static boolean isPrime(int a) {
        for (int i=2;i<a;i++) {
            if (i*i>a) return true;
            if (a%i==0) return false;
        }
        return true;
    }
}
