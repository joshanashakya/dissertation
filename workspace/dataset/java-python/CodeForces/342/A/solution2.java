import java.util.*;public class XeniaandDivisors { 	public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner sc= new Scanner(System.in);		int n=sc.nextInt();		int a[]=new int[n];		int b[]=new int[n];		for(int i=0;i<n;i++)			a[i]=sc.nextInt();		Arrays.sort(a);		int z=0,j=0;		for(int i=0;i<n/3;i++)		{			if(a[i]<a[i+n/3]&&a[i+n/3]<a[i+2*(n/3)]&&a[i+2*(n/3)]%a[i+n/3]==0&&a[i+n/3]%a[i]==0)			{				b[j]=a[i];				b[j+1]=a[i+n/3];				b[j+2]=a[i+2*(n/3)];				j+=3;			}			else			{				z=-1;				break;			}		}		if(z==0)		{			for(int i=0;i<n;i++)			{				if(i>0&&i%3==0)					System.out.println();				System.out.print(b[i]+" ");			}		}		else			System.out.println(-1);	} }
