import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.ArrayList;import java.util.StringTokenizer; public class Main {     public static void main(String[] args) throws IOException {        Solution solution = new Solution();        solution.solve();    }} class Solution{    Solution(){}     void solve() throws IOException{        int t = Reader.nextInt();        int count = 0;        while (count<t){            int n = Reader.nextInt();            int k = Reader.nextInt();            boolean flag = false;            ArrayList<Integer> arrayList = new ArrayList<>();            if(n>=k){                if((n-(k-1))%2==1) {                    flag=true;                    arrayList.add(n-(k-1));                    for(int i=0;i<k-1;i++){                        arrayList.add(1);                    }                }            }            if(n>=k*2){                if((n-2*(k-1))%2==0) {                    flag=true;                    arrayList.add(n-2*(k-1));                    for(int i=0;i<k-1;i++){                        arrayList.add(2);                    }                }            }             if(flag){                System.out.println("YES");                for(int i=0;i<k;i++){                    System.out.print(arrayList.get(i)+" ");                }                System.out.println();            }else{                System.out.println("NO");            }            count++;        }    }} class Reader {    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));    static StringTokenizer tokenizer = new StringTokenizer("");    static String nextLine() throws IOException {// 读取下一行字符串        return reader.readLine();    }    static String next() throws IOException {// 读取下一个字符串        while (!tokenizer.hasMoreTokens()) {            tokenizer = new StringTokenizer(reader.readLine());        }        return tokenizer.nextToken();    }     static int nextInt() throws IOException {// 读取下一个int型数值        return Integer.parseInt(next());    }     static double nextDouble() throws IOException {// 读取下一个double型数值        return Double.parseDouble(next());    }     static long nextLong() throws IOException {// 读取下一个long型数值        return Long.parseLong(next());    }}