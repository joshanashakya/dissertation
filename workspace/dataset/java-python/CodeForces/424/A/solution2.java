import java.util.*;import java.io.*;import java.util.stream.*; public class Solution {	public static void main(String[] args) throws Exception {		Scanner scan = new Scanner(System.in);		int n = scan.nextInt();		scan.nextLine();		String s = scan.nextLine();		int Xnum = 0;		int xnum = 0;		StringBuilder result = new StringBuilder();		for(int j = 0; j < n; j++) {			char ch = s.charAt(j);			if(ch == 'X') {				Xnum++;			} else {				xnum++;			}		}		if(Xnum == xnum) {			result.append("0\n" + s);		} else {			int r = Math.max(Xnum - n/2, xnum - n/2);			StringBuilder sr = new StringBuilder();			for(int j = 0; j < n; j++) {				char ch = s.charAt(j);				if(ch == 'X' && Xnum > xnum && r > 0) {					sr.append('x');					r--;				} else				if(ch == 'x' && Xnum < xnum && r > 0) {					sr.append('X');					r--;				} else {					sr.append(ch);				}			}			result.append(Math.max(Xnum - n/2, xnum - n/2) + "\n" + sr);		}				System.out.println(result);	}	}
