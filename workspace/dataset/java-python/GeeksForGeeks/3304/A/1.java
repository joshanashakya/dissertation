

// Java implementation of above approach 
class GFG  
{ 
  
    // Function to find the number  
    // of partitions of N  
    static long partitions(int n)  
    { 
        long p[] = new long[n + 1]; 
  
        // Base case  
        p[0] = 1; 
  
        for (int i = 1; i <= n; ++i) 
        { 
            int k = 1; 
            while ((k * (3 * k - 1)) / 2 <= i)  
            { 
                p[i] += (k % 2 != 0 ? 1 : -1) * 
                    p[i - (k * (3 * k - 1)) / 2]; 
  
                if (k > 0) 
                { 
                    k *= -1; 
                }  
                else 
                { 
                    k = 1 - k; 
                } 
            } 
        } 
        return p[n]; 
    } 
  
    // Driver code  
    public static void main(String[] args)  
    { 
        int N = 20; 
        System.out.println(partitions(N)); 
    } 
}  
  
// This code is contributed by Rajput-JI 

