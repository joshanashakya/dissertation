//I AM THE CREED/* //I AM THE CREED/* package codechef; // don't place package name! */import java.io.BufferedReader; import java.io.IOException; import java.io.InputStreamReader; import java.util.StringTokenizer; import java.util.*;import java.awt.Point;public class Main{    static int[] num=new int[100001];    public static void main(String[] args) throws IOException     {         FastScanner input = new FastScanner();        String s=input.next();        String t=input.next();        long[][] dp=new long[s.length()][t.length()];        long mod=1000000007;        for(int i=0;i<s.length();i++){            for(int j=0;j<t.length();j++){                dp[i][j]=((s.charAt(i)==t.charAt(j)?1:0)+((j>0?dp[i][j-1]:0)+(s.charAt(i)==t.charAt(j) && i>0 && j>0?dp[i-1][j-1]:0)))%mod;            }        }        long tot=0;        for(int i=0;i<s.length();i++){            tot=(tot+dp[i][t.length()-1])%mod;        }        System.out.println(tot);    }    static int dfs1(int n, HashMap<Integer, HashSet<Integer>> g, HashSet<Integer> visited){        if(visited.contains(n)){            return 0;        }        HashSet<Integer> children=g.get(n);        num[n]=1;        visited.add(n);        for(int child:children){            num[n]+=dfs1(child, g, visited);                        }        return num[n];    }    static int dfs(int n, HashMap<Integer, HashSet<Integer>> g, HashSet<Integer> vis){        if(vis.contains(n)){            return 0;        }        HashSet<Integer> children=g.get(n);        vis.add(n);        int ans=0;        for(int child:children){            if(vis.contains(child)){                continue;            }            ans+=(num[child]%2==0?1:0)+dfs(child, g, vis);        }        return ans;            }    static class FastScanner {		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		StringTokenizer st=new StringTokenizer("");		String next() {			while (!st.hasMoreTokens())				try {					st=new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			return st.nextToken();		}				int nextInt() {			return Integer.parseInt(next());		}		int[] readArray(int n) {			int[] a=new int[n];			for (int i=0; i<n; i++) a[i]=nextInt();			return a;		}		long nextLong() {			return Long.parseLong(next());		}	}         }
