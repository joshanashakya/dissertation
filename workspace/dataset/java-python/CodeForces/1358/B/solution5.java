import java.util.ArrayList;import java.util.Arrays;import java.util.HashMap;import java.util.HashSet;import java.util.List;import java.util.Scanner;import java.util.stream.Collectors; public class test {		public static void main(String[] args) {		Scanner sc = new Scanner(System.in);		int tests = sc.nextInt();		for(int t = 0; t < tests; t++) {			int n = sc.nextInt();			int[] tab = new int[n];			for (int i = 0; i < n; i++) {				tab[i] = sc.nextInt();			}			Arrays.sort(tab);			int count = 0;			for(int i = 0; i < n; i++) {				if(tab[i]<=i+1) {					count=i+1;				}			}			System.out.println(count+1);		}	}}