import java.util.*;import java.math.*; public class Main {	public static void main(String ards[])	{		Scanner cin = new Scanner(System.in);		int n = cin.nextInt();		long k = cin.nextLong();		String a = cin.next();		String b = cin.next();		long now = 1, ans = 0;		if(k==1){			System.out.println(n);			return;		}		for(int i = 0; i < n; i++){			now *= 2;			if(a.charAt(i) != 'a')now--;			if(b.charAt(i) != 'b')now--;			now = Math.min(now,k);			ans+=now;		}		System.out.println(ans);		}}	 	   				  	 		     		    	  	