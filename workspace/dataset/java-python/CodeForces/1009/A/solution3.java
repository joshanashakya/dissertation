import java.util.Scanner; public class GameShoping { 	public static void main(String[] args) {		Scanner scan = new Scanner(System.in);		int n=scan.nextInt();		int m=scan.nextInt();		int[] a= new int[n];		int[] b= new int[m];		for(int i=0;i<n;i++)		{			a[i]=scan.nextInt();		}		for(int i=0;i<m;i++)		{			b[i]=scan.nextInt();		}		int c=0;		for(int i=0;i<n;i++)		{			if(c<b.length && b[c]>=a[i])			{				c+=1;			}		}		System.out.println(c);		 	} }