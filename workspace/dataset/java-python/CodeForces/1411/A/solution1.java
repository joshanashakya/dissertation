import java.io.*;import java.math.BigInteger;import java.util.*;import static java.lang.Math.PI;import static java.lang.System.in;import static java.lang.System.out;import static java.lang.System.err; public class A {        public static void main(String[] args) throws Exception {           Foster sc = new Foster();        PrintWriter p = new PrintWriter(out);        int t = sc.nextInt();        while(t--!=0){            int n = sc.nextInt();            char a[] = sc.next().toCharArray();            int count = 0;            for(int i = n-1; i >= 0; i--){                if(a[i]==')')   count++;                else    break;            }            p.println(count > n-count ? "Yes" : "No");        }        p.close();    }        static long[] sort(long a[]){        ArrayList<Long> arr = new ArrayList<>();        for(long i : a){            arr.add(i);        }        Collections.sort(arr);        for(int i = 0; i < arr.size(); i++){            a[i] = arr.get(i);        }        return a;    }    static int[] sort(int a[]){        ArrayList<Integer> arr = new ArrayList<>();        for(int i : a){            arr.add(i);        }        Collections.sort(arr);        // Collections.reverse(arr);        for(int i = 0; i < arr.size(); i++){            a[i] = arr.get(i);        }        return a;    }        /* */    /*1. Check overflow in pow function or in general2. Check indices of read array function3. Think of an easier solution because the problems you solve are always easy4. Check iterator of loop5. If still doesn't work, then jump from the 729th floor 'coz "beta tumse na ho paayega"     Move to top!!*/    static class Foster {        BufferedReader br = new BufferedReader(new InputStreamReader(in));        StringTokenizer st = new StringTokenizer("");        String next() {            while (!st.hasMoreTokens())                try {                    st = new StringTokenizer(br.readLine());                }                 catch (IOException e) {                    e.printStackTrace();                }            return st.nextToken();        }        int nextInt() {            return Integer.parseInt(next());        }        long nextLong() {            return Long.parseLong(next());        }        double nextDouble() {            return Double.parseDouble(next());        }        int[] intArray(int n) {                   // Check indices            int arr[] = new int[n];            for(int i = 0; i < n; i++) {                arr[i] = nextInt();            }            return arr;        }        long[] longArray(int n) {                 // Check indices            long arr[] = new long[n];            for(int i = 0; i < n; i++) {                arr[i] = nextLong();            }            return arr;        }        int[] getBits(int n) {                   //in Reverse Order            int a[] = new int[31];            for(int i = 0; i < 31; i++) {                if(((1<<i) & n) != 0)                    a[i] = 1;            }            return a;        }        static long pow(long... a) {            long mod = Long.MAX_VALUE;            if(a.length == 3)   mod = a[2];            long res = 1;            while(a[1] > 0) {                if((a[1] & 1) == 1)                    res = (res * a[0]) % mod;                a[1] /= 2;                a[0] = (a[0] * a[0]) % mod;            }            return res;        }        static void watch(Object...a) throws Exception {            int i = 1;            for (Object o: a) {                boolean found = false;                if (o.getClass().isArray()) {                    String type = o.getClass().getName().toString();                    switch (type) {                        case "[I": {                            int[] test = (int[]) o;                            err.println(i + " : " + Arrays.toString(test));                            break;                        }                        case "[[I": {                            int[][] obj = (int[][]) o;                            err.println(i + " : " + Arrays.deepToString(obj));                            break;                        }                        case "[J": {                            long[] obj = (long[]) o;                            err.println(i + " : " + Arrays.toString(obj));                            break;                        }                        case "[[J": {                            long[][] obj = (long[][]) o;                            err.println(i + " : " + Arrays.deepToString(obj));                            break;                        }                        case "[D": {                            double[] obj = (double[]) o;                            err.println(i + " : " + Arrays.toString(obj));                            break;                        }                        case "[[D": {                            double[][] obj = (double[][]) o;                            err.println(i + " : " + Arrays.deepToString(obj));                            break;                        }                        case "[Ljava.lang.String": {                            String[] obj = (String[]) o;                            err.println(i + " : " + Arrays.toString(obj));                            break;                        }                        case "[[Ljava.lang.String": {                            String[][] obj = (String[][]) o;                            err.println(i + " : " + Arrays.deepToString(obj));                            break;                        }                        case "[C": {                            char[] obj = (char[]) o;                            err.println(i + " : " + Arrays.toString(obj));                            break;                        }                        case "[[C": {                            char[][] obj = (char[][]) o;                            err.println(i + " : " + Arrays.deepToString(obj));                            break;                        }                        default: {                            err.println(i + " : type not identified");                            break;                        }                    }                    found = true;                }                if (!found) {                    err.println(i + " = " + o);                }                i++;            }        }    }} 