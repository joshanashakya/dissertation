import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.ArrayList;import java.util.Collections;import java.util.StringTokenizer; public class Cutting {    static class FastReader {        BufferedReader br;        StringTokenizer st;         public FastReader() {            br = new BufferedReader(new InputStreamReader(System.in));        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         String nextLine() {            String str = "";            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return str;        }         double nextDouble() {            return Double.parseDouble(next());        }    }    public static void main(String[] args) {        FastReader in = new FastReader();        int n = in.nextInt();        int max_C = in.nextInt();        int arr[] = new int[n];        for(int i = 0 ; i < n; i++){            arr[i] = in.nextInt();        }        int c_E = 0;        int c_O = 0;        if(arr[0] % 2  == 0){            c_E++;        }else{            c_O++;        }        ArrayList<Integer> res = new ArrayList<>();        for(int i = 1; i < n; i++){            if(c_E == c_O){                int p = Math.abs(arr[i]-arr[i-1]);                res.add(p);            }            if(arr[i] % 2 == 0){                c_E++;            }else{                c_O++;            }        }        Collections.sort(res);        int c = 0;int ans = 0;        for(int i = 0; i < res.size(); i++){            if(c + res.get(i) <=  max_C){                c+=res.get(i);                ans++;            }else{                break;            }        }        System.out.println(ans);    }}