import java.util.Scanner; public class pROBLEM39 { 	public static void main(String[] args) {		// TODO Auto-generated method stub     Scanner sc = new Scanner(System.in);    int n = sc.nextInt();    int a[] = new int [n];    for(int i=0;i<n-1;i++)    {    	a[i] = sc.nextInt();    }        int k = sc.nextInt();    int l = sc.nextInt();    k = k-1;    l = l-1;    int sum=0;    for(int i = k;i<l;i++)    {    	sum = sum+a[i];    }    System.out.println(sum);	} }