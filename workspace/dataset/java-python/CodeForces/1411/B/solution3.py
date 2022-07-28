import java.util. *;public


class sol {static Scanner scr=new Scanner(System.in );        public static void main(String[] args) {// TODO Auto-generated method stub        int t=scr.nextInt();


while (t -
->0) {solve();}}    static void solve() {long n=scr.nextLong(); while (!isValid(n)) {n++;}        System.out.println(n);}    static boolean isValid(long n) {long x=n; while (x > 0) {long mod=x % 10; // System.out.print(mod+" "); if (mod != 0 & & n % mod != 0) {
return false;}            x /= 10;}        return true;}}
