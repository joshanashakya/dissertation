import java.io.*;import java.util.*; public class Codeforces {    int l,r,x;    int count;    void subsetSums(int arr[], int n){        int total = 1 << n;        for(int i = 0; i < total; i++){            long sum = 0,min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;            for(int j = 0; j < n; j++) {                if ((i & (1 << j)) != 0) {                    min = Math.min(min, arr[j]);                    max = Math.max(max, arr[j]);                    sum += arr[j];                }            }            if (sum >= l && sum <= r && max - min >= x) {//                System.out.println(sum + " " + max + " " + min);                count++;            }        }    }    public  void solve() {        FastScanner fs = new FastScanner();        StringBuilder print = new StringBuilder();        int n = fs.nextInt();        l = fs.nextInt();        r = fs.nextInt();        x = fs.nextInt();        count = 0;        int[]cr = new int[n];        for(int i=0;i<n;i++){            cr[i] = fs.nextInt();        }        subsetSums(cr,n);        System.out.println(count);    }     public static void main(String[]args){        try{            new Codeforces().solve();        }catch (Exception e){            e.printStackTrace();        }    }    class FastScanner {        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st=new StringTokenizer("");        String next() {            while (!st.hasMoreTokens())                try {                    st=new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            return st.nextToken();        }        String nextLine()        {            String str = "";            try            {                str = br.readLine();            }            catch (IOException e)            {                e.printStackTrace();            }            return str;        }         int nextInt() {            return Integer.parseInt(next());        }        long nextLong() {            return Long.parseLong(next());        }    } } 