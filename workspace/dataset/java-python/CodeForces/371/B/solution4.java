import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.*; public class Codeforces {     private static final Scanner sc = new Scanner(System.in);    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    private static final long MOD = (long) (1e9 + 7);     public static int[] LPS(String p){        int[] lps = new int[p.length()];         int i=1;        int j=0;        while (i < p.length()){            if (p.charAt(i) == p.charAt(j)){                lps[i] = j+1;                i++;                j++;            }            else{                if (j == 0){                    lps[i] = 0;                    i++;                }                else{                    j = lps[j-1];                }            }        }        return lps;    }     public static void KMP(String text,String pattern){        int[] lps = LPS(pattern);        int i = 0;        int j = 0;        ArrayList<Integer> matches = new ArrayList<>();        while (i < text.length()){            if (text.charAt(i) == pattern.charAt(j)){                i++;                j++;            }            else{                if (j != 0){                    j = lps[j-1];                }                else {                    i++;                }            }            if (j == pattern.length()) {                matches.add(i - j);                j = lps[j-1];            }        }        for (int x : matches){            System.out.println("Match at : " + x);        }    }     private static class SegmentTree{        private long[] st;        private int size;        private int n;        private long[] a;        SegmentTree(long[] a,int n){            this.size = 4*n;            this.n = n;            this.a = a;            st = new long[size];            //Arrays.fill(st,Integer.MIN_VALUE);            buildSegmentTree(0,0,n-1);            //printSegmentTree();        }        public long buildSegmentTree(int index,int l,int r){            if (l == r){                st[index] = a[l];                return a[l];            }            int mid = (r+l) >> 1;            return st[index] = buildSegmentTree(2*index+1,l,mid) + buildSegmentTree(2*index+2,mid+1,r);        }        public void printSegmentTree(){            for (long x : st){                System.out.print(x + " ");            }            System.out.println();        }        public long query(int ql,int qr){            return getQuery(0,0,n-1,ql-1,qr-1);        }        private long getQuery(int index,int sl,int sr,int ql,int qr){            //System.out.println("#" + index);            if (qr < sl || ql > sr)                return 0;            if (ql <= sl && qr >= sr)                return st[index];            int mid = (sr + sl) >> 1;            return getQuery(2*index+1,sl,mid,ql,qr) + getQuery(2*index+2,mid+1,sr,ql,qr);        }        public void update(int i,long newVal){            //long diff = newVal - a[i];            a[i] = newVal;            updateSegmentTree(0,i,0,n-1,newVal);        }        private void updateSegmentTree(int index,int i,int sl,int sr,long diff){            if (sl == sr){                st[index] = diff;                return;            }            int mid = (sl + sr) >> 1;            if (i <= mid)                updateSegmentTree(2*index+1,i,sl,mid,diff);            else                updateSegmentTree(2*index+2,i,mid+1,sr,diff);            st[index] = st[2*index+1] + st[2*index+2];        }    }     public static class Pair<T1,T2>{        T1 first;        T2 second;        Pair(T1 a,T2 b){            this.first = a;            this.second = b;        }         @Override        public String toString() {            return "[" + first + ", " + second + "]";        }    }     public static long GCD(long a,long b){        if (b == 0)            return a;        return GCD(b,a%b);    }     static int highestPowerOf2(int n) {        int p = (int)(Math.log(n) /                Math.log(2));        return (int)Math.pow(2, p);    }     public static int binSearch(long[] a,long x){        int l = 0;        int r = a.length - 1;        while (l <= r){            int mid = l + (r-l)/2;            if (a[mid]==x)                return 1;            else if (a[mid] < x)                l = mid+1;            else                r = mid-1;        }        return -1;    }     public static int upperBound(long[] arr,long key){        int start=0;int end=arr.length-1;        int idx=-1;        int mid;        while(start<=end){            int i=(start+end)/2;            if(arr[i]<key){                start=i+1;            }            else if(arr[i]>key){                end=i-1;            }            else{                idx=i;                start=i+1;            }        }         return idx;    }     public static int lowerBound(long[] arr,long key){        int start=0;int end=arr.length-1;        int idx=-1;        int mid;        while(start<=end){            int i=(start+end)/2;            if(arr[i]<key){                start=i+1;            }            else if(arr[i]>key){                end=i-1;            }            else{                idx=i;                end=i-1;            }        }        return idx;    }     public static int searchInsert(long[] nums, long target) {        int s=0,e=nums.length-1;        int mid;        if(target<nums[0]){            return 0;        }        while(s<=e){            mid=(s+e)/2;            if(nums[mid]>target){                e=mid-1;            }            else if(nums[mid]==target){                return mid;            }            else{                s=mid+1;            }        }        return s;    }     static boolean isPrime(long n) {        if (n <= 1)            return false;        if (n <= 3)            return true;         if (n % 2 == 0 || n % 3 == 0)            return false;         for (long i = 5; i <= Math.sqrt(n); i = i + 6)            if (n % i == 0 || n % (i + 2) == 0)                return false;         return true;    }     public static long fastExpo(long a,int n,int mod){        if (n == 0)            return 1;        else{            if ((n&1) == 1){                long x = fastExpo(a,n/2,mod);                return (((a*x)%mod)*x)%mod;            }            else{                long x = fastExpo(a,n/2,mod);                return (((x%mod)*(x%mod))%mod)%mod;            }        }    }     public static long modInverse(long n,int p){        return fastExpo(n,p-2,p);    }     public static long nCr(int n,int r,long[] fact,int mod){        long val =  (((fact[n] * modInverse(fact[r],mod))%mod)*modInverse(fact[n-r],mod))%mod;        return val;    }     public static void factorial(long[] fact,int n,int mod){        for (int i=1;i<=n;i++){            fact[i] = (fact[i-1] * i)%mod;        }    }     public static int log2(long val){        return (int) Math.floor(Math.log(val)/Math.log(2));    }     public static boolean isSubSequence(String s,String t){        int i = 0;        int j = 0;        while (i < s.length() && j < t.length()){            if (s.charAt(i) == t.charAt(j))                j++;            i++;        }        return j == t.length();    }     public static long[] getValues(long x){        long a2 = 0;        long a3 = 0;        long a5 = 0;        while (x%2 == 0){            a2++;            x /= 2;        }        while (x%3 == 0){            a3++;            x /= 3;        }        while (x%5 == 0){            a5++;            x /= 5;        }        long[] ans = new long[]{x,a2,a3,a5};        return ans;    }    public static void solve() throws IOException {        long a = sc.nextLong();        long b = sc.nextLong();        long[] a1 = getValues(a);        long[] b2 = getValues(b);         if (a1[0] != b2[0]){            System.out.println(-1);            return;        }        long ans = Math.abs(a1[1] - b2[1]) + Math.abs(a1[2] - b2[2]) + Math.abs(a1[3] - b2[3]);        System.out.println(ans);    }    public static void main(String[] args) throws IOException {        int t;//        t = sc.nextInt();        t = 1;        while (t-- > 0){            solve();        }        System.gc();    }} 
