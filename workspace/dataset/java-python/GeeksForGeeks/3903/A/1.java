

// Java implementation of above approach 
class GFG 
{ 
  
// Function to count the pairs 
static int countPairs(int A, int B) 
{ 
  
    // Variable to store a number  
    // of special pairs 
    int cnt = 0; 
  
    for (int i = 0; i <= A; ++i)  
    { 
        for (int j = i; j <= A; ++j)  
        { 
            // Calculating AND of i, j 
            int AND = i & j; 
  
            // Calculating OR of i, j 
            int OR = i | j; 
  
            // If the conditions are met, 
            // then increment the count 
            // of special pairs 
            if (OR == A && AND == B)  
            { 
                cnt++; 
            } 
        } 
    } 
    return cnt; 
} 
  
// Driver code 
public static void main(String [] args) 
{ 
    int A = 3, B = 0; 
    System.out.println(countPairs(A, B)); 
} 
} 
  
// This code is contributed by ihritik 

