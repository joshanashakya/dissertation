 import java.util.Scanner; public class Main {	static Scanner input = new Scanner(System.in);	public static void main(String[] args) {		int n = input.nextInt();		int l = input.nextInt();		int r = input.nextInt();		int min = 0;		int max = 0;		int sum=0;		for(int i=1;i<=l;i++) {			sum+=quite(i);		}		min+=sum+(n-l);		System.out.print(min+" ");		sum = 0;		for(int i=1;i<=r;i++) {			sum+=quite(i);		}		max=sum+((n-r)*quite(r));		System.out.println(max);	}	static int quite(int n) {		int sum=1;		if(n==1) sum=1;		else		for(int i=2;i<=n;i++)			sum*=2;		return sum;	}}   	 	 	 	 				  	 		  			  		
