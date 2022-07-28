import java.util.*;import java.io.*;  public class Task {     static BufferedReader s1;static BufferedWriter out;static String read() throws IOException{String line="";while(line.length()==0){line=s1.readLine();continue;}return line;}static int int_v (String s1){return Integer.parseInt(s1);}static long long_v(String s1){return Long.parseLong(s1);}static int[] int_arr() throws IOException{String[] a=read().split(" ");int[] b=new int[a.length];for(int i=0;i<a.length;i++){b[i]=int_v(a[i]);}return b;}static long[] long_arr() throws IOException{String[] a=read().split(" ");long[] b=new long[a.length];for(int i=0;i<a.length;i++){b[i]=long_v(a[i]);}return b;}static void assign(){s1=new BufferedReader(new InputStreamReader(System.in));out=new BufferedWriter(new OutputStreamWriter(System.out));}static Map<Integer,List<Integer>> map=new HashMap<>(); static int cmp(int[] a, int[] b){    if(map.get(b[0]).size()<=b[1]+1){return 1;}    if(map.get(a[0]).size()<=a[1]+1){return -1;}    return map.get(b[0]).get(b[1]+1)-map.get(a[0]).get(a[1]+1);}  public static void main(String args[]) throws  IOException {        assign();        int[] n1=int_arr();        int n=n1[0],k=n1[1],res=0;        int[] b=int_arr();        int[] f=new int[n+1];        for(int i=0;i<n;i++){            map.computeIfAbsent(b[i],k1->new ArrayList<>()).add(i);        }        Set<Integer> s=new HashSet<>();        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b1)->cmp(a,b1));        for(int i=0;i<n;i++){            if(s.contains(b[i])){                 pq.add(new int[]{b[i],f[b[i]]});                  f[b[i]]++;                continue;            }            if(s.size()<k){                pq.add(new int[]{b[i],f[b[i]]});                f[b[i]]++;res++;            }            else{                int[] z=pq.poll();                pq.add(new int[]{b[i],f[b[i]]});                f[b[i]]++;res++;                s.remove(z[0]);            }            s.add(b[i]);        }         out.write(res+"\n");                     out.flush();    }           }
