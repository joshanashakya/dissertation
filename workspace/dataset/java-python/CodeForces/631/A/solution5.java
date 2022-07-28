import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.*;import java.util.Scanner;public class Main {    private static final FastReader scanner = new FastReader();    public static void main(String[] args) {        int n = scanner.nextInt();        int[] a = new int[n];        int[] b = new int[n];        readArray(a);        readArray(b);        int sum = 0;        for(int l = 0;l<n;l++){            for(int r = l;r<n;r++){                sum = Math.max(sum,maxOr(a,b,l,r));            }        }        System.out.println(sum);    }    static int maxOr(int[] a,int[] b ,int l,int r){        int sum = 0;        for(int i = l;i<=r;i++){            sum|=a[i];        }        int sum2 = 0;        for(int i = l;i<=r;i++){            sum2|=b[i];        }        return sum+sum2;    }    private static String Sort(String s){        char[] c  = s.toCharArray();        Arrays.sort(c);        return new String(c);    }    private static long div(long x,long y){        return (x+y-1)/y;    }    private static void swap(int[] array , int a ,int b){        if (a==b){            return;        }        int temp = array[a];        array[a] =array[b];        array[b] =temp;    }    private static String revString(String str){        StringBuilder sb = new StringBuilder(str);        sb.reverse();        return sb.toString();    }    private static int fibo(int n){        int[] dp = new int[n];        for(int i= 0 ;i<n;i++){            if(i<2){                dp[i] = 1;            }else{                dp[i] =dp[i-1]+dp[i-2];            }        }        return dp[dp.length-1];    }    private static void swap(char[] array , int a,int b){        if(a==b){            return;        }        char temp = array[a];        array[a] = array[b];        array[b] = temp;    }    private static Scanner slowscanner = new Scanner(System.in);    private static int max(int[] array ){        int min = Integer.MIN_VALUE;        for(int i = 0;i< array.length;i++){            if(array[i]>min){                min = array[i];            }        }        return min;    }    private static int min(int[] array ){        int min = Integer.MAX_VALUE;        for(int i = 0;i< array.length;i++){            if(array[i]<min){                min = array[i];            }        }        return min;    }    private static void readArray(int[] array){        for(int i = 0;i< array.length;i++){            array[i] = scanner.nextInt();        }    }    private static int gcd(int a , int b){        if(b==0) return  a;        else return gcd(b,a%b);    }    private static long fact(int n){        if(n==1 || n==0) return 1;        else return (long) n*fact(n-1);    }    private static int Arraysum(int[] array){        int sum = 0;        for(int i = 0 ;i< array.length;i++){            sum+=array[i];        }        return sum;    }    private static boolean isPrime(long n){        if(n==1){            return false;        }        for(long i = 2;i<=Math.sqrt(n);i++){            if(n%i==0){                return false;            }        }        return true;    }    private static int multiply(int[] array){        int mult = 1 ;        for(int i = 0 ;i< array.length;i++) {            mult *= array[i];        }        return mult;    }    private static int FromStringtoInt(String s){        s = s.replaceAll("[^0-9]","");        return Integer.parseInt(s);    }    static class BIT{        static int[] BitTree = new int[1000];        int sum(int index){            int s =0;//            index+=1;            while (index>0){                s+=BitTree[index];                index-=(index&-index);            }            return s;        }        public static void updateBIT(int n, int index, int val) {            index = index + 1;            while(index <= n) {                BitTree[index] += val;                index += index & (-index);            }        }        void constructBITree(int arr[], int n) {            for(int i=1; i<=n; i++)                BitTree[i] = 0;            for(int i = 0; i < n; i++)                updateBIT(n, i, arr[i]);        }    }    static class FastReader {        BufferedReader br;        StringTokenizer st;         public FastReader()        {            br = new BufferedReader(new                    InputStreamReader(System.in));        }         String next()        {            while (st == null || !st.hasMoreElements())            {                try                {                    st = new StringTokenizer(br.readLine());                }                catch (IOException  e)                {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt()        {            return Integer.parseInt(next());        }         long nextLong()        {            return Long.parseLong(next());        }         double nextDouble()        {            return Double.parseDouble(next());        }         String nextLine()        {            String str = "";            try            {                str = br.readLine();            }            catch (IOException e)            {                e.printStackTrace();            }            return str;        }    }    private static int[] threeNumberSort(int[] array,int[] order){        int f  = order[0];        int s  = order[1];        int t  = order[2];        //        int first = 0;        int second = 0;        int third = array.length-1;        while(second<=third){            int value = array[second];            if(value == f){                swap(array,first,second);                first++;                second++;            }else if(value==t){                swap(array,second,third);                third--;                // no action on second value            }else if(value==s){                second++;            }        }        return array;    }}
