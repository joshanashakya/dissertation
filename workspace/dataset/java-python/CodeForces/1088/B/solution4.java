import java.util.*; public class Check2 {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        int k = sc.nextInt();        boolean flag=false;        int[] ar = new int[n];        for (int i = 0; i < n; i++) {            ar[i] = sc.nextInt();         }        Arrays.sort(ar);        long[] ar1 = new long[n];        ar1[0]=ar[0];        long sum=ar[0];        for(int i=1;i<n;i++){             ar1[i]=ar[i]-sum;            sum+=ar1[i];        }       /* System.out.println(Arrays.toString(ar));          System.out.println(Arrays.toString(ar1));*/        List<Long> list = new ArrayList<>();         if (k <= n) {            //list.add(ar[0]);            for (int i = 0; i < n ; i++) {                if (ar1[i] != 0) {                    list.add(ar1[i]);                     /*   ar[i + 1] = ar[i + 1] - ar[i];                        ar[i] = 0;*/                }                if (list.size()==k){                    break;                }             }            //list.add(ar[k - 1]);            int diff=k-list.size();            for(int i=1;i<=diff;i++){                list.add(0L);            }         }else {            for (int i = 0; i < n ; i++) {                if (ar1[i] != 0) {                    list.add(ar1[i]);                       /* ar[i + 1] = ar[i + 1] - ar[i];                        ar[i] = 0;*/                }             }               /* if(ar[n-1]!=0)                list.add(ar[n - 1]);*/            int diff=k-list.size();            for(int i=1;i<=diff;i++){                list.add(0L);            }        }          for(Long integer:list){            System.out.println(integer);        }          }       public static long power(long a, long b, long c) {        long ans = 1;        while (b != 0) {            if (b % 2 == 1) {                ans = ans * a;                ans %= c;            }            a = a * a;            a %= c;            b /= 2;        }        return ans;    }     public static long power1(long a, long b, long c) {        long ans = 1;        while (b != 0) {            if (b % 2 == 1) {                ans = multiply(ans, a, c);            }            a = multiply(a, a, c);            b /= 2;         }        return ans;     }     public static long multiply(long a, long b, long c) {        long res = 0;        a %= c;        while (b > 0) {            if (b % 2 == 1) {                res = (res + a) % c;            }            a = (a + a) % c;            b /= 2;        }         return res % c;     }     public static long totient(long n) {        long result = n;        for (long i = 2; i * i <= n; i++) {            if (n % i == 0) {                //sum=sum+2*i;                while (n % i == 0) {                    n /= i;                    // sum=sum+n;                }                result -= result / i;             }        }        if (n > 1) {            result -= result / n;         }        return result;    }      public static long gcd(long a, long b) {        if (b == 0) {            return a;        } else {            return gcd(b, a % b);        }    }     public static boolean[] primes(int n) {        boolean[] p = new boolean[n + 1];        p[0] = false;        p[1] = false;        for (int i = 2; i <= n; i++) {            p[i] = true;        }         for (int i = 2; i * i <= n; i++) {            if (p[i]) {                for (int j = i * i; j <= n; j += i) {                    p[j] = false;                }            }         }        return p;    }     static int val(char c) {        if (c >= '0' && c <= '9')            return (int) c - '0';        else            return (int) c - 'A' + 10;    }     // Function to convert a// number from given base// 'b' to decimal    static int toDeci(String str,                      int base) {        int len = str.length();        int power = 1; // Initialize        // power of base        int num = 0; // Initialize result        int i;         // Decimal equivalent is        // str[len-1]*1 + str[len-2] *        // base + str[len-3]*(base^2) + ...        for (i = len - 1; i >= 0; i--) {            // A digit in input number            // must be less than            // number's base            if (val(str.charAt(i)) >= base) {                System.out.println("Invalid Number");                return -1;            }             num += val(str.charAt(i)) * power;            power = power * base;        }         return num;    }}
