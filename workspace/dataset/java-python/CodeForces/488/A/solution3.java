import java.util.Scanner;public class Solution{	public static void main(String args[]){		Scanner sc = new Scanner(System.in);		long n = sc.nextLong();		if(n>-2) {			long div = n + 1;			int z1;			int rem;			for (int i1 = 0; i1 < 10; i1++) {				z1 = 0;				div = n + i1 + 1;				while (div > 0) {					rem = (int) div % 10;					div = div / 10;					if (rem == 8) {						z1++;					}					//System.out.println(z1);				}				if (z1 > 0) {					System.out.println(1 + i1);					break;				} else { 				}			}		}else{			if(n>=-8){				System.out.println(8-n);			}else {				n = -n;				long div;				int z1;				int rem;				for (int i1 = 0; i1 < 10; i1++) {					z1 = 0;					div = n - i1 - 1;					while (div > 0) {						rem = (int) div % 10;						div = div / 10;						if (rem == 8) {							z1++;						}						//System.out.println(z1);					}					if (z1 > 0) {						System.out.println(1 + i1);						break;					} else { 					}				}			} 		} 	}}
