/* * To change this license header, choose License Headers in Project Properties. * To change this template file, choose Tools | Templates * and open the template in the editor. */  import static java.lang.Math.abs;import java.util.Scanner; /** * * @author saeed sokr */public class Codeforces1 {     /**     * @param args the command line arguments     */    public static void main(String[] args) {         Scanner in = new Scanner(System.in);                 //  p1 -A-Boy or Girl        /*        String word = in.next();        String temp ="";        int counter = 0;                for (int i = 0; i < word.length(); i++) {                        if (!temp.contains(String.valueOf(word.charAt(i)))) {                temp += word.charAt(i);                counter++;            }            else                continue;        }        if (counter % 2 == 0)             System.out.println("CHAT WITH HER!");        else            System.out.println("IGNORE HIM!");                */                                          // p2 - A-Sereja and Dima        /*        int n = in.nextInt();         int[] value = new int[n];         for (int i = 0; i < value.length; i++) {            value[i] = in.nextInt();        }         int l = 0, r = n - 1;         int s = 0, d = 0;         boolean p = true;         while (l <= r) {            if (value[l] >= value[r]) {                if (p) {                    s += value[l];                } else {                    d += value[l];                }                 l++;             } else if (value[r] > value[l]) {                if (p) {                    s += value[r];                } else {                    d += value[r];                }                 r--;            }             if (p) {                p = false;            } else {                p = true;            }        }         System.out.println(s + " " + d);        */                              // p3 - A-Magent------------------        /*       int n, a , b =0 , counter = 0;              n = in.nextInt();        for (int i = 0; i < n; i++) {                        a = in.nextInt();            if (a != b) {                counter ++;            }            b = a;        }        System.out.println(counter);         */                // p4 ------Word--------       /*       String word;       int l =1,u=1;       word = in.next();       char c[] = word.toCharArray();               for (int i = 0; i < c.length; i++) {            if (Character.isUpperCase(c[i]))                u++;            else                l++;        }        if (u > l)             System.out.println(word.toUpperCase());        else            System.out.println(word.toLowerCase());                  */                      //p5 -A-Night at the Museum              String s;       s = in.next();       int sMoves = 0;       int start = 0; // a               for (int i = 0; i < s.length(); i++) { // map                        int index = s.charAt(i) - 97;  // a=0 ....z=25 becuase ascii code a = 97 ...z=132            int walk = abs(start - index); // a-m = (0-12) =|12| , m-a = (12-0)=|12| ,a-p =(0-15)=|15|                        if (walk < 13) { //(26/2)                sMoves += walk;            }else{                            sMoves += 26 - walk;            }            start =index;        }               System.out.println(sMoves);            } }