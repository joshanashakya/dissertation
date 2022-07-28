

// Java implementation of the above approach  
class GFG  
{  
      
    // Function to return the required string  
    static String smallestString(int N, int []A)  
    {  
        // First character will always be 'a'  
        char ch = 'a';  
      
        // To store the resultant string  
        String S = "";  
      
        // Since length of the string should be  
        // greater than 0 and first element  
        // of array should be 1  
        if (N < 1 || A[0] != 1)  
        {  
            S = "-1";  
            return S;  
        }  
      
        S += ch;  
        ch++;  
      
        // Check one by one all element of given prefix array  
        for (int i = 1; i < N; i++)  
        {  
            int diff = A[i] - A[i - 1];  
      
            // If the difference between any two  
            // consecutive elements of the prefix array  
            // is greater than 1 then there will be no such  
            // string possible that satisfies the given array  
            // Also, string cannot have more than  
            // 26 distinct characters  
            if (diff > 1 || diff < 0 || A[i] > 26)  
            {  
                S = "-1";  
                return S;  
            }  
      
            // If difference is 0 then the (i + 1)th character  
            // will be same as the ith character  
            else if (diff == 0)  
                S += 'a';  
      
            // If difference is 1 then the (i + 1)th character  
            // will be different from the ith character  
            else
            {  
                S += ch;  
                ch++;  
            }  
        }  
      
        // Return the resultant string  
        return S;  
    }  
      
    // Driver code  
    public static void main(String args[])  
    {  
        int []arr = { 1, 1, 2, 3, 3 };  
        int n = arr.length;  
        System.out.println(smallestString(n, arr));  
    }  
}  
  
// This code is contributed by Ryuga 

