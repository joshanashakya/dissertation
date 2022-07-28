/*package whatever //do not write package name here */import java.util.*;import java.lang.*;import java.io.*; public class codeforces {    static class FastReader {        BufferedReader br;        StringTokenizer st;         public FastReader() {            br = new BufferedReader(new InputStreamReader(System.in));        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         double nextDouble() {            return Double.parseDouble(next());        }         String nextLine() {            String str = "";            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return str;        }    }    static int lbound(int[] arr, int target, int end)    {        int start = 0;         int ans = 0;        while (start <= end)        {            int mid = (start + end) / 2;            if(arr[mid]==target)                return arr[mid];             if (arr[mid] > target)            {                end = mid - 1;            }             // Move right side            else            {                ans = mid;                start = mid + 1;            }        }        return arr[ans];    }    public static void main(String[] args){        FastReader sc = new FastReader();        int t=sc.nextInt();        int[] a=new int[1000001];        Arrays.fill(a,1000000001);        a[0]=0;         for(int i=1;i<a.length;i++){            long x=(long)i*((long)3*i+1)/2;            if(x>1000000000)                break;            else                a[i]=(int)x;        }         while(t-->0){            int c=0;            int n=sc.nextInt();            int temp=n;            if(n<2){                System.out.println(0);                continue;            }             while(true){                int x=lbound(a,temp,a.length);                c++;                temp=temp-x;                if(temp<=1)                    break;             }            System.out.println(c);        }    }}