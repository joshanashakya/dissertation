

// Java program to find maximum  
// number of prime factors for  
// a number in range [1, N] 
class GFG 
{ 
static int getMax(int[] Arr) 
{  
    int max = Arr[0];  
    for(int i = 1; i < Arr.length; i++)  
    if(Arr[i] > max) 
        max = Arr[i];  
    return max;  
} 
  
// Return smallest number  
// having maximum prime factors. 
static int maxPrimefactorNum(int N) 
{ 
    // Sieve of eratosthenes method  
    // to count number of unique 
    // prime factors. 
    int[] arr = new int[N + 1]; 
    for (int i = 2; i * i <= N; i++)  
    { 
        if (arr[i] == 0) 
            for (int j = 2 * i; j <= N; j += i) 
                arr[j]++; 
  
        arr[i] = 1;  
    } 
  
    // Return maximum element in arr[] 
    return getMax(arr); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int N = 40; 
    System.out.println(maxPrimefactorNum(N)); 
} 
} 
  
// This code is contributed by mits 

