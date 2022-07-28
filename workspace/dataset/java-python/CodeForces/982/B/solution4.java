//package MyJavaProject; import java.util.*;import java.lang.Math;import java.util.concurrent.TimeUnit;import java.util.stream.Collectors;import java.io.*;import java.math.BigInteger;   public class Main {	static class FastReader  	    { 	        BufferedReader br; 	        StringTokenizer st; 	  	        public FastReader() 	        { 	            br = new BufferedReader(new	                     InputStreamReader(System.in)); 	        } 	  	        String next() 	        { 	            while (st == null || !st.hasMoreElements()) 	            { 	                try	                { 	                    st = new StringTokenizer(br.readLine()); 	                } 	                catch (IOException  e) 	                { 	                    e.printStackTrace(); 	                } 	            } 	            return st.nextToken(); 	        } 	  	        int nextInt() 	        { 	            return Integer.parseInt(next()); 	        } 	  	        long nextLong() 	        { 	            return Long.parseLong(next()); 	        } 	  	        double nextDouble() 	        { 	            return Double.parseDouble(next()); 	        } 	  	        String nextLine() 	        { 	            String str = ""; 	            try	            { 	                str = br.readLine(); 	            } 	            catch (IOException e) 	            { 	                e.printStackTrace(); 	            } 	            return str; 	        } 	    }  	static void print(String s)	{		System.out.print(s);	}	static void print(boolean s)	{		System.out.print(s);	}		static boolean isPrime(long n) 	{ 		// Corner cases 		if (n <= 1) 			return false; 		if (n <= 3) 			return true;  		// This is checked so that we can skip 		// middle five numbers in below loop 		if (n % 2 == 0 || n % 3 == 0) 			return false;  		for (int i = 5; i * i <= n; i = i + 6) 			if (n % i == 0 || n % (i + 2) == 0) 				return false;  		return true; 	}  	static FastReader f=new FastReader();	static long[] inArr(long a[],int n)	{		for(int i=0;i<n;i++)			a[i]=f.nextLong();		return(a);	}	static void printArr(long a[],int n)	{		for(int i=0;i<n;i++)			System.out.print(a[i]+" ");		System.out.println();	}	static long bincon(long x,long y)	{		String binx=Long.toBinaryString(x);		String biny=Long.toBinaryString(y);		String xpy=binx+biny;		String ypx=biny+binx;		//System.out.println(binx+" "+biny);		return(Long.parseLong(xpy, 2)-Long.parseLong(ypx, 2));	}	public static int SumPairs(int[] input, int k){	    Map<Integer, Integer> frequencies = new HashMap<>();	    int pairsCount = 0;       	    for(int i=0; i<input.length; i++){	        int value = input[i];	        int complement = k - input[i]; 	        if(frequencies.containsKey(complement)){                	            int freq = frequencies.get(complement) - 1;	            pairsCount++;	            //System.out.println(value + ", " + complement);    	            if(freq == 0){	                frequencies.remove(complement);	            }else{	                frequencies.put(complement, freq);	            }	        }else{	            if(frequencies.containsKey(value)){         	                frequencies.put(value, frequencies.get(value) + 1);             	            }else{	                frequencies.put(value, 1);	            }	        }	    }	    return pairsCount;	}	 void merge(long arr[], int l, int m, int r) 	    { 	        // Find sizes of two subarrays to be merged 	        int n1 = m - l + 1; 	        int n2 = r - m; 	  	        /* Create temp arrays */	        long L[] = new long[n1]; 	        long R[] = new long[n2]; 	  	        /*Copy data to temp arrays*/	        for (int i = 0; i < n1; ++i) 	            L[i] = arr[l + i]; 	        for (int j = 0; j < n2; ++j) 	            R[j] = arr[m + 1 + j]; 	  	        /* Merge the temp arrays */	  	        // Initial indexes of first and second subarrays 	        int i = 0, j = 0; 	  	        // Initial index of merged subarry array 	        int k = l; 	        while (i < n1 && j < n2) { 	            if (L[i] <= R[j]) { 	                arr[k] = L[i]; 	                i++; 	            } 	            else { 	                arr[k] = R[j]; 	                j++; 	            } 	            k++; 	        } 	  	        /* Copy remaining elements of L[] if any */	        while (i < n1) { 	            arr[k] = L[i]; 	            i++; 	            k++; 	        } 	  	        /* Copy remaining elements of R[] if any */	        while (j < n2) { 	            arr[k] = R[j]; 	            j++; 	            k++; 	        } 	    } 	  	    // Main function that sorts arr[l..r] using 	    // merge() 	    void sort(long arr[], int l, int r) 	    { 	        if (l < r) { 	            // Find the middle point 	            int m = (l + r) / 2; 	  	            // Sort first and second halves 	            sort(arr, l, m); 	            sort(arr, m + 1, r); 	  	            // Merge the sorted halves 	            merge(arr, l, m, r); 	        } 	    }        static int power(int x, int y, int p)     {         // Initialize result         int res = 1;                       // Update x if it is more           // than or equal to p         x = x % p;           if (x == 0) return 0; // In case x is divisible by p;              while (y > 0)         {             // If y is odd, multiply x             // with result             if((y & 1)==1)                 res = (res%p * x%p) % p;                   // y must be even now             // y = y / 2             y = y >> 1;              x = (x%p * x%p) % p;          }         return res;     }     static int modFact(int n,             int p) { if (n >= p)  return 0;  int result = 1; for (int i = 1; i <= n; i++)  result = (result%p * i%p) % p;  return result; }      static int nCr(int n, int r)     {         return fact(n) / (fact(r) *                       fact(n - r));     }           // Returns factorial of n     static int fact(int n)     {         int res = 1;         for (int i = 2; i <= n; i++)             res = res * i;         return res;     } 	public static void main(String argsp[]) throws Exception	{		Main ob=new Main();		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));		Random rand = new Random();		//Scanner sc=new Scanner(System.in);		//int k=f.nextInt();		//int t=f.nextInt();		//while(t--!=0)		{			int n=f.nextInt();			long wd[]=new long[n];			int hash[]=new int[n];			for(int i=0;i<n;i++)			{				wd[i]=f.nextLong();				//hash[(int)wd[i]]=0;									}						String Sa=f.next();									HashMap<Long,Integer> hm=new HashMap<>();			//HashMap<Long,Integer> hm1=new HashMap<>();			Stack<Long> ar=new Stack<>();			for(int i=0;i<n;i++)			{				hm.put(wd[i],i);				//hash[i]=0;			}			int flag=1;					ob.sort(wd, 0, n-1);			int i0=0,i1=n-1;			//System.out.println(hm);						StringBuilder ans=new StringBuilder("");			for(int j=0;j<2*n;j++)			{				//System.out.println(ar);				if(Sa.charAt(j)=='0')				{					ans.append(Integer.toString(hm.get(wd[i0])+1)+" ");					ar.push(wd[i0]);					//Collections.sort(ar);					//hash[(int)wd[i0]]++;					i0++;				}								else				{					ans.append(Integer.toString(hm.get(ar.get(ar.size()-1))+1)+" ");					ar.pop();									}							}						w.write(ans+"\n");				}				//6 6 2 3 3 1 4 4 1 2 5 5  		w.flush();									}}
