/* package whatever; // don't place package name! */ import java.util.*;import java.lang.*;import java.io.*; /* Name of the class has to be "Main" only if the class is public. */public class Ideone{	public static void main (String[] args) throws java.lang.Exception	{		Scanner scn = new Scanner(System.in);		int n = scn.nextInt();		if(n == 1){			System.out.println(1 + " " + 0);				return;		}		HashMap<Integer, Integer> set = getFactors(n);		long ans = 1;		int max = Integer.MIN_VALUE;		int min = Integer.MAX_VALUE;		for (int num : set.keySet()) {			ans *=num;			max = Math.max(max,set.get(num));			min = Math.min(min,set.get(num));		}		if(max == 1) {			System.out.println(n + " " + 0);				return;		}		int path = getPath(max);		if(noOfOnes(max) == 1) {			if(min == max){				// nothing			} else {				path++;			}		} else {			path++;		}		// System.out.println(set);		System.out.println(ans + " " + path);	}	public static int noOfOnes (int num) {		int c = 0;		while (num > 0) {			c += num&1;			num>>=1;		}		return c;	}		public static int getPath(int num) {		int ones = 0;		int farthest = 0;		while (num > 0) {			ones += num&1;			num>>=1;			farthest++;		}		if(ones == 1){			return farthest - 1;		}		return farthest;	}		public static HashMap<Integer, Integer> getFactors(int n) {		HashMap<Integer,Integer> factors = new HashMap<>();		int n1 = n;		for (int i = 2; i<=n1 && n > 1; ++i) {			if(n%i == 0){				int c = 0;				while(n%i==0){					n/=i;					c++;				}				factors.put(i,c);			}		}		return factors;	}}