import java.io.BufferedInputStream;import java.util.HashSet;import java.util.Scanner; import javax.jws.WebParam.Mode; public class Main{   public static char[][] s;   static int n,m,sum;   static int[] a = new int[1000];   static char c ;   static int[][] ans = {{0,1},{1,0},{-1,0},{0,-1}};   static int[][] cnt;	public static void main(String[] args) {        	Scanner sc = new Scanner(new BufferedInputStream(System.in));        	n = sc.nextInt();m = sc.nextInt();        	c = sc.next().charAt(0);    	        	s = new char[n][m];        	cnt = new int[n][m];        	String string;         	for(int i = 0;i < n;i++) {        		string = sc.next();        		for(int j = 0;j <= string.length()-1; j++) {        			s[i][j] = string.charAt(j);        		}        	}        	sum =  0;        	for(int i = 0;i < n;i++) {        		for(int j = 0;j < m;j ++) {        			if(s[i][j] == c) {        				dfs(i,j);        			}        		}        	}        	System.out.println(sum);    }		private static void dfs(int i, int j) {		// TODO Auto-generated method stub		for(int k = 0; k < 4; k++) {			int  p = i+ans[k][0];			int q = j + ans[k][1];			if(p<0||p>=n||q<0||q>=m) continue;			else if(check(p, q)) {				sum++;			}			if(s[p][q] == c) {				s[p][q] = '.';				dfs(p ,q );			}		}	} 	private static boolean check(int p, int q) {		// TODO Auto-generated method stub		if(s[p][q]!='.' && s[p][q]!=c && a[s[p][q]]==0) {			a[s[p][q]] = 1;			return true;		}		return false;	}}	 				  		  		    								 	 		
