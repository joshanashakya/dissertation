import java.util.*;import java.io.*;public class Main{    static PrintWriter w=new PrintWriter(System.out);	public static void main(String[] args) {	    Scanner sc=new Scanner(System.in);	long n=sc.nextInt(),q=sc.nextInt();        while(q-->0){            long x=sc.nextInt(),y=sc.nextInt();            long ans=((x-1)*n+y+1)/2;            if((x+y)%2==0)w.println(ans);            else w.println(((n*n+1)/2)+ans);        }        w.close();	}}
