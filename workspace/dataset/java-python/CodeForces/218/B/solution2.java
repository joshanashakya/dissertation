import java.util.*;public class p69 { 	public static void main(String[] args) {		Scanner in=new Scanner(System.in);		int n=in.nextInt();		int m=in.nextInt();		in.nextLine();		int a[]=new int[m];		for(int i=0;i<m;i++)		{			a[i]=in.nextInt();		}		int p[]=new int[m];		for(int i=0;i<m;i++)		{			p[i]=a[i];		}				int sum1=0;		int sum2=0;				int maxp=-1;		for(int j=0;j<n;j++)		{	   int max=Integer.MIN_VALUE;		for(int i=0;i<m;i++)		{			if(a[i]>max)			{				max=a[i];				maxp=i;			}		}		sum1=sum1+max;		a[maxp]=a[maxp]-1;		}		System.out.print(sum1+" ");		int minp=-1;		for(int j=0;j<n;j++)		{	   int min=Integer.MAX_VALUE;		for(int i=0;i<m;i++)		{			if(p[i]<min&&p[i]!=0)			{				min=p[i];				minp=i;			}		}		sum2=sum2+min;		p[minp]=p[minp]-1;		}		System.out.print(sum2);							} }