import java.util.*;public class RomaandLuckyNumbers { 	public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner sc=new Scanner(System.in);		int n=sc.nextInt();		int k=sc.nextInt();		int  o=0;		for(int i=1;i<=n;i++)		{			int x=sc.nextInt();		    int c=0;			while(x>0)		    {		    	int r=x%10;		    	if(r==4||r==7)		    	   c++;		    	x=x/10;		    }			if(c<=k)	    		o++;		}		System.out.print(o);	} }