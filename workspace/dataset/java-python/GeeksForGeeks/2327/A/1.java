

// Java implementation of the approach 
class GFG 
{ 
      
    static int INT_SIZE = 32;  
  
    // function returns the position 
    // of rightmost setbit 
    static int Right_most_setbit(int num)  
    {  
        int pos = 1;  
        // counting the position of first set bit  
        for (int i = 0; i < INT_SIZE; i++)  
        {  
            if ((num & (1 << i))== 0)  
                pos++;  
              
            else
                break;  
        }  
        return pos;  
    } 
      
    // Function to find value at k-th position 
    static int findValueAtK(int n, int m, int k) 
    { 
          
        int positionOfRightmostSetbit = Right_most_setbit(k); 
      
        // Return the required element 
        return ((m - 1) + positionOfRightmostSetbit); 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        int k = 100, n = 9, m = 74; 
        System.out.println(findValueAtK(n, m, k)); 
  
    } 
  
} 
  
// This code is contributed by ihritik 

