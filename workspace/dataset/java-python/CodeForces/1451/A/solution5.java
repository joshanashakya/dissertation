import java.util.*;public class Array {         public static void main(String[] args) {       Scanner in = new Scanner (System.in);       int n= in.nextInt();              int a[]=new int [n];       for(int j=0;j<n;j++)           a[j]=in.nextInt();              for(int j=0;j<n;j++){                      if(a[j]==1) System.out.println(0);           else if(a[j]==2) System.out.println(1);           else   if(a[j]==3) System.out.println(2);           else    if(a[j]%2==0) System.out.println(2);                 else                         System.out.println(3);                            }              } }