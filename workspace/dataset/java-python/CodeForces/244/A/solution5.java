import java.util.*;public class DividingOrange { 	public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner sc= new Scanner(System.in);		int n=sc.nextInt();		int k=sc.nextInt();		int f[]=new int[(n*k)+1];		for(int i=1;i<=n*k;i++)			f[i]=i;		int a[]=new int[k];		for(int i=0;i<k;i++)		{			a[i]=sc.nextInt();			f[a[i]]=0;		}		Arrays.sort(f);		for(int i=0;i<k;i++)		{			System.out.print(a[i]+" ");			int c=1;			for(int j=0;j<=n*k;j++)			{				if(f[j]!=0)				{					System.out.print(f[j]+" ");					f[j]=0;					c++;				}				if(c==n)					break;			}			System.out.println();		}	} }