import java.util.*; public class Main {	public static void main(String[] args) { 		Scanner sc = new Scanner(System.in); 		long x=sc.nextLong();		long y=sc.nextLong();				if(x%2!=0) {			x++;		}				if(x+2>y) {			System.out.println("-1");		}else {			System.out.println(x+" "+(x+1)+" "+(x+2));		} 	}}
