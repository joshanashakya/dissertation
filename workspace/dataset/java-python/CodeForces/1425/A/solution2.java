import java.io.File;import java.io.FileNotFoundException;import java.util.ArrayDeque;import java.util.ArrayList;import java.util.Arrays;import java.util.HashMap;import java.util.Iterator;import java.util.Scanner; public class A {	public static void main(String[] args) throws FileNotFoundException {		Scanner in = new Scanner(System.in);				int n = in.nextInt();		for(int i = 0; i < n; i++) {			long num = in.nextLong();			long res = 0;			int turn = 0;			while(num > 0) {				long amt = 0;				if(num%4 == 0 && num > 8) amt = 1;				else if(num%2 == 0) {					amt = num/2;				}				else {					amt = 1;				}				num -= amt;				if(turn == 0) res += amt;				turn = (turn + 1)%2;			}			System.out.println(res);		}			}}
