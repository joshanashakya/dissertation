

// Java implementation of above approach 
class GFG  
{ 
      
    // Function to calculate (2^(n-1))  
    static int calculatePower(int b, int e)  
    {  
      
        // Initially initialize answer to 1  
        int ans = 1;  
        while (e > 0)  
        {  
      
            // If e is odd,  
            // multiply b with answer  
            if (e % 2 == 1)  
                ans = ans * b;  
      
            e = e / 2;  
            b = b * b;  
        }  
        return ans;  
    }  
      
    // Function to count subsets in which  
    // X element is present  
    static int CountSubSet(int arr[], int n, int X)  
    {  
        int count = 0, checkX = 0;  
      
        // Check if X is present in  
        // given subset or not  
        for (int i = 0; i < n; i++) 
        {  
            if (arr[i] == X) 
            {  
                checkX = 1;  
                break;  
            }  
        }  
      
        // If X is present in set  
        // then calculate 2^(n-1) as count  
        if (checkX == 1)  
            count = calculatePower(2, n - 1);  
      
        // if X is not present in a given set  
        else
            count = 0;  
      
        return count;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int arr[] = { 4, 5, 6, 7 };  
        int X = 5;  
        int n = arr.length;  
      
        System.out.println(CountSubSet(arr, n, X));  
    }  
} 
  
// This code is contributed by AnkitRai01 

