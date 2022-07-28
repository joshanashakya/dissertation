

// Java implementation of the approach  
class GFG  
{ 
      
    final static int maxin = 10001;  
      
    // Divisors array to keep track  
    // of the maximum divisor  
    static int divisors[] = new int[maxin + 1];  
      
    // Function to pre-compute the prime  
    // numbers and largest divisors  
    static void Calc_Max_Div(int arr[], int n)  
    {  
      
        // Visited array to keep  
        // track of prime numbers  
        int vis[] = new int[maxin + 1]; 
          
        for(int i = 0;i <maxin+1 ; i++) 
            vis[i] = 1; 
  
        // 0 and 1 are not prime numbers  
        vis[0] = vis[1] = 0;  
      
        // Initialising divisors[i] = i  
        for (int i = 1; i <= maxin; i++)  
            divisors[i] = i;  
      
        // For all the numbers divisible by 2  
        // the maximum divisor will be number / 2  
        for (int i = 4; i <= maxin; i += 2)  
        {  
            vis[i] = 0;  
            divisors[i] = i / 2;  
        }  
        for (int i = 3; i <= maxin; i += 2)  
        {  
      
            // If divisors[i] is not equal to i then  
            // this means that divisors[i] contains  
            // minimum prime divisor for the number  
            if (divisors[i] != i) 
            {  
      
                // Update the answer to  
                // i / smallest_prime_divisor[i]  
                divisors[i] = i / divisors[i];  
            }  
      
            // Condition if i is a prime number  
            if (vis[i] == 1)  
            {  
                for (int j = i * i; j < maxin; j += i) 
                {  
                    vis[j] = 0;  
      
                    // If divisors[j] is equal to j then  
                    // this means that i is the first prime  
                    // divisor for j so we update divi[j] = i  
                    if (divisors[j] == j)  
                        divisors[j] = i;  
                }  
            }  
        }  
      
        for (int i = 0; i < n; i++)  
        {  
      
            // If the current element is prime  
            // then it has no divisors  
            // other than 1 and itself  
            if (divisors[arr[i]] == arr[i])  
                    System.out.print("-1 ");  
            else
                    System.out.print(divisors[arr[i]] + " ");  
        }  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int []arr = { 5, 6, 7, 8, 9, 10 };  
        int n = arr.length;  
      
        Calc_Max_Div(arr, n);  
    }  
} 
  
// This code is contributed by AnkitRai01 

