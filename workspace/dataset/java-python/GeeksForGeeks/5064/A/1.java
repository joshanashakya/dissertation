

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
static int MAX = 100001; 
static int ROW = 10; 
static int COl = 3; 
  
static Vector<Integer> []indices = new Vector[MAX]; 
  
// All possible solutions of the 
// equation 1/a + 1/b + 1/c = 1 
static int test[][] = { { 2, 3, 6 }, { 2, 4, 4 }, 
                        { 2, 6, 3 }, { 3, 2, 6 }, 
                        { 3, 3, 3 }, { 3, 6, 2 }, 
                        { 4, 2, 4 }, { 4, 4, 2 }, 
                        { 6, 2, 3 }, { 6, 3, 2 } }; 
  
// Function to find the triplets 
static int find_triplet(int array[], int n) 
{ 
    int answer = 0; 
    for (int i = 0; i < MAX; i++) 
    { 
        indices[i] = new Vector<>(); 
    } 
      
    // Storing indices of the elements 
    for (int i = 0; i < n; i++) 
    { 
        indices[array[i]].add(i); 
    } 
  
    for (int i = 0; i < n; i++) 
    { 
        int y = array[i]; 
  
        for (int j = 0; j < ROW; j++)  
        { 
            int s = test[j][1] * y; 
  
            // Check if y can act as the middle 
            // element of triplet with the given 
            // solution of 1/a + 1/b + 1/c = 1 
            if (s % test[j][0] != 0) 
                continue; 
            if (s % test[j][2] != 0) 
                continue; 
  
            int x = s / test[j][0]; 
            int z = s / test[j][2]; 
            if (x > MAX || z > MAX) 
                continue; 
  
            int l = 0; 
            int r = indices[x].size() - 1; 
  
            int first = -1; 
  
            // Binary search to find the number of 
            // possible values of the first element 
            while (l <= r) 
            { 
                int m = (l + r) / 2; 
  
                if (indices[x].get(m) < i) 
                { 
                    first = m; 
                    l = m + 1; 
                } 
                else 
                { 
                    r = m - 1; 
                } 
            } 
  
            l = 0; 
            r = indices[z].size() - 1; 
  
            int third = -1; 
  
            // Binary search to find the number of 
            // possible values of the third element 
            while (l <= r)  
            { 
                int m = (l + r) / 2; 
  
                if (indices[z].get(m) > i)  
                { 
                    third = m; 
                    r = m - 1; 
                } 
                else 
                { 
                    l = m + 1; 
                } 
            } 
  
            if (first != -1 && third != -1)  
            { 
  
                // Contribution to the answer would 
                // be the multiplication of the possible 
                // values for the first and the third element 
                answer += (first + 1) * (indices[z].size() - third); 
            } 
        } 
    } 
    return answer; 
} 
  
// Driver code 
public static void main(String []args)  
{ 
    int array[] = { 2, 4, 5, 6, 7 }; 
    int n = array.length; 
  
    System.out.println(find_triplet(array, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

