import java.util.*; public class Check2 {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);       int t=sc.nextInt();       for(int i=0;i<t;i++){           int n=sc.nextInt();           List<Integer> evenindex=new ArrayList<>();           List<Integer> oddindex=new ArrayList<>();           for(int j=1;j<=2*n;j++){               int num=sc.nextInt();               if(num%2==0){                   evenindex.add(j);               }else {                   oddindex.add(j);               }           }           int l1=evenindex.size();           int l2=oddindex.size();           int u1=2;           int u2=2;           if(l1!=0&&l2!=0&&l1%2==0&&l2%2==0){               if (l1>=l2){                   u1=1;               }else {                   u2=1;               }           }            for(int j=0;j<evenindex.size()-u1;j++){               System.out.println(evenindex.get(j)+" "+evenindex.get(j+1));               j++;           }             for(int j=0;j<oddindex.size()-u2;j++){             //  System.out.println(j);               System.out.println(oddindex.get(j)+" "+oddindex.get(j+1));               j++;           }           //System.out.println();       }         }     public static int getAns(String a, String b, String[][] ans1, String[][] ans2, int l1, int l2, int[][] dp) {        if (a != null && a.equals(b)) {            return 0;        }        if (dp[l1][l2] != -1) {            return dp[l1][l2];        }        int a1 = Integer.MAX_VALUE, a2 = Integer.MAX_VALUE, a3 = Integer.MAX_VALUE, a4 = Integer.MAX_VALUE;        if (a != null && l1 >= 2 && ans1[1][l1] != null) {            a1 = getAns(ans1[1][l1], b, ans1, ans2, l1 - 1, l2, dp);        }        //int a1=getAns(a.substring(1),b);        if (a != null && l1 >= 1 && ans1[0][l1 - 1] != null) {            a2 = getAns(ans1[0][l1 - 1], b, ans1, ans2, l1 - 1, l2, dp);        }        //int a2=getAns(a.substring(0,a.length()-1),b);        if (b != null && l2 >= 2 && ans2[1][l2] != null) {            a3 = getAns(a, ans2[1][l2], ans1, ans2, l1, l2 - 1, dp);        }        // int a3=getAns(a,b.substring(1));        if (b != null && l2 >= 1 && ans2[0][l2 - 1] != null) {            a4 = getAns(a, ans2[0][l2 - 1], ans1, ans2, l1, l2 - 1, dp);        }        // int a4=getAns(a,b.substring(0,b.length()-1));        if (a1 != Integer.MAX_VALUE || a2 != Integer.MAX_VALUE || a3 != Integer.MAX_VALUE || a4 != Integer.MAX_VALUE) {            dp[l1][l2] = 1 + (Math.min(a1, Math.min(a2, Math.min(a3, a4))));        }        return dp[l1][l2];      }      public static long power(long a, long b, long c) {        long ans = 1;        while (b != 0) {            if (b % 2 == 1) {                ans = ans * a;                ans %= c;            }            a = a * a;            a %= c;            b /= 2;        }        return ans;    }     public static long power1(long a, long b, long c) {        long ans = 1;        while (b != 0) {            if (b % 2 == 1) {                ans = multiply(ans, a, c);            }            a = multiply(a, a, c);            b /= 2;         }        return ans;     }     public static long multiply(long a, long b, long c) {        long res = 0;        a %= c;        while (b > 0) {            if (b % 2 == 1) {                res = (res + a) % c;            }            a = (a + a) % c;            b /= 2;        }         return res % c;     }     public static long totient(long n) {        long result = n;        for (long i = 2; i * i <= n; i++) {            if (n % i == 0) {                //sum=sum+2*i;                while (n % i == 0) {                    n /= i;                    // sum=sum+n;                }                result -= result / i;             }        }        if (n > 1) {            result -= result / n;         }        return result;    }      public static long gcd(long a, long b) {        if (b == 0) {            return a;        } else {            return gcd(b, a % b);        }    }     public static boolean[] primes(int n) {        boolean[] p = new boolean[n + 1];        p[0] = false;        p[1] = false;        for (int i = 2; i <= n; i++) {            p[i] = true;        }         for (int i = 2; i * i <= n; i++) {            if (p[i]) {                for (int j = i * i; j <= n; j += i) {                    p[j] = false;                }            }         }        return p;    }     static int val(char c) {        if (c >= '0' && c <= '9')            return (int) c - '0';        else            return (int) c - 'A' + 10;    }     // Function to convert a// number from given base// 'b' to decimal    static int toDeci(String str,                      int base) {        int len = str.length();        int power = 1; // Initialize        // power of base        int num = 0; // Initialize result        int i;         // Decimal equivalent is        // str[len-1]*1 + str[len-2] *        // base + str[len-3]*(base^2) + ...        for (i = len - 1; i >= 0; i--) {            // A digit in input number            // must be less than            // number's base            if (val(str.charAt(i)) >= base) {                System.out.println("Invalid Number");                return -1;            }             num += val(str.charAt(i)) * power;            power = power * base;        }         return num;    }}							   		  					  	 	  					
