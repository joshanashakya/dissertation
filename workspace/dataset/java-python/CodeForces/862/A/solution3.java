//I AM THE CREED/* //I AM THE CREED/* package codechef; // don't place package name! */import java.io.BufferedReader; import java.io.IOException; import java.io.InputStreamReader; import java.util.StringTokenizer; import java.util.*;import java.awt.Point;public class Main{    //#include <bits/stdc++. h>     public static void main(String[] args) throws IOException     {           Scanner input = new Scanner(System.in);        while(input.hasNext()){            int n=input.nextInt();            int x=input.nextInt();            int del=0;            HashSet<Integer> s=new HashSet<>();            for(int i=0;i<n;i++){                int ele=input.nextInt();                s.add(ele);                if(ele==x){                    del++;                }            }            int add=0;            for(int i=x-1;i>=0;i--){                if(s.contains(i)){                    continue;                }                add++;            }            System.out.println(add+del);        }            }     }