import java.util.Scanner;import java.util.Arrays;import java.util.Vector;import java.util.Collections;  public class Welcomejava {          public static Vector<Integer> divisors(int n)      {       Vector<Integer> v = new Vector<>();          while (n % 2 == 0 ) {                             v.add(2);               n/=2;          }          for (int i = 3; i <= Math.sqrt(n) + 1; i+= 2) {              while (n % i == 0) {                       v.add(i);                       n/=i;                                }          }          if (n > 2)v.add(n);          return v;             }         public static void main(String[] args) {        // TODO code application         Scanner input = new Scanner(System.in);        int n , k ;         n = input.nextInt();        k = input.nextInt();        Vector<Integer> v = new Vector<>();        v = divisors(n);        if (v.size() < k )System.out.println(-1);        else if (k == 1) System.out.println(n);                //System.out.println(v);        //System.out.println(v.size());                else if (v.size() == k)        {            for (int i = 0; i < v.size(); i++) {                System.out.print(v.get(i) + " ");            }            System.out.println();        }        else         {          int m = 1 , cnt = 0 ;          Vector<Integer> v2 = new Vector<>();            for (int i = 0; i < v.size(); i++) {                v2.add(v.get(i));                m *= v.get(i);                cnt++;                if (cnt == k - 1)                    break;            }            //System.out.println(m);            v2.add(n / m);            for (int i = 0; i < v2.size(); i++) {                System.out.print(v2.get(i) + " ");            }            System.out.println();                }                                   }}  
