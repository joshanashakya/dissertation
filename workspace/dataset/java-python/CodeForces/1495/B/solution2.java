import java.util.List;import java.util.Scanner; public class Main { 	static void pr(int odd) {		System.out.println(odd);	} 	static void pr(long[] ar) {		for (long i : ar) {			System.out.print(i + " ");		}		System.out.println("");	} 	static void pr(int[] ar) {		for (int i : ar) {			System.out.print(i + " ");		}		System.out.println("");	} 	static void pr(int[][] ar) {		for(int i[] : ar) {			for(int n : i) {				System.out.print(n + " ");			}			System.out.println();		}	}		int min(long[] ar, int n) {		int min = 0;		for (int i = 0; i < ar.length; i++) {			min = ar[min] > ar[i] ? i : min;		}		return min;	} 	int max(int[] ar) {		int max = 0;		for (int i = 0; i < ar.length; i++) {			max = ar[i] > ar[max] ? i : max;		}		return max;	} 	int max(long[] ar) {		int max = 0;		for (int i = 0; i < ar.length; i++) {			max = ar[i] > ar[max] ? i : max;		}		return max;	} 	int max(List<Integer> ar) {		int max = 0;		for (int i = 0; i < ar.size(); i++) {			max = ar.get(i) > ar.get(max) ? i : max;		}		return max;	} 	int kgv(int a, int b) {		int ret = 0;		outer: for (int i = 1; i <= b; i++) {			for (int j = 1; j <= a; j++) {				if (b * j > a * i)					break;				if (b * j == a * i) {					ret = a * i;					break outer;				}			}		}		return ret;	} 	int binarySearch(List<Integer> ar, int x, int l, int r) {		if (l <= r) {			int mid = l + (r - l) / 2; 			if (ar.get(mid) == x)				return mid; 			if (ar.get(mid) > x)				return binarySearch(ar, x, l, mid - 1);			else				return binarySearch(ar, x, mid + 1, r);		} 		return -1;	} 	int binarySearch(int[] ar, int x, int l, int r) {		if (l <= r) {			int mid = l + (r - l) / 2; 			if (ar[mid] == x)				return mid; 			if (ar[mid] > x)				return binarySearch(ar, x, l, mid - 1);			else				return binarySearch(ar, x, mid + 1, r);		} 		return -1;	} 	long choose(double n, double k) {		double ret = 1;		for (int i = 0; i < k; i++) {			ret *= (n - i) / (k - i);		}		return (long) ret;	} 	int getGcd(long a, long b) {		for (int i = 2; i <= Math.min(a, b); i++)			if (a % i == 0 && b % i == 0)				return i;		return -1;	} 	static int mod = (int) Math.pow(10, 9) + 7; 	int seq(int of, int[] ar, int start) {		int ret = 0;		while(ar[start++] == of)			ret++;		return ret;	} 	long testCase(int n, int[] ar) {		Pair<Integer, Integer> val = new Pair<>(0, 0);		int max = 0;		int maximum = 1;				if(ar[0] > ar[1]) {						for(int i = 0; i < n-1;) {				int up, down;				up = 1;				down = 1;				int q = 1;								if(i == 0) {					while(i < n-1 && ar[i] > ar[i+1]) {						q++;						i++;					}				}				while(i < n-1 && ar[i] < ar[i+1]) {					up++;					i++;				}				while(i < n-1 && ar[i] > ar[i+1]) {					down++;					i++;				}								if(down == up) {					if(val.first < up) {						val.first = up;						val.second = down;											}				}				int oldmax = maximum;				maximum = Math.max(Math.max(Math.max(up, down), maximum), q);				if(maximum != oldmax)					max=1;				else					if(down == maximum) 						max++;				if(up == maximum)					max++;				if(q == maximum)					max++;			}		}else {						for(int i = 0; i < n-1;) {				int up, down;				up = 1;				down = 1;								while(i < n-1 && ar[i] < ar[i+1]) {					up++;					i++;				}				while(i < n-1 && ar[i] > ar[i+1]) {					down++;					i++;				}				if(down == up) {					if(val.first < up) {						val.first = up;						val.second = down;											}				}				int oldmax = maximum;				maximum = Math.max(Math.max(up, down), maximum);				if(maximum != oldmax)					max=1;				else					if(down == maximum) 						max++;				if(up == maximum)					max++;			}		}		//System.out.println(val.first + " " + val.second);		//System.out.println(max);		if(val.first < 2 || val.first % 2 == 0 || max > 2 || val.first < maximum)			return 0;		return 1;	}		private class Pair<T, V>{		T first;		V second;		public Pair(T first, V second) {			this.first = first;			this.second = second;		}	}	//B	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);		Main main = new Main();		StringBuilder sb = new StringBuilder(); 		//int t = sc.nextInt();		//for (int x = 0; x < t; x++) {			int n;			n = sc.nextInt();			int[] ar = new int[n];			for(int i = 0; i < n; i++) {				ar[i] = sc.nextInt();			}			sb.append(main.testCase(n, ar)).append("\n");		//}		sc.close();		System.out.println(sb); 	}}
