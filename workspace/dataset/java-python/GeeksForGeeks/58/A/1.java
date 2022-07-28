

// Java program to find Sum 
// of GCD over all subarrays 
class GFG  
{ 
  
//int a[100001]; 
static int [][]SparseTable = new int[100001][51]; 
  
// Build Sparse Table 
static void buildSparseTable(int a[], int n) 
{ 
    for (int i = 0; i < n; i++)  
    { 
        SparseTable[i][0] = a[i]; 
    } 
      
    // Building the Sparse Table  
    // for GCD[L, R] Queries 
    for (int j = 1; j <= 19; j++) 
    { 
        for (int i = 0; i <= n - (1 << j); i++)  
        { 
            SparseTable[i][j] = __gcd(SparseTable[i][j - 1],  
                     SparseTable[i + (1 << (j - 1))][j - 1]); 
        } 
    } 
} 
  
// Utility Function to calculate GCD in range [L,R] 
static int queryForGCD(int L, int R) 
{ 
    int returnValue; 
      
    // Calculating where the answer is  
    // stored in our Sparse Table 
    int j = (int) (Math.log(R - L + 1)); 
      
    returnValue = __gcd(SparseTable[L][j],  
         SparseTable[R - (1 << j) + 1][j]); 
                      
    return returnValue; 
} 
  
// Utility Function to find next-farther  
// position where gcd is same  
static int nextPosition(int tempGCD, int startPointer,  
                        int prevEndPointer, int n) 
{ 
    int high = n - 1; 
    int low = prevEndPointer; 
    int mid = prevEndPointer; 
    int nextPos = prevEndPointer; 
      
    // BinarySearch for Next Position  
    // for EndPointer 
    while (high >= low)  
    { 
        mid = ((high + low) >> 1); 
          
        if (queryForGCD(startPointer, mid) == tempGCD)  
        { 
            nextPos = mid; 
            low = mid + 1; 
        } 
        else
        { 
            high = mid - 1; 
        } 
    } 
    return nextPos + 1; 
} 
  
// Utility function to calculate  
// sum of gcd  
static int calculateSum(int a[], int n) 
{ 
    buildSparseTable(a, n); 
      
    int endPointer, startPointer,  
        prevEndPointer, tempGCD; 
      
    int tempAns = 0; 
      
    for (int i = 0; i < n; i++) 
    { 
        // Initialising all the values 
        endPointer = i; 
        startPointer = i; 
        prevEndPointer = i; 
        tempGCD = a[i]; 
        while (endPointer < n)  
        { 
  
            // Finding the next position for endPointer 
            endPointer = nextPosition(tempGCD, startPointer,  
                                         prevEndPointer, n); 
  
            // Adding the suitable sum to our answer 
            tempAns += ((endPointer -  
                         prevEndPointer) * tempGCD); 
  
            // Changing prevEndPointer 
            prevEndPointer = endPointer; 
  
            if (endPointer < n) 
            { 
                  
                // Recalculating tempGCD 
                tempGCD = __gcd(tempGCD, a[endPointer]); 
            } 
        } 
    } 
    return tempAns; 
} 
  
static int __gcd(int a, int b)  
{  
    return b == 0? a:__gcd(b, a % b);      
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int n = 6; 
      
    int a[] = {2, 2, 2, 3, 5, 5}; 
      
    System.out.println(calculateSum(a, n)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

