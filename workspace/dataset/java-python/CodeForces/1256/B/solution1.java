import java.io.*;import java.util.*;public class minimizethepermutation {	public static void main(String[] args) throws IOException {		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));		StringTokenizer st = new StringTokenizer(f.readLine());		int q = Integer.parseInt(st.nextToken());		while(q > 0) {			q --;			int n = Integer.parseInt(f.readLine());			int[] arr = new int[n];			st = new StringTokenizer(f.readLine());			for(int i = 0; i < n; i ++) {				arr[i] = Integer.parseInt(st.nextToken()) - 1;			}			int index = 0;			HashSet<Integer> usedOperations = new HashSet<>();			for(int i = 0; i < n; i ++) {				index = 0;				while(arr[index] != i) index ++;				for(int j = index; j >= 1 && !usedOperations.contains(j); j --) {					if(arr[j] < arr[j - 1]) {						int temp = arr[j];						arr[j] = arr[j - 1];						arr[j - 1] = temp;						usedOperations.add(j);						}				}			}			for(int i : arr) System.out.print(i + 1 + " ");			System.out.println();		}	}}
