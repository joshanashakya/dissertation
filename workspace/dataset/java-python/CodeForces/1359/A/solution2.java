//package com.problem1.cotest88; import java.io.BufferedReader;import java.io.InputStreamReader;import java.util.Scanner; public class Contest88Problem1 { 	public static void main(String[] args) {		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));		int T = sc.nextInt();		while (T-- > 0) {			int n = sc.nextInt();			int m = sc.nextInt();			int k = sc.nextInt(); 			int count = n / k; 			int maxJoker = Math.min(count, m); 			int leftJoker = m - maxJoker; 			int Joker2nd = leftJoker / (k - 1); 			if (leftJoker % (k - 1) > 0) {				Joker2nd++;			}			System.out.println(maxJoker - Joker2nd); 		}	} }
