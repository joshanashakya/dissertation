import java.util.*; public class Check2 {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int t=sc.nextInt();        for(int i=0;i<t;i++){            int a1=sc.nextInt();            int b1=sc.nextInt();             int a2=sc.nextInt();            int b2=sc.nextInt();             boolean check=false;             if(a1==a2 ){                if(b1+b2==a1){                    check=true;                }            }            if(a1==b2 ){                if(b1+a2==a1){                    check=true;                }            }            if(b1==a2 ){                if(a1+b2==b1){                    check=true;                }            }            if(b1==b2 ){                if(a1+a2==b1){                    check=true;                }            }              /*process:for(int j=1;j<=2;j++){                for(int k=1;k<=2;k++){                    int y1=j==1?a1:b1;                    int y2=k==1?a2:b2;                     int y3=j==1?b1:a1;                    int y4=k==1?b2:a2;                    //System.out.println(y1+"  "+y2 +" "+y3+" "+y4);                    if(y1==y2 && (y3+y2)==y4){                         check=true;                        break process;                    }                 }            }*/            if(check){                System.out.println("YES");            }else {                System.out.println("NO");            }        }     }     public static boolean strive(String s) {        Stack<Character> stack = new Stack<>();        stack.push(s.charAt(0));        for (int i = 1; i < s.length(); i++) {            char ch1 = s.charAt(i);            if (ch1 == ')') {                if (!stack.isEmpty() && stack.peek() == '(') {                    stack.pop();                } else {                    return false;                }            } else {                stack.push('(');            }        }        /*if(stack.size()!=0){           // System.out.println("NO");        }else {            System.out.println("YES");        }*/        return stack.size() == 0;    }     public static int getAns(int[] ar, int bigger, int[][] dp, int i, int j) {         if (i < 0 || j < 0) {            return 0;        }          if (dp[i][j] != -1) {            return dp[i][j];        }        int ans1 = 0, ans2 = 0, ans3 = 0;         if (ar[i] < bigger) {            ans1 = 1 + getAns(ar, ar[i], dp, i - 1, j);            // ans3=1+getAns(ar, ar[i],dp, i - 1,j-1);        } else {            ans2 = getAns(ar, bigger, dp, i - 1, j - 1);        }         dp[i][j] = Math.max(ans1, ans2);        return dp[i][j];     }      public static long power(long a, long b, long c) {        long ans = 1;        while (b != 0) {            if (b % 2 == 1) {                ans = ans * a;                ans %= c;            }            a = a * a;            a %= c;            b /= 2;        }        return ans;    }     public static long power1(long a, long b, long c) {        long ans = 1;        while (b != 0) {            if (b % 2 == 1) {                ans = multiply(ans, a, c);            }            a = multiply(a, a, c);            b /= 2;         }        return ans;     }     public static long multiply(long a, long b, long c) {        long res = 0;        a %= c;        while (b > 0) {            if (b % 2 == 1) {                res = (res + a) % c;            }            a = (a + a) % c;            b /= 2;        }         return res % c;     }     public static long totient(long n) {        long result = n;        for (long i = 2; i * i <= n; i++) {            if (n % i == 0) {                //sum=sum+2*i;                while (n % i == 0) {                    n /= i;                    // sum=sum+n;                }                result -= result / i;             }        }        if (n > 1) {            result -= result / n;         }        return result;    }      public static long gcd(long a, long b) {        if (b == 0) {            return a;        } else {            return gcd(b, a % b);        }    }     public static boolean[] primes(int n) {        boolean[] p = new boolean[n + 1];        p[0] = false;        p[1] = false;        for (int i = 2; i <= n; i++) {            p[i] = true;        }         for (int i = 2; i * i <= n; i++) {            if (p[i]) {                for (int j = i * i; j <= n; j += i) {                    p[j] = false;                }            }         }        return p;    }     static int val(char c) {        if (c >= '0' && c <= '9')            return (int) c - '0';        else            return (int) c - 'A' + 10;    }     // Function to convert a// number from given base// 'b' to decimal    static int toDeci(String str,                      int base) {        int len = str.length();        int power = 1; // Initialize        // power of base        int num = 0; // Initialize result        int i;         // Decimal equivalent is        // str[len-1]*1 + str[len-2] *        // base + str[len-3]*(base^2) + ...        for (i = len - 1; i >= 0; i--) {            // A digit in input number            // must be less than            // number's base            if (val(str.charAt(i)) >= base) {                System.out.println("Invalid Number");                return -1;            }             num += val(str.charAt(i)) * power;            power = power * base;        }         return num;    }}			     	  	 	     			 		 	
