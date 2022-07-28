import java.util.*;
public class A1490{
public static void main (String [] args){
Scanner sc = new Scanner (System.in);
//System.out.println ("Enter ");
int t = sc.nextInt();
while (t-->0){
int n = sc.nextInt();
int ar[]= new int[n];
for (int i =0;i<n;i++){
ar[i]= sc.nextInt();
}
int min =0,max=0,c=0;
for (int i =0;i<n-1;i++){
min =(int)Math.min(ar[i],ar[i+1]);
max = (int)Math.max(ar[i],ar[i+1]);
while (min*2<max){
c++;
if (max%2==0) max= max/2;
else max= (max/2)+1;
}
}
System.out.println (c);
}
}
}
