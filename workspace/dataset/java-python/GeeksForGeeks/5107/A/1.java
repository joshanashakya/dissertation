

// Java implementation of the approach 
  
class GFG  
{ 
  
// Function To find the required interval 
static void solve(int interval[][], int N, int Q) 
{ 
    int Mark[] = new int[Q]; 
    for (int i = 0; i < N; i++) 
    { 
        int l = interval[i][0] - 1; 
        int r = interval[i][1] - 1; 
        for (int j = l; j <= r; j++) 
            Mark[j]++; 
    } 
  
    // Total Count of covered numbers 
    int count = 0; 
    for (int i = 0; i < Q; i++)  
    { 
        if (Mark[i] != 0) 
            count++; 
    } 
  
    // Array to store numbers that occur 
    // exactly in one interval till ith interval 
    int count1[] = new int[Q]; 
    if (Mark[0] == 1) 
        count1[0] = 1; 
    for (int i = 1; i < Q; i++) 
    { 
        if (Mark[i] == 1) 
            count1[i] = count1[i - 1] + 1; 
        else
            count1[i] = count1[i - 1]; 
    } 
  
    int maxindex = 0; 
    int maxcoverage = 0; 
    for (int i = 0; i < N; i++)  
    { 
        int l = interval[i][0] - 1; 
        int r = interval[i][1] - 1; 
  
        // Calculate New count by removing all numbers 
        // in range [l, r] occurring exactly once 
        int elem1; 
        if (l != 0) 
            elem1 = count1[r] - count1[l - 1]; 
        else
            elem1 = count1[r]; 
        if (count - elem1 >= maxcoverage) 
        { 
            maxcoverage = count - elem1; 
            maxindex = i; 
        } 
    } 
    System.out.println("Maximum Coverage is " + maxcoverage 
        + " after removing interval at index "
        + maxindex); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
        int interval[][] = { { 1, 4 }, 
                        { 4, 5 }, 
                        { 5, 6 }, 
                        { 6, 7 }, 
                        { 3, 5 } }; 
    int N = interval.length; 
    int Q = 7; 
    solve(interval, N, Q); 
} 
} 
  
/* This code contributed by PrinciRaj1992 */

