import java.util.*;public class G{   	public static void main(String args[]){		Scanner scanner = new Scanner(System.in);		int a=scanner.nextInt();		int b=scanner.nextInt();		int mod=scanner.nextInt();		long mult = 1000000000%mod;		boolean found = false; 		for(int i = 0; i<mod && i<=a; i++){			long diff = mod - (i*mult)%mod;			if(diff > b && diff != mod){				found = true;				String s = i+"";				while(s.length()<9) s = '0'+s;				System.out.println(1+" "+s);				break;			}		}		if(!found) System.out.println(2);	}}