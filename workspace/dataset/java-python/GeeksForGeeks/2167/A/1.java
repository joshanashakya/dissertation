

// Java implementation of the approach  
class GFG 
{ 
      
    // Function to return the kth element  
    // of the Odd-Even sequence  
    // of length n  
    static int findK(int n, int k)  
    {  
        int pos;  
      
        // Finding the index from where the  
        // even numbers will be stored  
        if (n % 2 == 0)  
        {  
            pos = n / 2;  
        }  
        else
        {  
            pos = (n / 2) + 1;  
        }  
      
        // Return the kth element  
        if (k <= pos)  
        {  
            return (k * 2 - 1);  
        }  
        else
            return ((k - pos) * 2);  
    }  
      
    // Function to return the count of  
    // set bits in the kth number of the  
    // odd even sequence of length n  
    static int countSetBits(int n, int k)  
    {  
      
        // Required kth number  
        int kth = findK(n, k);  
          
        int count = 0;  
          
        while (kth > 0)  
        {  
            count += kth & 1;  
            kth >>= 1;  
        }  
          
        // Return the count of set bits  
        return count; 
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int n = 18, k = 12;  
      
        System.out.println(countSetBits(n, k));  
    }  
} 
  
// This code is contributed by AnkitRai01 

