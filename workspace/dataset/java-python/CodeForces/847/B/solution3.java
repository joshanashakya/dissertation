// 2017-2018 ACM-ICPC, NEERC, Southern Subregional Contest, qualification stage B. Preparing for Merge Sort// https://codeforces.com/contest/847/problem/B import java.io.*;import java.util.*; public class mergesort {	public static void main(String[] args) throws IOException {		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));		PrintWriter out = new PrintWriter(System.out);				int n = Integer.parseInt(f.readLine());					// Number of elements in the array		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();	// Stores the rows of sequences				// Every time we read in a new number n, we add it to the first sequence where it is larger than		// the last number. Also, note that the last numbers are nonincreasing from top to bottom, so we 		// can use binary serach to find the desired sequence to add it to		StringTokenizer st = new StringTokenizer(f.readLine());		for (int i = 0; i < n; i++) {			int cur = Integer.parseInt(st.nextToken());			// Current element of the array			int min = 0, max = ans.size();						// Bounds for binary searching			while (min < max) {				int mid = (min + max) / 2;				if (ans.get(mid).get(ans.get(mid).size() - 1) < cur) {					max = mid;				} else {					min = mid + 1;				}			}			if (min == ans.size()) {				ans.add(new ArrayList<Integer>());				ans.get(ans.size() - 1).add(cur);			} else {				ans.get(min).add(cur);			}		}				// Extracting our answer		for (int i = 0; i < ans.size(); i++) {			for (int j : ans.get(i)) {				out.print(j + " ");			}			out.println();		}				f.close();		out.close();	}}