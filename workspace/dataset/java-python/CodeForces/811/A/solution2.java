import java.io.File;import java.io.FileNotFoundException;import java.io.IOException;import java.io.PrintWriter;import java.util.*; public class Main {            	public static void main(String[] args) throws FileNotFoundException {           Scanner input = new Scanner(System.in);          int a = input.nextInt();          int b = input.nextInt();          int temp = 0;          int i=1;          while(a>=0&&b>=0)          {             if(temp==0)             {                a-=i;                if(a<0)                {                    System.out.println("Vladik");                    return;                }                temp=++temp%2;             }             else if(temp==1)             {                 b-=i;                 if(b<0)                 {                     System.out.println("Valera");                     return;                 }                temp=++temp%2;             }             i++;          }            	}   }
