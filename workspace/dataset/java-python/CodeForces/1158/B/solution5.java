import java.util.*;public class Main { public static void main(String args[]) {	 //System.out.println(1);	 Scanner input=new Scanner(System.in);	 int n,k;	 n=input.nextInt();k=input.nextInt();	 if(k==1)	 {		 for(int i=1;i<n;i++)			 System.out.print(0);		 System.out.println(1);	 }	 else	 {		 int m=(n-k)/2;		 for(int i=0;i<n;i++)		 {			 if(i%(m+1)==0)System.out.print(1);			 else				 System.out.print(0);		 }	 } }}    				 	 	 	 	   	  	    		  	
