import java.util.ArrayList;import java.util.Collections;import java.util.Scanner; public class parsit {	static long lastVal, ia;	static String expression;	static int idx = 0;		static long getVal(part p, int a) {		return (p.c * (a + (p.add?1:0))) * (p.negative?-1:1);	}		static class part implements Comparable<part>{		boolean negative;		boolean add;		long c;				part(boolean neg, boolean a, long cc) {			negative = neg; add = a; c= cc;		}				@Override		public int compareTo(part o) {			return (int) (getVal(o, 1) + getVal(this, 2)  - (getVal(o, 2) + getVal(this, 1)));		} 			}	static ArrayList<part> parts = new ArrayList<>();	static void summand() {		if(expression.charAt(idx) == 'a') {			parts.add(new part(neg, false, 1));			idx+=3;			return;		} else if(expression.charAt(idx) == '+') {			parts.add(new part(neg, true, 1));			idx+=3;			return;		} 		StringBuilder sb = new StringBuilder();		while(expression.charAt(idx) != '*') {			sb.append(expression.charAt(idx++));		}		long val = Long.parseLong(sb.toString());		idx++;		if(expression.charAt(idx) == 'a') {			lastVal = ia * val + 1;			parts.add(new part(neg, false, val));		} else {			lastVal = (ia +1) * val;			parts.add(new part(neg, true, val));		}		idx += 3;	}	static boolean neg = false;		public static void main(String[] args) {		Scanner in = new Scanner(System.in);		ia = in.nextLong();		expression = in.next();				long ans = 0;		do {			summand();			if(idx >= expression.length()) break;			if(expression.charAt(idx++) == '+') {				neg = false;			} else neg = true;		} while(idx < expression.length());		Collections.sort(parts);		for(int i = 0; i < parts.size(); i++) {			ans += getVal(parts.get(i),(int) ia + i);			//System.out.println(parts.get(i).add + " " + parts.get(i).c + " " + parts.get(i).negative);		}		System.out.println(ans);	}}
