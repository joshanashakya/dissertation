import java.util.*;public class Giga_Tower { 	public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner sc=new Scanner(System.in);		long b=sc.nextInt();		int z=1;		int flag=0;				{			while(true)		{		  b++;		  long n=Math.abs(b);		  while(n!=0)		  {			  long x=n%10;			  if(x==8)			  {				  flag=1;				  break;			  }			  n=n/10;		  		  }		  if(flag==1)			  break;		  else			  z++;	  		}		System.out.println(z);		}			} }