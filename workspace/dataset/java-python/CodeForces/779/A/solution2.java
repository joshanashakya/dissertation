import java.util.*;import java.io.*;public class MyClass {    public static void main(String args[]) {      Scanner sc = new Scanner(System.in);      int n = sc.nextInt(), sum=0;      int[] arr= new int[6];      for(int i=0; i<n; i++) {          int num = sc.nextInt();          arr[num] += 1;      }      for(int i=0; i<n; i++) {          int num = sc.nextInt();          arr[num] -= 1;      }      boolean flag = true;      for(int i=1; i<6; i++) {          int num = Math.abs(arr[i]);          if(num % 2 != 0) {              flag = false;              break;          }         sum += num;       }      if(!flag)        System.out.println(-1);      else        System.out.println((sum/2)/2);    }}