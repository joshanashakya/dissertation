import java.util.*;import java.io.*;import java.lang.*; public class Solution {        public static void main (String[] args) {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        int a[] = new int[n];        for(int i = 0; i<n; i++)            a[i] = sc.nextInt();                    int max = 1;        int temp = 1;        for(int i = 1; i<n; i++){            if(a[i]>a[i-1]) temp++;            else temp = 1;            if(temp> max) max = temp;        }                System.out.println(max);    }    }