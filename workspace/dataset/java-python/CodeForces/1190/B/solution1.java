import java.util.*;import java.io.*; public class TokitsukazeCSLandStoneGame { 	// https://codeforces.com/contest/1190/problem/B		public static void main(String[] args) throws IOException, FileNotFoundException {		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));		//BufferedReader in = new BufferedReader(new FileReader("TokitsukazeCSLandStoneGame")); 		int n = Integer.parseInt(in.readLine());		long[] arr = new long[n]; 		StringTokenizer st = new StringTokenizer(in.readLine());		boolean nonzero = false;		for (int i=0; i<n; i++) {			arr[i] = Long.parseLong(st.nextToken());			if (arr[i] != 0) nonzero  =true;		}				Arrays.sort(arr);						// there are multiple zeroes		if (!nonzero || (n > 1 && arr[1] == 0)) {			System.out.println("cslnb");			return;		}				int count=1;		int max=0;		int num=0;		for (int i=1; i<n; i++) {			if (arr[i] == arr[i-1]) {				count++;			}			else {				max = Math.max(max, count);				if (count >= 2) num++;				count=1;			}		}		max = Math.max(max, count);		if (count >= 2) num++;					// one val has >= 3 occurances, or there are multiple numbers wiht				// >= 2 occuranges		if (max >= 3 || num >= 2) {			System.out.println("cslnb");			return;		}				if (num == 1) {			// one number repeated twice			long val=0;			for (int i=1; i<n; i++) {				if (arr[i] == arr[i-1]) {					if (i!=1 && arr[i-2] == arr[i]-1) {						// if 2 numbers back is equal to this number -1							// cannot subtract one from this number						System.out.println("cslnb");						return;					}				}			}		}				long val=0;		for (int i=0; i<n; i++) {			if (i == 0) {				val += arr[i];				continue;			}			if (arr[i] - i >= 0) {				val += arr[i] - i;			}			else {				System.out.println("cslnb");				return;			}		}				if (val % 2 == 0) {			System.out.println("cslnb");			return;		}		else {			System.out.println("sjfnb");			return;		}			}}