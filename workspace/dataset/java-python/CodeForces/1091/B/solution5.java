import java.util.*;import java.io.*;public class tre{            public static void main(String []Args)throws Exception    {      Scanner sc = new Scanner(System.in);  int n=sc.nextInt();   long x=0,y=0;  for(int i=0;i<2*n;i++){     x+=sc.nextLong();    y+=sc.nextLong();         }    System.out.println(x/n +" "+y/n);      }  }