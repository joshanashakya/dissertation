import java.util.Scanner; public class Main { 	public static void main(String[] args) {			Scanner in=new Scanner(System.in);		int n=in.nextInt(), k=in.nextInt(),q=in.nextInt();				int ara[]=new int [200010];		for(int i=0;i<n;i++)		{			int x=in.nextInt();			int y=in.nextInt();			ara[x]++;			ara[y+1]--;					}		int value=0;		for(int i=0;i<ara.length;i++)		{			value+=ara[i];			if(value>=k) {				ara[i]=1;			}			else {				ara[i]=0;			}					} 		for(int i=1;i<ara.length;i++)//prefix sum		{			ara[i]+=ara[i-1];		}		for(int i=0;i<q;i++)		{			int x=in.nextInt();			int y=in.nextInt();			System.out.println(ara[y]-ara[x-1]);		}	}}	 					  	 	 		    	   	   		 	
