

// Java implementation of the above implementation  
class GFG  
{ 
  
    // Function to return the count  
    // of minimum elements such that  
    // the sum of those elements is > S.  
    static int countNumber(int N, int S)  
    {  
        int countElements = 0;  
  
        // Initialize currentSum = 0  
        int currSum = 0;  
      
        // Loop from N to 1 to add the numbers  
        // and check the condition.  
        while (currSum <= S)  
        {  
            currSum += N;  
            N--;  
            countElements++;  
        }  
        return countElements;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int N, S;  
        N = 5;  
        S = 11;  
      
        int count = countNumber(N, S);  
      
        System.out.println(count);  
    }  
} 
  
// This code is contributed by AnkitRai01 

