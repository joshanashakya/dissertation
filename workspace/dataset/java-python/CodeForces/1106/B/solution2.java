import java.util.*;import java.io.*;import java.math.*;/** * * @author alanl */public class Main{    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));    static StringTokenizer st;    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));    public static void main(String[] args) throws IOException{        int n = readInt(), q = readInt(), a[] = new int[n];        Set<Integer>s = new HashSet();        for(int i = 0; i<n; i++)a[i] = readInt();        edge[]arr = new edge[n];        for(int i = 0; i<n; i++){            int b = readInt();            arr[i] = new edge(i, b, a[i]);            s.add(i);        }        Arrays.sort(arr);        Map<Integer, Integer>mp = new HashMap();        for(int i = 0; i<n; i++){            mp.put(arr[i].v, i);        }        int cur = 0; //cheapest        for(int i = 0; i<q; i++){            int idx = mp.get(readInt()-1), cnt = readInt(), val;            boolean flag = true;            long ans = 0;            if(!s.contains(idx)){                while(cnt!=0){                    if(cur>=n){                        flag = false;                        break;                    }                    val = Math.min(cnt, arr[cur].amt);                    cnt-=val;                    arr[cur].amt-=val;                    ans+=1L*val*arr[cur].cost;                    if(arr[cur].amt==0)cur++;                }                if(!flag)println(0);                else println(ans);                continue;            }            val = Math.min(cnt, arr[idx].amt);            cnt-=val;            arr[idx].amt-=val;            ans+=1L*val*arr[idx].cost;            if(cnt==0){                println(ans);                continue;            }            else{                s.remove(idx);                if(!s.contains(idx)){                    while(cnt!=0){                        if(cur>=n){                            flag = false;                            break;                        }                        val = Math.min(cnt, arr[cur].amt);                        cnt-=val;                        arr[cur].amt-=val;                        ans+=1L*val*arr[cur].cost;                        if(arr[cur].amt==0)cur++;                    }                }            }            if(!flag)println(0);            else println(ans);        }    }    static class edge implements Comparable<edge>{        int v, cost, amt;        edge(int v0, int w0, int u0){            v = v0;            cost = w0;            amt = u0;        }        @Override        public int compareTo(edge e){            return cost-e.cost;        }    }    static String next () throws IOException {        while (st == null || !st.hasMoreTokens())                st = new StringTokenizer(input.readLine().trim());        return st.nextToken();    }    static long readLong () throws IOException {        return Long.parseLong(next());    }    static int readInt () throws IOException {        return Integer.parseInt(next());    }    static double readDouble () throws IOException {        return Double.parseDouble(next());    }    static char readChar () throws IOException {        return next().charAt(0);    }    static String readLine () throws IOException {        return input.readLine().trim();    }    static void print(Object b) {        System.out.print(b);    }    static void println(Object b) {        System.out.println(b);    }    static void println() {        System.out.println();    }}
