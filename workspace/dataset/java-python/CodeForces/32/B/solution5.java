//package codeforces;import java.util.*;public class Borze { 	public static void print_num(char[] A, int first, int second) {		//  .		if (A[first] == '.') {			System.out.print(0);		// -. or --		} else {			if (A[second] == '.') {				System.out.print(1);			} else if (A[second] == '-') {				System.out.print(2);			}		}				}	public static void main(String[] args) {		Scanner scan = new Scanner(System.in);		String S = scan.nextLine(); 		char[] A = S.toCharArray(); 		//int[] B = new int[] {};		// 0 : .		// 1 : -.		// 2 : --		//.-.--		//012		//---.						// i=0, j = -1 , B empty		// i=1, j = 1, B[0]=2		// i=2, j = 1		// i=3, j = 4, B[1] = 1				List<Integer> B = new ArrayList<Integer>();				int i = 0;		while (i<A.length) {						if (A[i] == '.') {				print_num(A, i, i);				i++;			} else if (A[i] == '-' && i < A.length-1) {				print_num(A, i, i+1);				i += 2;			}					}		System.out.println();												/*		int j = -1; 		for(int i = 0; i < A.length ; i++) { 			if(A[i] == '.') {				// -. : set  to 1				if(i > 0 && A[i-1] == '-' && j <i-1) {						B.add(1);					j = i;				// . : 0				} else {					B.add(0);					j = i;				} 			}			else if(A[i] == '-') {				// -- : 2				if(i > 0 && A[i-1] == '-' && j <i-1) {					B.add(2); 					j = i;				}								}		}			   for (int i : B){ 		      		   System.out.print(i); 			   }	   System.out.println();	   	   */ 	} }
