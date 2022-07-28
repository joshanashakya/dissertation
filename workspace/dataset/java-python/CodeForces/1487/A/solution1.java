import java.util.*;
public class Arena
{
public static void main(String args[])
{
Scanner e=new Scanner(System.in);
int t=e.nextInt();
while(t>0)
{
	int n=e.nextInt();
	int a[]=new int[n];
	int x=100;
	for(int i=0;i<n;i++)
	{
	a[i]=e.nextInt();
	if(a[i]<x)
	x=a[i];
	}
	int b=0;
	for(int i=0;i<n;i++)
	{
	if(a[i]>x)
	b++;
	}
	System.out.println(b);
	t--;
}
}
}
