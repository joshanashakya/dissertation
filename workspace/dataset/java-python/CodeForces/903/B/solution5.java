import java.util.Scanner; public class Main { 	public static void main(String[] args) {		Scanner s = new Scanner(System.in);		long h1 = s.nextLong(), a1 = s.nextLong(), c = s.nextLong();		long h2 = s.nextLong(), a2 = s.nextLong();		int k = 0;		int[] arr = new int[1000000];		while(h2 > 0) {			if(h1 - a2 <= 0 && h2 > a1) {				h1 += c;				arr[k++] = 2;			} else {				h2 -= a1;				arr[k++] = 1;			}			h1 -= a2;		}		System.out.println(k);		for(int i = 0; i < k; i++) {			System.out.println(arr[i] == 1 ? "STRIKE" : "HEAL");		}	} } 			   	  	 		     	 		 	 		 		