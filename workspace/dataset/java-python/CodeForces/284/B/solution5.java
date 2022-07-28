import java.io.*;import java.math.BigDecimal;import java.math.BigInteger;import java.util.*;import java.util.Comparator; public class scratch_25 {    static class Reader {        static BufferedReader reader;        static StringTokenizer tokenizer;         /** call this method to initialize reader for InputStream */        static void init(InputStream input) {            reader = new BufferedReader(                    new InputStreamReader(input) );            tokenizer = new StringTokenizer("");        }         /** get next word */        static String next() throws IOException {            while ( ! tokenizer.hasMoreTokens() ) {                //TODO add check for eof if necessary                tokenizer = new StringTokenizer(                        reader.readLine() );            }            return tokenizer.nextToken();        }         static int nextInt() throws IOException {            return Integer.parseInt( next() );        }         static double nextDouble() throws IOException {            return Double.parseDouble( next() );        }        static long nextLong() throws IOException{            return Long.parseLong(next());        }    }    static class pair    {        long first, second;        public pair(long first, long second)        {            this.first = first;            this.second = second;        }    }    // To find the power of a prime p in// factorial N    static long findPowerOfP(long n, long p)    {        long count = 0;        long r = p;        while (n>0)        {            n/=r;             // calculating Math.floor(n/r)            // and adding to the count            count += n ;             // increasing the power of p            // from 1 to 2 to 3 and so on         }        return count;    }     // returns all the prime factors of k     // Returns largest power of k that// divides n!    static long largestPowerOfK(long n, long k)    {        Vector<pair > vec = new Vector<pair>();        vec = primeFactorsofK(k);        long ans = Long.MAX_VALUE;        for (int i = 0; i < vec.size(); i++){          //  System.out.println("bhosdike");             // calculating minimum power of all            // the prime factors of k            ans = Math.min(ans, findPowerOfP(n,                    vec.get(i).first) / vec.get(i).second);}         return ans;    }    public static Vector<pair> primeFactorsofK(long n)    {        Vector<pair> ans = new Vector<pair>();        // Print the number of 2s that divide n        long count=0;        while (n%2==0)        {            count++;           // System.out.print(2 + " ");            n /= 2;        }        if(count>0){        ans.add(new pair(2,count));}         // n must be odd at this point.  So we can        // skip one element (Note i = i +2)        for (int i = 3; i <= Math.sqrt(n); i+= 2)        {            long count1=0;            // While i divides n, print i and divide n            while (n%i == 0)            {                count1++;               // System.out.print(i + " ");                n /= i;            }            if(count1>0){            ans.add(new pair(i,count1));}        }         // This condition is to handle the case whien        // n is a prime number greater than 2        if(n>2){            ans.add(new pair(n,1));        }//         return ans;    }    static int longSubarrWthSumDivByK(int arr[],                                      int n, int k)    {        // unodered map 'um' implemented as        // hash table        HashMap<Integer, Integer> um= new HashMap<Integer, Integer>();         // 'mod_arr[i]' stores (sum[0..i] % k)        int mod_arr[]= new int[n];        int max = 0;        int curr_sum = 0;         // traverse arr[] and build up the        // array 'mod_arr[]'        for (int i = 0; i < n; i++)        {            curr_sum += arr[i];             // as the sum can be negative,            // taking modulo twice            mod_arr[i] = ((curr_sum % k) + k) % k;        }         for (int i = 0; i < n; i++)        {            // if true then sum(0..i) is            // divisible by k            if (mod_arr[i] == 0)                // update 'max'                max = i + 1;                 // if value 'mod_arr[i]' not present in 'um'                // then store it in 'um' with index of its                // first occurrence            else if (um.containsKey(mod_arr[i]) == false)                um.put(mod_arr[i] , i);             else                // if true, then update 'max'                if (max < (i - um.get(mod_arr[i])))                    max = i - um.get(mod_arr[i]);        }         // required length of longest subarray with        // sum divisible by 'k'        return max;    }    static BigInteger count(String a, String b)    {        int m = a.length();        int n = b.length();         // Create a table to store        // results of sub-problems        BigInteger lookup[][] = new BigInteger[m + 1][n + 1];         // If first string is empty        for (int i = 0; i <= n; ++i)            lookup[0][i] = BigInteger.valueOf(0);         // If second string is empty        for (int i = 0; i <= m; ++i)            lookup[i][0] = BigInteger.valueOf(1);         // Fill lookup[][] in        // bottom up manner        for (int i = 1; i <= m; i++)        {            for (int j = 1; j <= n; j++)            {                // If last characters are                // same, we have two options -                // 1. consider last characters                //    of both strings in solution                // 2. ignore last character                //    of first string                if (a.charAt(i - 1) == b.charAt(j - 1)) {                    lookup[i][j] = lookup[i - 1][j - 1].add(lookup[i - 1][j]);                }                 else                    // If last character are                    // different, ignore last                    // character of first string                    lookup[i][j] = lookup[i - 1][j];            }        }         return lookup[m][n];    }    public static int findMaxGCD(int arr[], int n)    {        // Computing highest element        int high = 0;        for (int i = 0; i < n; i++)            high = Math.max(high, arr[i]);         // Array to store the count of divisors        // i.e. Potential GCDs        int divisors[] =new int[high + 1];         // Iterating over every element        for (int i = 0; i < n; i++)        {            // Calculating all the divisors            for (int j = 1; j <= Math.sqrt(arr[i]); j++)            {                // Divisor found                if (arr[i] % j == 0)                {                    // Incrementing count for divisor                    divisors[j]++;                     // Element/divisor is also a divisor                    // Checking if both divisors are                    // not same                    if (j != arr[i] / j)                        divisors[arr[i] / j]++;                }            }        }         // Checking the highest potential GCD        for (int i = high; i >= 1; i--)             // If this divisor can divide at least 2            // numbers, it is a GCD of at least 1 pair            if (divisors[i] > 1)                return i;        return 1;    }    public static int gp(long n){        int count=0;        while(n%2==0){            n=n/2;            count++;        }        return count;                    }    static class ans{        int a;        int b;        public ans(int a, int b){            this.a=a;            this.b=b;         }    }    static class sort implements Comparator<ans>{          @Override        public int compare(ans a1,ans a2){            return a1.a-a2.a;        }        }                public static void main(String[] args) throws IOException {        Reader.init(System.in);       int n= Reader.nextInt();       String str= Reader.next();       int count=0;        for (int i = 0; i <n ; i++) {            if(str.charAt(i)=='I'){                count++;            }        }        if(count>=2){            System.out.println(0);        }        else if(count==1){            System.out.println(1);        }        else if(count==0){            int l=0;            for (int i = 0; i <n ; i++) {                if(str.charAt(i)=='A'){                    l++;                }            }            System.out.println(l);        }                   }       static void merge(int arr[], int l, int m, int r)    {        // Find sizes of two subarrays to be merged        int n1 = m - l + 1;        int n2 = r - m;         /* Create temp arrays */        int L[] = new int [n1];        int R[] = new int [n2];         /*Copy data to temp arrays*/        for (int i=0; i<n1; ++i)            L[i] = arr[l + i];        for (int j=0; j<n2; ++j)            R[j] = arr[m + 1+ j];          /* Merge the temp arrays */         // Initial indexes of first and second subarrays        int i = 0, j = 0;         // Initial index of merged subarry array        int k = l;        while (i < n1 && j < n2)        {            if (L[i] <= R[j])            {                arr[k] = L[i];                i++;            }            else            {                arr[k] = R[j];                j++;            }            k++;        }         /* Copy remaining elements of L[] if any */        while (i < n1)        {            arr[k] = L[i];            i++;            k++;        }         /* Copy remaining elements of R[] if any */        while (j < n2)        {            arr[k] = R[j];            j++;            k++;        }    }     // Main function that sorts arr[l..r] using    // merge()    static void sort(int arr[], int l, int r)    {        if (l < r)        {            // Find the middle point            int m = (l+r)/2;             // Sort first and second halves            sort(arr, l, m);            sort(arr , m+1, r);             // Merge the sorted halves            merge(arr, l, m, r);        }    }    static boolean ans(int check, long arr[],int n,int med,int k){        long ans=0;        for (int i = med; i <n ; i++) {            if(check>=arr[i]){                ans+=check-arr[i];            }        }        return ans<=k;        }     static long smallestDivisor(long n)    {        // if divisible by 2        if (n % 2 == 0)            return 2;         // iterate from 3 to sqrt(n)        for (int i = 3; (long)i *(long) i <= n; i += 2) {            if (n % i == 0)                return i;        }         return n;    }    static boolean isPrime(long n)    {        // Corner cases        if (n <= 1) return false;        if (n <= 3) return true;         // This is checked so that we can skip        // middle five numbers in below loop        if (n % 2 == 0 || n % 3 == 0) return false;         for (long i = 5; i * i <= n; i = i + 6)            if (n % i == 0 || n % (i + 2) == 0)                return false;         return true;    }static BigDecimal fd(int mid, double h, double c){        BigDecimal a = new BigDecimal((h+c)/(2.0));        BigDecimal b = new BigDecimal((h-c)/(2.0*mid));        BigDecimal cd = a.add(b);        return cd;    }    static   int partition(double arr[],int arr1[],int arr2[], int low, int high)    {        double pivot = arr[high];        int i = (low-1); // index of smaller element        for (int j=low; j<high; j++)        {            // If current element is smaller than the pivot            if (arr[j] < pivot)            {                i++;                 // swap arr[i] and arr[j]                double temp = arr[i];                arr[i] = arr[j];                arr[j] = temp;                int temp1=arr1[i];                arr1[i]=arr1[j];                arr1[j]=temp1;                int temp2=arr2[i];                arr2[i]=arr2[j];                arr2[j]=temp2;             }        }         // swap arr[i+1] and arr[high] (or pivot)        double temp = arr[i+1];        arr[i+1] = arr[high];        arr[high] = temp;        int temp1= arr1[i+1];        arr1[i+1]=arr1[high];        arr1[high]= temp1;        int temp2= arr2[i+1];        arr2[i+1]=arr2[high];        arr2[high]= temp2;         return i+1;    }      /* The main function that implements QuickSort()      arr[] --> Array to be sorted,      low  --> Starting index,      high  --> Ending index */    static void sort(double arr[],int arr1[],int arr2[], int low, int high)    {        if (low < high)        {            /* pi is partitioning index, arr[pi] is              now at right place */            int pi = partition(arr,arr1,arr2, low, high);             // Recursively sort elements before            // partition and after partition            sort(arr,arr1,arr2, low, pi-1);            sort(arr,arr1, arr2,pi+1, high);        }    }    static int removeDuplicates(int arr[], int n)    {        // Return, if array is empty        // or contains a single element        if (n==0 || n==1)            return n;         int[] temp = new int[n];         // Start traversing elements        int j = 0;        for (int i=0; i<n-1; i++)            // If current element is not equal            // to next element then store that            // current element            if (arr[i] != arr[i+1])                temp[j++] = arr[i];         // Store the last element as whether        // it is unique or repeated, it hasn't        // stored previously        temp[j++] = arr[n-1];         // Modify original array        for (int i=0; i<j; i++)            arr[i] = temp[i];         return j;    }    static long maxPrimeFactors( long n)    {        // Initialize the maximum prime        // factor variable with the        // lowest one        long maxPrime = -1;         // Print the number of 2s        // that divide n        while (n % 2 == 0) {            maxPrime = 2;             // equivalent to n /= 2            n >>= 1;        }         // n must be odd at this point,        // thus skip the even numbers        // and iterate only for odd        // integers        for (int i = 3; i <= Math.sqrt(n); i += 2) {            while (n % i == 0) {                maxPrime = i;                n = n / i;            }        }         // This condition is to handle        // the case when n is a prime        // number greater than 2        if (n > 2)            maxPrime = n;         return maxPrime;    }    }
