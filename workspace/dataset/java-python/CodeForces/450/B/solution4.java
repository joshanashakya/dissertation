 import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.StringTokenizer; public class JzzhuAndSequences { 	public static void main(String[] args){    	FastReader();		int t = 1;		while(t>0)		{						solve();						--t;		}		write.flush();		write.close();	}	    static void solve()	{    	int x=ni(),y=ni();    	int n=ni();    	int k=0;    	    	    	if((n)%3==0)    	{    		k=y-x;    		if(n%2==0)    		{    			k=-k;    		}    	}    	else if((n+1)%3==0)    	{    		k=y;    		if((n+1)%2==0)    		{    			k=-k;    		}    	}    	else if((n+2)%3==0)    	{    		k=x;    		if((n+2)%2==0)    		{    			k=-k;    		}    	}    	if(k>=0)    	{    		out(k%MOD);    	}    	else    	{    		if(k==-MOD)    		{    			out("0");    		}    		else    		{    			k=k%MOD;    			out(k+MOD);    		}    	}	}        //NECESSARY FUNCTIONS        												//CONSTANTS//    static final int MOD = (int) 1e9 + 7;												//INPUT//    	static BufferedReader br;     static StringTokenizer st;        public static void FastReader()     {         br = new BufferedReader(new                 InputStreamReader(System.in));     }         //STRING INPUT    static String nx()               {         while (st == null || !st.hasMoreElements())         {             try            {                 st = new StringTokenizer(br.readLine());             }             catch (IOException  e)             {                 e.printStackTrace();             }         }         return st.nextToken();     }         //STRING(WITH SPACES) INPUT    static String nln()    		    {         String str = "";         try        {             str = br.readLine();         }         catch (IOException e)         {             e.printStackTrace();         }         return str;     }         //INTEGER INPUT    static int ni()                 {         return Integer.parseInt(nx());     }         //LONG INPUT    static long nl() 			    {         return Long.parseLong(nx());     }         //DOUBLE INPUT    static double nd()			     {         return Double.parseDouble(nx());     }      //ARRAY INPUT    static int[] ina(int n) 	    {		int[] temp = new int[n];				for (int i = 0; i < n; i++) 		{			temp[i] = ni();		}				return temp;	}        //LONG ARRAY INPUT    static long[] inal(int n) 	    {		long[] temp = new long[n];				for (int i = 0; i < n; i++) 		{			temp[i] = ni();		}				return temp;	}        										//OUTPUT//        static PrintWriter write= new PrintWriter(System.out);        //OUTPUT NEXTLINE    static void out()	    {         write.println();    }        //ARRAY OUTPUT WITH NEXTLINE    static void out(int[] ar) 	    {         for(int e: ar)        {        	write.print(e+" ");        }        write.println();    }         //LONG ARRAY OUTPUT WITH NEXTLINE    static void out(long[] ar) 	    {         for(long e: ar)        {        	write.print(e+" ");        }        write.println();    }        //OBJECT OUTPUT WITH NEXTLINE    static void out(Object obj)	    {         write.println(obj);    }        //ARRAY OUTPUT WITHOUT NEXTLINE    static void ou(int[] ar)	    {         for(int e: ar)        {        	write.print(e+" ");        }    }        //LONG ARRAY OUTPUT WITH NEXTLINE    static void ou(long[] ar) 	    {         for(long e: ar)        {        	write.print(e+" ");        }    }        //OBJECT INPUT WITHOUT NEXTLINE    static void ou(Object obj)	    {         write.print(obj);    }        										//SEARCHING ALGORITHMS//        //BINARY SEARCH    static int bs(int arr[], int x)     {         int l = 0, r = arr.length - 1;         while (l <= r) {             int m = l + (r - l) / 2;             if (arr[m] == x)                 return m;             if (arr[m] < x)                 l = m + 1;             else                r = m - 1;         }         return -1;     }        static int bs(long arr[], int x)     {         int l = 0, r = arr.length - 1;         while (l <= r) {             int m = l + (r - l) / 2;              if (arr[m] == x)                 return m;             if (arr[m] < x)                 l = m + 1;             else                r = m - 1;         }         return -1;     }        										//SORTING ALGORITHMS//        //MERGE SORT    static void sort(int arr[], int l, int m, int r)    {        int n1 = m - l + 1;        int n2 = r - m;        int L[] = new int[n1];        int R[] = new int[n2];        for (int i = 0; i < n1; ++i)            L[i] = arr[l + i];        for (int j = 0; j < n2; ++j)            R[j] = arr[m + 1 + j];        int i = 0, j = 0;        int k = l;        while (i < n1 && j < n2) {            if (L[i] <= R[j]) {                arr[k] = L[i];                i++;            }            else {                arr[k] = R[j];                j++;            }            k++;        }        while (i < n1) {            arr[k] = L[i];            i++;            k++;        }        while (j < n2) {            arr[k] = R[j];            j++;            k++;        }    }     static void merge(int arr[], int l, int r)    {        if (l < r) {            int m =l+ (r-l)/2;            merge(arr, l, m);            merge(arr, m + 1, r);            sort(arr, l, m, r);        }    }        //BUBBLE SORT    static void bubble(int arr[])     {         int n = arr.length;         for (int i = 0; i < n-1; i++)        {            for (int j = 0; j < n-i-1; j++)            {                if (arr[j] > arr[j+1])                 {                    int temp = arr[j];                     arr[j] = arr[j+1];                     arr[j+1] = temp;                 }             }        }    }        										//OTHER FUNCTIONS//        //FUNCTION TO COUNT NO. OF DIGITS    static int countDigit(long n)    {        int count = 0;        while (n != 0) {            n = n / 10;            ++count;        }        return count;    }        //FUNCTION TO CALCULATE SUM OF DIGITS    static int sumOfDigits(int n)     {             int sum = 0;           while (n != 0)         {             sum = sum + n % 10;             n = n/10;         }         return sum;     }        //FUNCTION TO FIND SUM OF ARRAY ELEMENTS    static long arraySum(int[] arr , int start , int end)    {        long sum = 0 ;        for(int i = start ; i <= end  ; ++i)        {        	sum = sum + arr[i] ;        }        return sum  ;    }        //FUNCTION TO CALCULATE FACTORIAL    static int fact(int n)     {         if (n == 0)           return 1;         return n*fact(n-1);     }        //FUNCTION TO CHECK POWER OF TWO    static boolean isPowerOfTwo(int n)    {        if(n==0)        return false;        return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==            (int)(Math.floor(((Math.log(n) / Math.log(2)))));    }        //FUNCTION TO REVERSE A STRING    static String reverse(String str)    {    	StringBuilder input = new StringBuilder();        input.append(str);        input.reverse();        return input.toString();    }        //FUNCTION TO CALCULATE GCD    public static int gcd(int a, int b)    {        if (a == 0)            return b;        return gcd(b%a, a);    }        public static long gcd(long a, long b)    {        if (a == 0)            return b;        return gcd(b%a, a);    }        //FUNCTION TO CALCULATE LCM    static int lcm(int a, int b)     {         return (a / gcd(a, b)) * b;     }        static long lcm(long a, long b)     {         return (a / gcd(a, b)) * b;     }        //FUNCTION TO CHECK PRIME OR NOT    static boolean isPrime(int n)     {         if (n <= 1)             return false;         if (n <= 3)             return true;         if (n % 2 == 0 || n % 3 == 0)             return false;         for (int i = 5; i * i <= n; i = i + 6)             if (n % i == 0 || n % (i + 2) == 0)                 return false;         return true;     }        //FUNCTION TO CALCULATE NCR        static long nCr(int n, int r)     {         return fact(n) / (fact(r) *                       fact(n - r));     }    		}
