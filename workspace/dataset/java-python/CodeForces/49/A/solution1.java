//package codeforces;import java.util.*; public class Sleuth {		public static void main(String[] args) {		Scanner scan = new Scanner(System.in);		String S =  scan.nextLine();		char[] A = S.toCharArray(); 		int count = 0; 		for(int i = 0; i < A.length; i++) {			if(A[i] == ' ' || A[i] == '?') {				count++; 			}		}		char[] B = new char[A.length - count];		int j = 0; 		for(int i = 0; i < A.length; i++) {			if(A[i] != ' ' && A[i] != '?') {				B[j] = A[i];				j++;			}		}				//System.out.println(Arrays.toString(A));		//System.out.println(Arrays.toString(B));		char L = B[B.length - 1];		if(L == 'A' || L == 'a') {			System.out.println("YES");		}		else if(L == 'E' || L == 'e') {			System.out.println("YES");		}		else if(L == 'I' || L == 'i') {			System.out.println("YES");		}		else if(L == 'U' || L == 'o') {			System.out.println("YES");		}		else if(L == 'y' || L == 'Y') {			System.out.println("YES");		}		else {			System.out.println("NO");		}					} }