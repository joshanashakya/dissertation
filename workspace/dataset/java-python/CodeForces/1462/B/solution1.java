import java.util.*;import java.lang.*;import java.io.*;/* Name of the class has to be "Main" only if the class is public. */public class Main{    public static void main (String[] args) throws java.lang.Exception	{	long i,t;	Scanner sc=new Scanner(System.in);	t=sc.nextLong();    for(i=1;i<=t;i++)    { int n;    String s;    n=sc.nextInt();    s=sc.next();    if(s.charAt(0)=='2'&&s.charAt(1)=='0'&&s.charAt(2)=='2'&&s.charAt(3)=='0'){System.out.println("yes");}    else  if(s.charAt(n-4)=='2'&&s.charAt(n-3)=='0'&&s.charAt(n-2)=='2'&&s.charAt(n-1)=='0'){System.out.println("yes");}     else  if(s.charAt(0)=='2'&&s.charAt(1)=='0'&&s.charAt(2)=='2'&&s.charAt(n-1)=='0'){System.out.println("yes");}    else  if(s.charAt(0)=='2'&&s.charAt(1)=='0'&&s.charAt(n-2)=='2'&&s.charAt(n-1)=='0'){System.out.println("yes");}   else  if(s.charAt(0)=='2'&&s.charAt(n-3)=='0'&&s.charAt(n-2)=='2'&&s.charAt(n-1)=='0'){System.out.println("yes");}    else {System.out.println("no");}}}}