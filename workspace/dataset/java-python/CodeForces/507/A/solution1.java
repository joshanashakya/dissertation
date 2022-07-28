import java.util.*;import java.io.*;import java.lang.*;import java.math.*; public class cp{    static BufferedReader br;    static StringTokenizer st;     public static void main(String[] args)throws IOException{         br = new BufferedReader(new InputStreamReader(System.in));        List<Integer> answer = new ArrayList<Integer>();         // for(int t=Integer.parseInt(br.readLine()); t>0; t--){             st = readLine();            int n = tokenInt();            int k = tokenInt();            st = readLine();            int[] arr = readIntArray(n);            // answer.add(new Solver().solve(n, k, arr));            List<Integer> ans = new Solver().solve(n, k, arr);             System.out.println(ans.size());            if (ans.size() > 0){                for(int a : ans) System.out.print(a + " ");            }         // }         // ListIterator<Integer> it = answer.listIterator();        // while (it.hasNext()) System.out.println(it.next());     }     static StringTokenizer readLine() throws IOException { return new StringTokenizer(br.readLine()); }    static int tokenInt() { return Integer.parseInt(st.nextToken()); }    static long tokenLong(){ return Long.parseLong(st.nextToken()); }    static double tokenDouble(){ return Double.parseDouble(st.nextToken()); }    static char[] tokenChar(){ return st.nextToken().toCharArray(); }    static int[] readIntArray(int n) {        int[] a=new int[n];        for (int i=0; i<n; i++) a[i]=tokenInt();        return a;    } }  class Solver{    public List<Integer> solve(int n, int k, int[] arr) throws IOException{        // Arrays.sort(arr);        // System.out.println(Arrays.toString(arr));        List<Integer> idx = new ArrayList<Integer>();        for(int i=0;i<arr.length; i++){            int minIdx = getMinIdx(arr);             if (k >= arr[minIdx]){                k -= arr[minIdx];                arr[minIdx] = Integer.MAX_VALUE;                // System.out.println("k " + k);                idx.add(minIdx+1);            }        }         // System.out.println(idx.toString());        return idx;    }     static int getMinIdx(int[] arr){        int min = arr[0];        int minIdx = 0;        for (int i=1; i<arr.length; i++) {            if(min > arr[i]){                min = arr[i];                minIdx = i;            }        }         return minIdx;    }} /**/