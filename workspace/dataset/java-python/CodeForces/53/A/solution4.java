/*package whatever //do not write package name here */ import java.io.*;import java.util.*;public class S {	public static void main (String[] args) {		Scanner in=new Scanner(System.in);		String s=in.next();		int t=in.nextInt();		String k=s;		int temp=0;		while(t--!=0)		{		    String str=in.next();		    if(str.indexOf(s)==0)		    {		        if(temp==0)		        {		            k=str;		            temp=1;		        }		        else		        {		            if(k.compareTo(str)>0)k=str;		        }		    }		}		System.out.print(k);	}}