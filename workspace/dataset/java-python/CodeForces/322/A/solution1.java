import java.util.*;public class Main{		 public static void main(String args[])    {        Scanner in  = new Scanner(System.in);      int n = in.nextInt();     int m = in.nextInt();     int j=1;     System.out.println(n+m-1);     for(int i=1 ; i<=n ; )     {         System.out.println(i+" "+j);         if(j+1<=m) j++;         else i++;     }    }}