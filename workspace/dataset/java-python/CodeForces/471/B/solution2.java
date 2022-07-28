import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.math.BigInteger;import java.util.*; import javafx.util.Pair; public class Main{     public static void main(String[] args)    {         FastScanner input = new FastScanner();        int n = input.nextInt();         int a[][] = new int[n][2];        int freq[] = new int[2001];        TreeSet<Integer> set = new TreeSet<>();        for (int i = 0; i < n; i++) {            a[i][1] = input.nextInt();            a[i][0] = i;            freq[a[i][1]]++;            set.add(a[i][1]);         }         long total = 1;        for (Integer integer : set) {             total *= freq[integer];            if(total>=3)            {                break;            }        }        Arrays.sort(a, new Comparator<int[]>()        {            @Override            public int compare(int[] t, int[] t1)            {                return t[1] - t1[1];            }         });//        for (int i = 0; i < n; i++) {//            System.out.println(a[i][0]+" "+a[i][1]);//        } //        System.out.println(total);         if (total < 3) {            System.out.println("NO");        } else {            System.out.println("YES");            for (int i = 0; i < n; i++) {                System.out.print((a[i][0]+1) + " ");            }             System.out.println("");            int next = 0;            for (int i = 0; i < n-1; i++) {                if (a[i][1] == a[i + 1][1]) {                    int temp = a[i][0];                    a[i][0]=a[i+1][0];                    a[i+1][0] = temp;                    next =i+1;                    break;                }            }            for (int i = 0; i < n; i++) {                System.out.print((a[i][0]+1) + " ");            }            System.out.println("");//            System.out.println("next->"+next//            );            for (int i = next; i < n-1; i++) {                if (a[i][1] == a[i + 1][1]) {                    int temp = a[i][0];                    a[i][0]=a[i+1][0];                    a[i+1][0] = temp;                    next = i;                    break;                }            }            for (int i = 0; i < n; i++) {                System.out.print((a[i][0]+1) + " ");            }            System.out.println("");        }     }     static class FastScanner    {         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer("");         String next()        {            while (!st.hasMoreTokens()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt()        {            return Integer.parseInt(next());        }         long nextLong()        {             return Long.parseLong(next());        }         double nextDouble()        {            return Double.parseDouble(next());        }         String nextLine() throws IOException        {            return br.readLine();        }    } }