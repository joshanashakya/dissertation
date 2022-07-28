import java.util.*;import java.io.*;import java.text.*;/** * * @author alanl */public class Main{    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));    static StringTokenizer st;    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));    public static void main(String[] args) throws IOException{        int n = readInt(), x = 0, y = 0;        if(n==1){            System.out.println(1);            return;        }        long[][]adj = new long[n][n];        for(int i = 0; i<n; i++){            for(int j = 0; j<n; j++){                adj[i][j] = readInt();                if(adj[i][j]==0){                    x = i;                    y = j;                }            }        }        Map<Long, Integer>mp = new HashMap();        for(int i = 0; i<n; i++){            long a = 0, b = 0;            for(int j = 0; j<n; j++){                a+=adj[i][j];                b+=adj[j][i];            }            mp.put(a, mp.getOrDefault(a, 0)+1);            mp.put(b, mp.getOrDefault(b, 0)+1);        }        long val = 0, val1 = 0, cnt = 0;        for(int i = 0; i<n; i++){            if(adj[i][i]==0)cnt++;            if(adj[i][n-i-1]==0)cnt++;            val+=adj[i][i];            val1+=adj[i][n-i-1];        }        mp.put(val, mp.getOrDefault(val, 0)+1);        mp.put(val1, mp.getOrDefault(val1, 0)+1);        if(mp.size()!=2){            System.out.println(-1);            return;        }        ArrayList<Long>ans = new ArrayList();        int max = 0;        long prev = 0;        for(Map.Entry<Long, Integer>e : mp.entrySet()){            if(e.getValue()>max){                max = e.getValue();                prev = e.getKey();                ans.add(0, e.getKey());            }            else if(e.getValue()==max && e.getKey()>prev){                max = e.getValue();                prev = e.getKey();                ans.add(0, e.getKey());            }            else ans.add(e.getKey());        }        if(ans.get(0)<ans.get(1)||max!=2*n-cnt)System.out.println(-1);        else System.out.println(ans.get(0)-ans.get(1));    }    static String next () throws IOException {        while (st == null || !st.hasMoreTokens())                st = new StringTokenizer(input.readLine().trim());        return st.nextToken();    }    static long readLong () throws IOException {        return Long.parseLong(next());    }    static int readInt () throws IOException {        return Integer.parseInt(next());    }    static double readDouble () throws IOException {        return Double.parseDouble(next());    }    static char readChar () throws IOException {        return next().charAt(0);    }    static String readLine () throws IOException {        return input.readLine().trim();    }}
