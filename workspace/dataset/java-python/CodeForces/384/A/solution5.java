import java.util.*;import java.lang.*;import java.io.*; /* Name of the class has to be "Main" only if the class is public. */public class Codechef{	public static void main (String[] args) throws java.lang.Exception	{		// your code goes here		Scanner sc=new Scanner(System.in);		int t=0;		if(sc.hasNextInt())		t=sc.nextInt();		else t=0; 		int n=t;	    if(t%2==0){	        int max= (t/2)*(t);	         System.out.println(max);	         	         StringBuilder s1=new StringBuilder() ; StringBuilder s2=new StringBuilder() ;	         for(int i=0;i<t/2;i++){	          s1.append("C.");	        } for(int i=0;i<t/2;i++){	            s2.append(".C");	        }	        while(n >0){	        System.out.println(s1.toString() );	         n--;	        System.out.println(s2.toString() );	         n--;	        	    }  }	  	    else{	        n=t;	        int max= (t/2 +1)*(t/2 +1) + (t/2)*(t/2) ;	         System.out.println(max);	          StringBuilder s1=new StringBuilder() ; StringBuilder s2=new StringBuilder() ;	         for(int i=0;i<t/2;i++){	          s1.append("C.");	        } s1.append("C");	        for(int i=0;i<t/2;i++){	            s2.append(".C");	        }s2.append(".");	        	         while(n >0){	        System.out.println(s1.toString() );	         n--;	       if(n>0){ System.out.println(s2.toString() );	         n--; }	    }	    }	}}
