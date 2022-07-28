import java.util.*;
public class A1487{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
//System.out.println ("Enter :");
int t = sc.nextInt ();
while (t-->0){
int n = sc.nextInt();
int ar[]= new int[n];
for (int i =0;i<n;i++){
ar[i]= sc.nextInt();
}
Arrays.sort(ar);
int k = ar[0];
int c=1;
for (int i =1;i<n;i++){
if (ar[i]==k) c++;
else break;
}
System.out.println (n-c);
}
}
}
