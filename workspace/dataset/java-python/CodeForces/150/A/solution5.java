import java.util.Arrays;import java.util.Scanner; public class Main {      public static void main(String[] args) {         long n;        Scanner in = new Scanner(System.in);        n = in.nextLong();        int num = 0;        long[] ns = new long[50];        long temp = n;        for (long i = 2; i*i <= n; i ++) {            if (n%i==0) {                while (n%i==0) {                    ns[num] = i;                    num++;                    n /= i;                }                if (num>=2) break;            }        }        if (n!=temp&&n!=1) ns[num++] = n;        if (num!=2) {            System.out.println(1);            System.out.println(ns[1]*ns[0]);        }        else System.out.println(2);     }   }
