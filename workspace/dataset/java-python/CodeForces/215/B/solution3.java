import java.util.*;public class Solution {	/* Notice equation of r2^2 = (B r1^2)/((A*P2/P1)+B)	* So we need	*	max P1, r1	*	min P2	*/	public static void main(String args[]) {		Scanner input = new Scanner(System.in);		int n = input.nextInt();		int temp;		int r1 = 0;		for(int i=0; i<n; i++) {			temp = input.nextInt();			if(temp > r1)				r1 = temp;		}		n = input.nextInt();		int p1 = 0;		for(int i=0; i<n; i++) {			temp = input.nextInt();			if(temp > p1)				p1 = temp;		}		n = input.nextInt();		int p2 = 5000;		for(int i=0; i<n; i++) {			temp = input.nextInt();			if(temp < p2)				p2 = temp;		}		long A = input.nextLong();		long B = input.nextLong();		input.close();		System.out.println( Math.sqrt( (B * r1 * r1) / ((A*p2/(double)p1) + B) ) );	}}