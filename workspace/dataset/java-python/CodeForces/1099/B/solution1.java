import java.util.*;public class Main{	public static void main(String[] args) {	    Scanner s=new Scanner(System.in);	    int n=s.nextInt();	    int sqrt=(int)(Math.floor(Math.sqrt(n)));	    if(n==sqrt*sqrt)	    System.out.println(2*sqrt);	    else if(n-(sqrt*sqrt)<=sqrt)	    System.out.println(2*sqrt+1);	    else	    System.out.println(2*sqrt+2);	}}
