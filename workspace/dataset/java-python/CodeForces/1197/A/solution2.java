import java.util.*; public class ICPC {    public static void main(String[] args) {          Scanner sc = new Scanner(System.in);        int t = sc.nextInt();        process:for (int i = 1; i <= t; i++) {            int n = sc.nextInt();           // SortedSet<Integer> sortedSet=new TreeSet<>();          //  int[] ar = new int[n];            List<Integer> set=new ArrayList<>();             for (int j = 0; j < n; j++) {               // ar[j] = sc.nextInt();                set.add(sc.nextInt());            }         //  Arrays.sort(ar);            //List<Integer> list = new ArrayList<>(set);            Collections.sort(set);             //int  y1 = ar[n-1];            int y2 =set.get(set.size()-2);          //  int k1= Math.min(y1-1,y2-1);            int k = Math.min(n-2,y2-1);            /*for (int j = n-1; j >=1 ; j--) {                int y1 = ar[j];                int y2 = ar[j - 1];                k = Math.min(y1-1,y2-1);                if((n-2)>=k){                    System.out.println(k);                    continue process;                }            }*/            System.out.println(k);          }      }     static int countSetBits(int n) {        int count = 0;        while (n > 0) {            count += n & 1;            n >>= 1;        }        return count;    }     public List<Integer> getDivisors(int n) {        List<Integer> list = new ArrayList<>();        for (int d = 2; d * d <= n; d++) {            while (n % d == 0) {                list.add(d);                n /= d;            }        }        if (n > 1) {            list.add(n);        }        return list;    }     public int lcm(int n1, int n2) {        int gcd = 1;        for (int i = 1; i <= n1 && i <= n2; ++i) {            // Checks if i is factor of both integers            if (n1 % i == 0 && n2 % i == 0)                gcd = i;        }         int lcm = (n1 * n2) / gcd;        return lcm;    }     public boolean[] primes(int n) {        boolean[] p = new boolean[n + 1];        p[0] = false;        p[1] = false;        for (int i = 2; i <= n; i++) {            p[i] = true;        }         for (int i = 2; i * i <= n; i++) {            for (int j = i * i; j <= n; j += i) {                p[j] = false;            }        }        return p;    }      public int primeFactor(int n) {        int c = 0;         while (n % 2 == 0) {            n /= 2;            c++;        }        //  System.out.println(n);        return c;     }}