import java.util.Scanner;import java.util.Arrays;import java.util.Vector;import java.util.Collections;  public class Welcomejava {        public static Vector<Integer> divisors(int n )    {       Vector<Integer> v = new Vector<>();       int i = 1;        while (i * i <= n) {                if (n % i == 0)                {                 if (n / i == i)                 {                  v.add(i);                 }                 else{                  v.add(i);                  v.add(n / i);                 }                }                i ++;                    }              return v;        }         public static void main(String[] args) {        // TODO code application         Scanner input = new Scanner(System.in);        int n = input.nextInt();        Vector<Integer> v = new Vector<>();        v = divisors(n);        Collections.sort(v);        //System.out.println(v);        for (int i = v.size()-1 ; i >= 0; i--) {            boolean flag = true;                          for (int j = 1; j <= 32; j++) {                    double x = Math.pow(2, j) - 1;                    double y = Math.pow(2, j - 1);                    if (x * y == v.get(i) )                    {                        System.out.println(v.get(i));                        flag = false;                        break;                    }                                   }                if (flag == false)                    break;                        }                     }}  