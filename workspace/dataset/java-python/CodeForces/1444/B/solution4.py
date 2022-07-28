import java.util. *; public


class Main {     private static final Scanner sc = new Scanner(System.in );    private static final long mod = 998244353;     public static void main(String[] args) {int n = sc.nextInt();        long[] a = new long[2 * n];        long ans = 0;        long fn = pow(fact(n), mod - 2);        long count = fact(2 * n);  for (int i = 0; i < 2 * n; i++){a[i] = sc.nextLong();}         Arrays.sort(a);  for (int i = 0; i < n; i++){ans = mod(ans + a[2 * n - i - 1] - a[i]);}         ans = mod(count * ans);        ans = mod(ans * fn);        ans = mod(ans * fn);         System.out.println(ans);}     private static long fact(long num){long ans = 1;  for (long i = 2; i <= num; i++){ans = mod(ans * i);} 


return ans;}     private
static
long
mod(long
num){
return (num % mod + mod) % mod;}     private
static
long
pow(long
a, long
n) { if (n == 0)
return 1;         long
ans = pow(a, n / 2);
ans *= ans;
ans %= mod;         if (n % 2 == 1) {ans *= a;            ans %= mod;}  return ans;}}
