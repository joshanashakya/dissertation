import java.util.Scanner;public class Main { 	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);		int tc = sc.nextInt();		while(tc-->0) {		   long ha = sc.nextInt();		   long hb = sc.nextInt();		   int n = sc.nextInt();		   int a[] = new int[n];		   int b[] = new int[n];				   for(int i=0;i<n;i++) {			   a[i]=sc.nextInt();		   }		   for(int i=0;i<n;i++) {			   b[i]=sc.nextInt();		   }		   long x,max=0;		   for(int i=0;i<n;i++) {			  x=(b[i]+ha-1)/ha;			  hb-=x*a[i];			  max=Math.max(max, a[i]);		   }		   if(hb+max>0) System.out.println("YES");		   else System.out.println("NO");		   		}		sc.close();	}}