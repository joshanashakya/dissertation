import java.util.*;import java.util.stream.*; public class Solution {	public static void main(String[] args) {		Scanner scan = new Scanner(System.in);		int n = scan.nextInt();		int next;		int aSum = 0;		for(int i = 0; i < n; i++) {			next = scan.nextInt();			aSum |= next;		}		int bSum = 0;		for(int i = 0; i < n; i++) {			next = scan.nextInt();			bSum |= next;		}				System.out.println(aSum + bSum);	}}