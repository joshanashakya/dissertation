import java.io.*;import java.math.*;import java.security.*;import java.text.*;import java.time.LocalTime;import java.util.*;import java.util.concurrent.*;import java.util.regex.*;  public class B {	 	public static void main(String[] args) {    	FastScanner scan = new FastScanner();    	//PrintWriter out = new PrintWriter(System.out);    	    	int t = 1;//scan.nextInt();    		for(int tt=0; tt<t; tt++) {    			int n = scan.nextInt(), m = scan.nextInt();    			char [][] grid = new char[n][m];    			for(int i=0; i<n; i++) {    				char [] line = scan.next().toCharArray();    				for(int j=0; j<m; j++) grid[i][j] = line[j];    			}    			    			boolean works = false;    			    	outer:	for(int i=1; i+1<n; i++) {    				for(int j=1; j+1<m;j++) {    					char c = grid[i][j];    					if(c == '*') {    						char u = grid[i-1][j], d = grid[i+1][j], r = grid[i][j+1], l = grid[i][j-1];    						if(u == c && d == c && r == c && l == c) {    							boolean [][] visited = new boolean[n][m];    							visited[i][j] = true;    							dfs(visited, i, j, grid);    							works = check(visited, grid);    							break outer;    						}	    					}    				}    			}    			    			System.out.println(works ? "YES" : "NO");    			    		}	}		static boolean check(boolean [][] visited, char [][] grid) {		for(int i=0; i<visited.length; i++) { 			for(int j=0; j<visited[i].length; j++) {				if(!visited[i][j] && grid[i][j] == '*') return false; 								}		}		return true;	}		static void dfs(boolean [][] visited, int currI, int currJ, char [][] grid) {		int n = visited.length, m = visited[0].length;				int i = currI;		//up		loop: while(i >= 0) {			char c = grid[i][currJ];			if(c == '*') visited[i][currJ] = true;			else break loop;			i--;		}		i = currI;		//down		loop: while(i < n) {			char c = grid[i][currJ];			if(c == '*') visited[i][currJ] = true;			else break loop;			i++;		}		int j = currJ;					loop: while(j >= 0) {			char c = grid[currI][j];			if(c == '*') visited[currI][j] = true;			else break loop;			j--;		}		j = currJ;		loop: while(j < m) {			char c = grid[currI][j];			if(c == '*') visited[currI][j] = true;			else break loop;			j++;		}	}			  public static void sort(int [] a) {	    	ArrayList<Integer> b = new ArrayList<>();	    	for(int i: a) b.add(i);	    	Collections.sort(b);	    	for(int i=0; i<a.length; i++) a[i]= b.get(i);	    }	  	  public static void reverse(int [] a) {	    	ArrayList<Integer> b = new ArrayList<>();	    	for(int i: a) b.add(i);	    	Collections.reverse(b);	    	for(int i=0; i<a.length; i++) a[i]= b.get(i);	    }  				    static class FastScanner{    	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    	StringTokenizer st = new StringTokenizer("");    	String next() {    		while(!st.hasMoreTokens())    			try {    				st = new StringTokenizer(br.readLine());    			} catch (IOException e){    				e.printStackTrace();    			}    		return st.nextToken();    	}    	    	int nextInt() {    		return Integer.parseInt(next());    	}    	    	int [] readArray(int n) {    		int [] a = new int[n];    		for(int i=0; i<n ; i++) a[i] = nextInt();    		return a;    	}    	    	long nextLong() {    		return Long.parseLong(next());    	}    	    	    }           } 
