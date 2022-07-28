import java.util.*; public class StackBracket {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);                    int n = sc.nextInt();           long sum=n;           for(int j=1;j<=(n-1);j++){               sum=sum+j*(n-j);           }            System.out.println(sum);               }      public static int getAns(String s, int k, int start1, int end1) {        //System.out.println(start1+" "+end1);        if (start1 < end1 && end1 <= s.length() && start1 >= 0) {            s = s.substring(start1, end1);            int start = s.indexOf("*");            int end = s.lastIndexOf("*");            if (start != end) {                return 2 + Math.min(getAns(s, k, start + 1, start + 1 + k), (getAns(s, k, end - k, end)));            } else {                if (start != -1)                    //return 1+Math.min(getAns(s,k,start+k,end),Math.min(getAns(s,k,start+1,end-k+1),getAns(s,k,start+k,end-k+1)));                    return 1 + Math.min(getAns(s, k, start + 1, start + 1 + k), (getAns(s, k, end - k, end)));                 else                    return 0;             }        } else {            if (start1 >= 0 && end1 <= s.length() && start1 == end1 && s.charAt(start1) == '*') {                return 1;            }            return 0;        }      }      public static long power(long a, long b, long c) {        long ans = 1;        while (b != 0) {            if (b % 2 == 1) {                ans = ans * a;                ans %= c;            }            a = a * a;            a %= c;            b /= 2;        }        return ans;    }     public static long power1(long a, long b, long c) {        long ans = 1;        while (b != 0) {            if (b % 2 == 1) {                ans = multiply(ans, a, c);            }            a = multiply(a, a, c);            b /= 2;         }        return ans;     }     public static long multiply(long a, long b, long c) {        long res = 0;        a %= c;        while (b > 0) {            if (b % 2 == 1) {                res = (res + a) % c;            }            a = (a + a) % c;            b /= 2;        }         return res % c;     }     public static long totient(long n) {        long result = n;        for (long i = 2; i * i <= n; i++) {            if (n % i == 0) {                //sum=sum+2*i;                while (n % i == 0) {                    n /= i;                    // sum=sum+n;                }                result -= result / i;             }        }        if (n > 1) {            result -= result / n;         }        return result;    }      public static long gcd(long a, long b) {        if (b == 0) {            return a;        } else {            return gcd(b, a % b);        }    }     public static boolean[] primes(int n) {        boolean[] p = new boolean[n + 1];        p[0] = false;        p[1] = false;        for (int i = 2; i <= n; i++) {            p[i] = true;        }         for (int i = 2; i * i <= n; i++) {            if (p[i]) {                for (int j = i * i; j <= n; j += i) {                    p[j] = false;                }            }         }        return p;    }     static int val(char c) {        if (c >= '0' && c <= '9')            return (int) c - '0';        else            return (int) c - 'A' + 10;    }     // Function to convert a// number from given base// 'b' to decimal    static int toDeci(String str,                      int base) {        int len = str.length();        int power = 1; // Initialize        // power of base        int num = 0; // Initialize result        int i;         // Decimal equivalent is        // str[len-1]*1 + str[len-2] *        // base + str[len-3]*(base^2) + ...        for (i = len - 1; i >= 0; i--) {            // A digit in input number            // must be less than            // number's base            if (val(str.charAt(i)) >= base) {                System.out.println("Invalid Number");                return -1;            }             num += val(str.charAt(i)) * power;            power = power * base;        }         return num;    }}
