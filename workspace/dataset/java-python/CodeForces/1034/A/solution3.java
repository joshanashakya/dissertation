import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.*; public class EnlargeGCD {    private static int spf[];     private static int gcd(int a, int b) {        int max = Integer.max(a, b);        int min = Integer.min(a, b);        while (max % min != 0) {            int temp = max % min;            max = min;            min = temp;        }        return min;    }     private static void preprocess(int range) {        boolean vstd[] = new boolean[range + 1];        spf = new int[range + 1];        for (int i = 2; i * i <= range; i++) {            if (!vstd[i]) {                for (int j = i * i; j <= range; j += i) {                    if (!vstd[j]) {                        spf[j] = i;                    }                    vstd[j] = true;                }            }        }        for (int i = 2; i < vstd.length; i++) {            if (!vstd[i]) {                spf[i] = i;            }        }    }     private static ArrayList<Integer> primeFactors(int n) {        ArrayList<Integer> pf = new ArrayList<>();        int prev = -1;        while (n != 1) {            if (spf[n] != prev) {                pf.add(spf[n]);                prev = spf[n];            }            n = n / spf[n];        }        return pf;    }      public static void main(String[] args) throws IOException {        int n;        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        n = Integer.parseInt(br.readLine());        int arr[] = new int[n];        StringTokenizer st = new StringTokenizer(br.readLine());        for (int i = 1; i <= n; i++) {            int x = Integer.parseInt(st.nextToken());            arr[i - 1] = x;        }          int gcdT = arr[0];        for (int i = 1; i < arr.length; i++) {            gcdT = gcd(gcdT, arr[i]);        }         Map<Integer, Integer> freq = new HashMap<>();        for (int i = 0; i < arr.length; i++) {            arr[i] = arr[i] / gcdT;        } //        int temp = arr[0];//        boolean flag = true;//        for (int i = 1; i < arr.length; i++) {//            if (arr[i] != temp) {//                flag = false;//                break;//            }//        }//        if (flag) {//            System.out.println(-1);//            return;//        }         preprocess(15000000);        ArrayList<Integer> primeFactors;        for (int i = 0; i < arr.length; i++) {            primeFactors = primeFactors(arr[i]);            for (int x : primeFactors) {                if (freq.containsKey(x)) {                    freq.put(x, freq.get(x) + 1);                } else {                    freq.put(x, 1);                }            }        }          int max = Integer.MIN_VALUE;//        int mini1 = Integer.MAX_VALUE;         // Iterate in map and check for        // every factor and its count        for(Map.Entry<Integer, Integer> it : freq.entrySet())        {//            int fir = it.getKey();            int sec = it.getValue();             // Check for the largest appearing factor            // which does not appears in any one or more            if (sec>=max)            {                max=sec;            }        }        if (max != Integer.MIN_VALUE)            System.out.println(n-max);        else            System.out.println(-1); //        System.out.println(n - value_max);//        preprocess(10000000);//        System.out.println(primeFactors(64));//        System.out.println(primeFactors(145));    }}