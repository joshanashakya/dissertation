import java.util.Scanner;  public class Main {public static void main(String[] args) {	Scanner sc=new Scanner(System.in);	int n=sc.nextInt();	int[] a=new int[n];	int num1=0,num2=0,num3=0;	for (int i = 0; i < a.length; i++) {		a[i]=sc.nextInt();		if(a[i]-1==0) num1++;		if(a[i]-2==0) num2++;		if(a[i]-3==0) num3++;	}	int max=num1;	if(max<num2) max=num2;	if(max<num3) max=num3;	System.out.println(n-max);}}
