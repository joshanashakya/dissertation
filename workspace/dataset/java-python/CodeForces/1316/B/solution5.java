import java.util.*;import java.io.*;import java.math.*; public class Practice  { 	 static FastReader sc=new FastReader(); 	 static int dx[]= {-1,0,1,0};	 static int dy[]= {0,1,0,-1};	 static int k;		  public static void main(String[] args)     {			//StringBuffer sb=new StringBuffer("");			   int ttt =1;			    	 ttt=i();		        outer :while (ttt-- > 0) 				{		        	int n=i();		        	String s=s();		        	String t=s+"";		        	char ch[]=s.toCharArray();		        	Arrays.parallelSort(ch);		        	char c=ch[0];		        	HashMap<String,Integer> map=new HashMap<String, Integer>();		        	for(int i=0;i<n;i++) {		        		if(s.charAt(i)==c) {//		        			if(i==(n-1)) {//		        				StringBuffer sg=new StringBuffer(s);//		        				sg.reverse();//		        				String ss=sg.toString();//		        				//		        				if(!map.containsKey(ss)) {//		        					map.put(ss,i+1);//		        				}//		        				continue;//		        			}		        				String ss=s.substring(0,i);		        				int j=n-i+1;		        				StringBuffer sg=new StringBuffer(ss);		        				if(j%2==0)		        					sg.reverse();		        				ss=s.substring(i)+sg.toString();		        				if(!map.containsKey(ss)) {		        					map.put(ss,i+1);		        				}		        		}		        	}		        	String res=s+"";		        	int kk=1;		        	for(String r : map.keySet()) {		        		if(r.compareTo(res)<0) {		        			res=r;		        			kk=map.get(r);		        		}		        		else if(r.compareTo(res)==0) {		        			int y=map.get(r);		        			if(y<kk){		        				kk=y;		        			}		        		}		        	}		        	System.out.println(res);		        	System.out.println(kk);		        			        		        					}		        //System.out.println(sb.toString());    }		  		  private static void dfs(char[][] A, boolean[][] v, int x, int y) {				v[x][y]=true;								int c=1;				for(int i=0;i<dx.length;i++) {					int newx=x+dx[i];					int newy=y+dy[i];					if(valid(A,v,newx,newy)) {						dfs(A,v,newx,newy);					}				}				if(A[x][y]=='.' && k>0) {					k--;					A[x][y]='X';				}			}			private static boolean valid(char[][] A, boolean[][] v, int newx, int newy) {				int n=A.length;				int m=A[0].length;				if(newx<0 || newx>=n || newy<0 || newy>=m)					return false;				if(v[newx][newy]==true ||  A[newx][newy]=='#')					return false;				return true;			}		  public static void BFS(char[][] grid,int s,int e,ArrayList<String> A[],int d[][]) { 		        int h = grid.length;		        if (h == 0)		            return;		        int l = grid[0].length; 		        boolean[][] visited = new boolean[h][l]; 		        Queue<String> queue = new LinkedList<>(); 		        queue.add(s + "," + e); 		       // System.out.println("Breadth-First Traversal: ");		        while (queue.isEmpty() == false) { 		            String x = queue.remove();		            int row = Integer.parseInt(x.split(",")[0]);		            int col = Integer.parseInt(x.split(",")[1]);		             		            if (row < 0 || col < 0 || row >= h || col >= l || visited[row][col]|| grid[row][col]=='#')		                continue;		            int dis=d[row][col]; 		            visited[row][col] = true;		            //System.out.print(grid[row][col] + " ");		            char ch=grid[row][col];		            if(ch>='a' && ch<='z') {		            	for(int i=0;i<A[ch-'a'].size();i++) {		            		String ss=A[ch-'a'].get(i);		            		 int r = Integer.parseInt(ss.split(",")[0]);		 		            int c = Integer.parseInt(ss.split(",")[1]);		 		            		            	}		            }		            queue.add(row + "," + (col - 1)); //go left		            queue.add(row + "," + (col + 1)); //go right		            queue.add((row - 1) + "," + col); //go up		            queue.add((row + 1) + "," + col); //go down		        }		    } 	 static int[] input(int n) {	int A[]=new int[n];	   for(int i=0;i<n;i++) {		   A[i]=sc.nextInt();	   }	   return A;   }static long[] inputL(int n) {	long A[]=new long[n];	   for(int i=0;i<n;i++) {		   A[i]=sc.nextLong();	   }	   return A;   }static String[] inputS(int n) {	String A[]=new String[n];	   for(int i=0;i<n;i++) {		   A[i]=sc.next();	   }	   return A;   }  static void input(int A[],int B[]) {	   for(int i=0;i<A.length;i++) {		   A[i]=sc.nextInt();		   B[i]=sc.nextInt();	   }}static int max(int A[]) {	int max=Integer.MIN_VALUE;	for(int i=0;i<A.length;i++) {		max=Math.max(max, A[i]);	}	return max;}static int min(int A[]) {	int min=Integer.MAX_VALUE;	for(int i=0;i<A.length;i++) {		min=Math.min(min, A[i]);	}	return min;}static long max(long A[]) {	long max=Long.MIN_VALUE;	for(int i=0;i<A.length;i++) {		max=Math.max(max, A[i]);	}	return max;}static long min(long A[]) {	long min=Long.MAX_VALUE;	for(int i=0;i<A.length;i++) {		min=Math.min(min, A[i]);	}	return min;}static long mod(long x) {	 int mod=1000000007;	  return ((x%mod + mod)%mod);}      static int i() {    	 return sc.nextInt();     }     static String s() {    	 return sc.next();     }     static long l() {    	 return sc.nextLong();     }       static void sort(int[] A){        int n = A.length;        Random rnd = new Random();        for(int i=0; i<n; ++i){            int tmp = A[i];            int randomPos = i + rnd.nextInt(n-i);            A[i] = A[randomPos];            A[randomPos] = tmp;        }        Arrays.sort(A);     }     static boolean prime(int n) 	    { 	        if (n <= 1) 	            return false; 	        if (n <= 3) 	            return true; 	        if (n % 2 == 0 || n % 3 == 0) 	            return false; 	        double sq=Math.sqrt(n);	  	        for (int i = 5; i <= sq; i = i + 6) 	            if (n % i == 0 || n % (i + 2) == 0) 	                return false; 	        return true; 	    }      static int gcd(int a, int b)      {          if (a == 0)              return b;          return gcd(b % a, a);      }        static class Pair     {    	 int a;    	 int b;     }                    static class FastReader     {         BufferedReader br;         StringTokenizer st;           public FastReader()         {             br = new BufferedReader(new                     InputStreamReader(System.in));         }           String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }           int nextInt()         {             return Integer.parseInt(next());         }           long nextLong()         {             return Long.parseLong(next());         }           double nextDouble()         {             return Double.parseDouble(next());         }           String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     } }    