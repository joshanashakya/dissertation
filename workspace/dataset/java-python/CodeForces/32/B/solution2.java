//package codeforces;import java.util.*;public class Borze {	public static void print_num(char a, char b) {		if(a == '.') {			System.out.print(0);		}		else {			if(b == '-') {				System.out.print(2);			}			else {				System.out.print(1);			}		}	}	public static void main(String[] args) {		Scanner scan = new Scanner(System.in);		String S = scan.nextLine(); 		//char[] A = S.toCharArray(); 		// 0 : .		// 1 : -.		// 2 : --				int i = 0; 		while(i<S.length()) {			if(S.charAt(i) == '.') {				print_num('.', ' ');				i++;			}			else {				if(S.charAt(i) == '-' && i < S.length()-1) {					print_num('-', S.charAt(i+1));					i+=2;				}			} 		}		System.out.println();						/*		List<Integer> B = new ArrayList<Integer>();		int j = -1; 		for(int i = 0; i < A.length ; i++) { 			if(A[i] == '.') {				// -. : set  to 1				if(i > 0 && A[i-1] == '-' && j <i-1) {						B.add(1);					j = i;				// . : 0				} else {					B.add(0);					j = i;				} 			}			else if(A[i] == '-') {				// -- : 2				if(i > 0 && A[i-1] == '-' && j <i-1) {					B.add(2); 					j = i;				}								}		}			   for (int i : B){ 		      		   System.out.print(i); 			   }	   System.out.println();	   	   */ 	} }
