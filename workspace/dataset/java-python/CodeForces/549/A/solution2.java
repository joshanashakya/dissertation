import java.util.*; public class Solution {		private static char[] face = new char[]{'f', 'a', 'c', 'e'};	    public static void main(String[] args) {        Scanner scan = new Scanner(System.in);		int n = scan.nextInt();		int m = scan.nextInt();		scan.nextLine();		char[][] arr = new char[n][m];		List<Coord> fs = new ArrayList<>();		for(int i = 0; i < n; i++) {			String s = scan.nextLine();			for(int j = 0; j < m; j++) {				char ch = s.charAt(j);				arr[i][j] = ch;				if(ch == 'f') {					fs.add(new Coord(i,j));				}			}		}		int res = 0;		for(Coord elem : fs) {			if(elem.a < n-1 && elem.b < m-1 &&			   isFace(arr[elem.a][elem.b], 					  arr[elem.a][elem.b+1], 					  arr[elem.a+1][elem.b], 					  arr[elem.a+1][elem.b+1])		    ) {				res++;			}			if(elem.a < n-1 && elem.b > 0 &&			   isFace(arr[elem.a][elem.b-1], 					  arr[elem.a][elem.b], 					  arr[elem.a+1][elem.b-1], 					  arr[elem.a+1][elem.b])		    ) {				res++;			}			if(elem.a > 0 && elem.b > 0 &&			   isFace(arr[elem.a-1][elem.b-1], 					  arr[elem.a-1][elem.b], 					  arr[elem.a][elem.b-1], 					  arr[elem.a][elem.b])		    ) {				res++;			}			if(elem.a > 0 && elem.b < m-1 &&			   isFace(arr[elem.a-1][elem.b], 					  arr[elem.a-1][elem.b+1], 					  arr[elem.a][elem.b], 					  arr[elem.a][elem.b+1])		    ) {				res++;			}		}		System.out.println(res);    }				private static boolean isFace(char c1, char c2, char c3, char c4) {		List<Character> fce = new ArrayList<>();		fce.add(c1);		fce.add(c2);		fce.add(c3);		fce.add(c4);		for(char elem : face) {			fce.remove(new Character(elem));		}		return fce.isEmpty();	}} class Coord {	public int a;	public int b;		public Coord(int a, int b) {		this.a = a;		this.b = b;	}}