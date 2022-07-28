import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.*; public class KnapSack {    static class FastReader {        BufferedReader br;        StringTokenizer st;         public FastReader() {            br = new BufferedReader(new InputStreamReader(System.in));        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         String nextLine() {            String str = "";            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return str;        }         double nextDouble() {            return Double.parseDouble(next());        }    }     public static void main(String[] args) {        FastReader in = new FastReader();        int t = in.nextInt();        StringBuilder sb = new StringBuilder();        while (t-- > 0) {            int n = in.nextInt();            long w = in.nextLong();            Pair arr[] = new Pair[n];            for(int i = 0; i < n; i++){                long temp = in.nextLong();                arr[i] = new Pair(i+1,temp);            }            Arrays.sort(arr,new Sort());            ArrayList<Integer> ans = new ArrayList<>();            long sum = 0;            for(int i = 0; i < n; i++){                if( sum + arr[i].val <= w ){                    ans.add(arr[i].ind);                    sum += arr[i].val;                }            }            //System.out.println(sum);            long ll = 0;            if(w % 2 == 0){                ll = w/2;            }else{                ll = w/2 + 1;            }            if(sum >= ll && sum <= w){                sb.append(ans.size()+"\n");                Collections.reverse(ans);                for(int i = 0; i < ans.size(); i++){                    sb.append(ans.get(i)+" ");                }                sb.append("\n");            }else{                sb.append("-1"+"\n");            }        }        System.out.println(sb);    }    static class Pair{        int ind;        long val;         public Pair(int ind, long val ){            this.ind = ind;            this.val = val;        }     }    static class Sort implements Comparator<Pair>{         @Override        public int compare(Pair pair, Pair t1) {            if(pair.val < t1.val){                return 1;            }else if (pair.val == t1.val){                 return 0;            }else{                return -1;            }        }    }}
