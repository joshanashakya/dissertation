import java.util.HashSet;import java.util.Scanner; public class Sasha_and_One_More_Name { 	public static void main(String[] args) { 		Scanner scn = new Scanner(System.in);		String s = scn.next();		long[] hash = new long[s.length()];		long p = 1;		long mod = 1000000007;		long[] pp = new long[s.length()];		long[] hashs = new long[s.length()];		for (int i = 0; i < s.length(); i++) {			long val = ((i > 0 ? hash[i - 1] : 0) + ((s.charAt(i) - 'a' + 1) * p) % mod) % mod;			long pre = ((i > 0 ? hashs[i - 1] : 0) * 7919) % mod;			long sv = (pre + (s.charAt(i) - 'a' + 1)) % mod;			hash[i] = val;			hashs[i] = sv;			pp[i] = p;			p = (p * 7919) % mod; 		}		int n = s.length();		if (hashs[n - 1] != hash[n - 1]) {			System.out.println("Impossible");		} else { 			if (n % 2 == 0) {				if (s.chars().distinct().count() == 1) {					System.out.println("Impossible");				} else {					boolean got = false;					/*					*/					while (n > 1) {						if (n % 2 == 1) {							System.out.println(2);							return;						} else {							if (hash[n / 2 - 1] != hashs[n / 2 - 1]) {								System.out.println(1);								return;							}						}						n /= 2;					}					System.out.println(2);				}				return;			}			// try finding a non palindrome prefix			for (int i = 0; i < n / 2; i++) {				if (hash[i] != hashs[i]) {					System.out.println(2);					return;				}			}			System.out.println("Impossible"); 		} 	}}