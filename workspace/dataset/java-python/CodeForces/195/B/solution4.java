import java.awt.image.AreaAveragingScaleFilter;import java.util.ArrayList;import java.util.Arrays;import java.util.Collections;import java.util.Scanner;public class Main {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);//        int testCases = sc.nextInt();//        while (testCases-- >= 1) {        int n=sc.nextInt();        int m=sc.nextInt();      int val=(m+1)/2;      int a[]= new int[m+10];      for (int i=0;i<m;i++){          if (m%2!=0){              if (i%2==0){                  val+=i;                  a[i]=val;              }              else{                  val-=i;                  a[i]=val;              }          }          else{              if (i%2!=0){                  val+=i;                  a[i]=val;              }              else{                  val-=i;                  a[i]=val;              }          }      }      for (int i=0;i<n;i++)          System.out.print(a[i%m]+" ");       }}