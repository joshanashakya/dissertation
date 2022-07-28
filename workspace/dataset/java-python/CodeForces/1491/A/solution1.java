import java.util.*;
public class A1491{
public static void main (String [] args){
Scanner sc = new Scanner (System.in);
//System.out.println ("Enter n ");
int n = sc.nextInt();
int ar[]= new int[n];
int a1=0;
int k = sc.nextInt();
for (int i =0;i<n;i++){
ar[i]= sc.nextInt();
if (ar[i]== 1) a1++;
}
while (k-->0){
int ch = sc.nextInt();
int v = sc.nextInt();
switch(ch){
case 1: ar[v-1]= 1-ar[v-1];
if (ar[v-1] ==1)a1++;
else a1--;
//System.out.println (ar[v-1]);
break;
case 2: if (v<=a1) System.out.println (1);
else System.out.println (0);
break;
}
}
}
}
