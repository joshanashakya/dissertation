import java.util.*;public class Main{		 public static void main(String args[])    {        Scanner in  = new Scanner(System.in);      int n = in.nextInt();     int m = in.nextInt();     int ans=0;     for(int i=0 ; i<n ; i++)     {         for(int j=0 ; j<m ; j++)         {             int x = in.nextInt();             if(x==1)             {                 if(i==0||i==n-1||j==0||j==m-1) ans=2;                 else if(ans!=2) ans=4;             }         }     }     System.out.println(ans);    }}
