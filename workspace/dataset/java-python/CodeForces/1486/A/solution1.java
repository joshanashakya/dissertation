import java.util.*;
public class Shifting
{
public static void main(String args[])
{
Scanner e=new Scanner(System.in);
int t=e.nextInt();
while(t>0)
{
	int n=e.nextInt();
	int a[]=new int[n];
	long x=1,j=0,k=0;
	for(int i=0;i<n;i++)
	{
	a[i]=e.nextInt();
	j+=i;
	k+=a[i];
	if(k<j)
	x=0;
	}
if(x==1)
System.out.println("YES");
else
System.out.println("NO");
t--;
}
}
}
