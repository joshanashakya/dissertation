

import java.util.Arrays; 
  
class GFG 
{ 
      
    static class Pair implements Comparable<Pair> 
    { 
        int first, second; 
          
        Pair(int f, int s) 
        { 
            first = f; 
            second = s; 
        } 
  
        @Override
        public int compareTo(Pair o) 
        { 
            if(this.second > o.second) 
                return 1; 
            else if(this.second == o.second) 
                return 0; 
            return -1; 
        } 
    } 
    // array to store the count of distinct prime  
    static int prime[] = new int[100002];  
      
    static void SieveOfEratosthenes() 
    {  
        // Create a int array "prime[0..n]" and initialize  
        // all entries it as 0. A value in prime[i] will  
        // count of distinct prime factors.  
        Arrays.fill(prime, 0); 
      
        // 0 and 1 does not have any prime factors  
        prime[0] = 0;  
        prime[1] = 0;  
      
        for (int p = 2; p * p <= 100001; p++)  
        {  
            // If prime[p] is not changed,  
            // then it is a prime  
            if (prime[p] == 0)  
            {  
                prime[p]++;  
      
                // Update all multiples of p greater than or  
                // equal to the square of it  
                // numbers which are multiple of p and are  
                // less than p^2 are already been marked.  
                for (int i = p * p; i <= 100001; i += p)  
                    prime[i]++;  
            }  
        }  
    }  
      
    // Function to sort the array on the  
    // basis increasing count of distinct  
    // prime factors  
    static void sortArr(int arr[], int n)  
    {  
        // Array to store the number and  
        // count of prime factor 
        Pair v[] = new Pair[n]; 
      
        for (int i = 0; i < n; i++)  
        {  
            // update the element and  
            // count of distinct  
            // prime factors  
            v[i] = new Pair(arr[i], prime[arr[i]]); 
        }  
      
        // sort the array on the  
        // basis increasing count of  
        // distinct prime factors  
        Arrays.sort(v); 
      
        // display the sorted array  
        for (int i = 0; i < n; i++)  
            System.out.print(v[i].first + " ");  
      
        System.out.println(); 
    }  
      
    // Driver code  
    public static void main(String args[]) 
    {  
        // create the sieve  
        SieveOfEratosthenes();  
      
        int arr[] = { 30, 2, 1024, 210, 3, 6 };  
      
        int n = arr.length;  
      
        sortArr(arr, n); 
    }  
} 
  
// This code is contributed by ghanshyampandey 

