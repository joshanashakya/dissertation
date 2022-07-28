import java.util.*;
import java.io.*;
public class code{

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
int n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
int min=a[0],c=0;
for(int i=1;i<n;i++)
if(min>a[i])
 min=a[i];
for(int i=0;i<n;i++)
if(min==a[i])
c++;
System.out.println(n-c);

}
}
}
