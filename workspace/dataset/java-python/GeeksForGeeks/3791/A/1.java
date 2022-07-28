

// Java implementation of the approach 
class GFG  
{ 
static int MAX_INT = 1000000; 
  
// Function to return the minimum length 
// of a sub-array which contains 
// {0, 1, 2, 3, 4} as a sub-sequence 
static int solve(int[] array, int N)  
{ 
  
    // To store the indices where 0, 1, 2, 
    // 3 and 4 are present 
    int[][] pos = new int[5][10000]; 
  
    // To store if there exist a valid prefix 
    // of sequence in array 
    int[] pref = new int[5]; 
  
    // Base Case 
    if (array[0] == 0) 
    { 
        pref[0] = 1; 
        pos[0][pos[0].length - 1] = 0; 
    } 
  
    int ans = MAX_INT; 
  
    for (int i = 1; i < N; i++)  
    { 
  
        // If current element is 0 
        if (array[i] == 0)  
        { 
  
            // Update the count of 0s till now 
            pref[0]++; 
  
            // Push the index of the new 0 
            pos[0][pos[0].length - 1] = i; 
        }  
          
        else 
        { 
  
            // To check if previous element of the 
            // given sequence is found till now 
            if (pref[array[i] - 1] > 0)  
            { 
                pref[array[i]]++; 
                pos[array[i]][pos[array[i]].length - 1] = i; 
  
                // If it is the end of sequence 
                if (array[i] == 4) 
                { 
                    int end = i; 
                    int start = i; 
  
                    // Iterate for other elements of the sequence 
                    for (int j = 3; j >= 0; j--)  
                    { 
                        int s = 0; 
                        int e = pos[j].length - 1; 
                        int temp = -1; 
  
                        // Binary Search to find closest occurrence 
                        // less than equal to starting point 
                        while (s <= e)  
                        { 
                            int m = (s + e) / 2; 
                            if (pos[j][m] <= start)  
                            { 
                                temp = pos[j][m]; 
                                s = m + 1; 
                            }  
                            else
                                e = m - 1; 
                        } 
  
                        // Update the starting point 
                        start = temp; 
                    } 
                    ans = Math.min(ans, end - start + 1); 
                } 
            } 
        } 
    } 
    return ans; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int[] array = { 0, 1, 2, 3, 4, 2, 0, 3, 4 }; 
    int N = array.length; 
  
    System.out.println(solve(array, N)); 
} 
} 
  
// This code is contributed by 
// sanjeev2552 

