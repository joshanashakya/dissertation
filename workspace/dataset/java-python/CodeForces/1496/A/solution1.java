import java.util.*;
public class A1496{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
//System.out.println ("Enter:");
int t = sc.nextInt();
while (t-->0){
int n = sc.nextInt();
int k = sc.nextInt();
String s= sc.next();
char ch=' ';
char ch2 =' ';
int sum=0;
int min =0, max =n-1;
while ((max-min)>=2){
ch = s.charAt(min);
ch2 = s.charAt(max);
if (ch==ch2)sum++;
else break;
max--;
min++;
}
if (sum>=k)System.out.println ("YES");
else System.out.println ("NO");
}
}
}
