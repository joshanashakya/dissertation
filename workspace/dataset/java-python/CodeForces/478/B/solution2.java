import java.util.*;public class RandomTeams { 	public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner sc= new Scanner(System.in);		int n=sc.nextInt(),m=sc.nextInt();		if(n%m==0)			System.out.print((long)m*(n/m-1)*(n/m)/2);		else			System.out.print((long)((long)(m-n%m)*(n/m-1)*(n/m)/2+(long)(n%m)*(n/m+1)*(n/m)/2));		System.out.println(" "+(long)(n-m)*(n-m+1)/2);	} }
