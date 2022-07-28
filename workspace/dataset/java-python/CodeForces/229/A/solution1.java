import java.util.*;import java.io.*;/** * * @author alanl */public class Main {     /**     * @param args the command line arguments     */    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));    static StringTokenizer st;    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));    public static void main(String[] args) throws IOException{        int n = readInt(), m = readInt();        ArrayList<Integer>adj[] = new ArrayList[n];        for(int i = 0; i<n; i++)adj[i] = new ArrayList();        String[]arr = new String[n];        for(int i = 0; i<n; i++){            arr[i] = readLine();            boolean flag = true;            for(int j = 0; j<m; j++){                if(arr[i].charAt(j)=='1'){                    flag = false;                    adj[i].add(j);                }            }            if(flag){                System.out.println(-1);                return;            }        }        int[][]lft = new int[n][m], rit = new int[n][m];        for(int i = 0; i<n; i++){            //Collections.sort(adj[i]);            int cur = adj[i].get(adj[i].size()-1);            for(int j = 0; j<m; j++){                if(arr[i].charAt(j)=='1'){                    cur = j;                }                lft[i][j] = cur;            }            cur = adj[i].get(0);            for(int j = m-1; j>=0; j--){                if(arr[i].charAt(j)=='1'){                    cur = j;                }                rit[i][j] = cur;            }        }        long ans = Long.MAX_VALUE;        for(int j = 0; j<m; j++){            long cur = 0;            for(int i = 0; i<n; i++){                int a = rit[i][j]-j, b = j-lft[i][j];                if(a<0)a+=m;                if(b<0)b+=m;                cur+=Math.min(a, b);            }            ans = Math.min(ans, cur);        }        System.out.println(ans);    }    static String next () throws IOException {        while (st == null || !st.hasMoreTokens())                st = new StringTokenizer(input.readLine().trim());        return st.nextToken();    }    static long readLong () throws IOException {        return Long.parseLong(next());    }    static int readInt () throws IOException {        return Integer.parseInt(next());    }    static double readDouble () throws IOException {        return Double.parseDouble(next());    }    static char readChar () throws IOException {        return next().charAt(0);    }    static String readLine () throws IOException {        return input.readLine().trim();    }}
