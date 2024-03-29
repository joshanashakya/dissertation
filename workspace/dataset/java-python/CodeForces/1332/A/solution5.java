import java.awt.*;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.*;public class Main{    static int countSubstrings(String s) {        int n=s.length();        int dp[][]= new int[1001][1001];        for(int i=0;i<n;i++){            dp[i][i]=1;        }        for(int i=0;i<n-1;i++){            if(s.charAt(i)==s.charAt(i+1)){                dp[i][i+1]=1;            }        }        for(int d=2;d<n;d++){            int i=0,j=d;            while(j<n){                if(s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]==1){                    dp[i][j]=1;                }                else dp[i][j]=0;                i++;                j++;            }        }        int count=0;        for(int i=0;i<1001;i++){            for(int j=0;j<1001;j++){                if(dp[i][j]==1)count++;            }        }        return count;    }     public static void main(String[] args) {        FastScanner sc = new FastScanner();//        Scanner sc= new Scanner(System.in);        PrintWriter out = new PrintWriter(System.out);        int t=sc.nextInt();        outer:while (t-->=1) {         int l=sc.nextInt(),r=sc.nextInt(),d=sc.nextInt(),u=sc.nextInt();         int x=sc.nextInt(),y=sc.nextInt();         int xl=sc.nextInt(),yd=sc.nextInt(),xr=sc.nextInt(),yu=sc.nextInt();         boolean flag=true;         if (r-l>xr-x||l-r>x-xl)flag=false;         if (u-d>yu-y||d-u>y-yd)flag=false;         if (xl==xr&&(l+r)>0)flag=false;         if (yd==yu&&(d+u)>0)flag=false;         if (flag){             System.out.println("yes");         }         else System.out.println("no");          }        out.flush();     }    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------     static void sort(int[] a) {        ArrayList<Integer> l=new ArrayList<>();        for (int i:a) l.add(i);        Collections.sort(l);        for (int i=0; i<a.length; i++) a[i]=l.get(i);    }    static String sortString(String s){        char temp[]=s.toCharArray();        Arrays.sort(temp);        return new String(temp);    }     static class Pair implements Comparable<Pair> {        int num, val;         public Pair(int a, int b) {            num = a;            val = b;        }         public int compareTo(Pair x) {            return x.val-val;        }    }    static int mod=(int)1e9+7;    static long mod(long x){        return ((x%mod+mod)%mod);    }    static long add(long x,long y){        return mod(mod(x)+mod(y));    }    static long mul(long x,long y){        return mod(mod(x)*mod(y));    }    static int[] find(int n,int start,int diff){        int a[]= new int[n];        a[0]=start;        for (int i=1;i<n;i++)a[i]=a[i-1]+diff;        return a;    }    static void swap(int a,int b){        int c=a;        a=b;        b=c;    }     static void printArray(int a[]){        for (int i=0;i<a.length;i++){            System.out.print(a[i]+" ");        }    }    static boolean sorted(int a[]){        int n=a.length;        boolean flag=true;        for (int i=0;i<n-1;i++){            if (a[i]>a[i+1])flag=false;        }        if (flag)return true;        else  return false;    }    public static int findlog(long n){        if(n == 0)            return 0;         if(n == 1)            return 0;        if(n == 2)            return 1;        double num = Math.log(n);        double den = Math.log(2);        if(den == 0)            return 0;        return (int)(num/den);    }    public static long gcd(long a,long b){        if(b%a == 0)            return a;        return gcd(b%a,a);    }    public static int gcdInt(int a,int b){         if(b%a == 0)            return a;         return gcdInt(b%a,a);     }     static void sortReverse(long[] a) {        ArrayList<Long> l=new ArrayList<>();        for (long i:a) l.add(i);//        Collections.sort.(l);        Collections.sort(l,Collections.reverseOrder());        for (int i=0; i<a.length; i++) a[i]=l.get(i);    }     static class FastScanner {        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st=new StringTokenizer("");        String next() {            while (!st.hasMoreTokens())                try {                    st=new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }        int[] readArray(int n) {            int[] a=new int[n];            for (int i=0; i<n; i++) a[i]=nextInt();            return a;        }        long[] readArrayLong(long n) {            long[] a=new long[(int)n];            for (int i=0; i<n; i++) a[i]=nextLong();            return a;        }        long nextLong() {            return Long.parseLong(next());        }    }  }
