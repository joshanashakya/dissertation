import java.util.Scanner;public class Ishu{	public static void main(String[] args)	{	Scanner scan=new Scanner(System.in);		boolean flag=false;	int n,m,i,j,k,temp=0,sum=0,x,b;	int[][] a=new int[2][100];	int[][] match=new int[100][100];	n=scan.nextInt();	m=scan.nextInt();	for(i=0;i<n;++i)		{		a[0][i]=scan.nextInt();		a[1][i]=i;		}	for(i=0;i<m;++i)		{		x=scan.nextInt();		b=scan.nextInt();		match[x-1][b-1]=1;		match[b-1][x-1]=1;		}	for(i=0;i<n;++i)		for(j=0;j<n-1;++j)			if(a[0][j]>a[0][j+1])				{				a[0][j]=a[0][j]+a[0][j+1];				a[0][j+1]=a[0][j]-a[0][j+1];				a[0][j]=a[0][j]-a[0][j+1];				a[1][j]=a[1][j]+a[1][j+1];				a[1][j+1]=a[1][j]-a[1][j+1];				a[1][j]=a[1][j]-a[1][j+1];					}	for(i=0;i<n-2;++i)		{		for(j=0;j<n-1;++j)			{			for(k=0;k<n;++k)				{				sum=a[0][i]+a[0][j]+a[0][k];				temp=0;				if(match[a[1][i]][a[1][j]]==1)					++temp;				if(match[a[1][j]][a[1][k]]==1)					++temp;				if(match[a[1][i]][a[1][k]]==1)					++temp;							if(temp==3)					{					flag=true;					break;					}				}			if(flag)				break;			}		if(flag)			break;		}	if(flag)		System.out.println(sum);	else		System.out.println(-1);	}}