

// Java implementation of the approach  
import java.util.*; 
  
class GFG  
{ 
  
    // Function that returns true if the prisoners  
    // can be placed such that the minimum distance  
    // between any two prisoners is at least sep  
    static boolean canPlace(int a[], int n, int p, int sep)  
    {  
        // Considering the first prisoner  
        // is placed at 1st cell  
        int prisoners_placed = 1;  
      
        // If the first prisoner is placed at  
        // the first cell then the last_prisoner_placed  
        // will be the first prisoner placed  
        // and that will be in cell[0]  
        int last_prisoner_placed = a[0];  
      
        for (int i = 1; i < n; i++)  
        {  
            int current_cell = a[i];  
      
            // Checking if the prisoner can be  
            // placed at ith cell or not  
            if (current_cell - last_prisoner_placed >= sep)  
            {  
                prisoners_placed++;  
                last_prisoner_placed = current_cell;  
      
                // If all the prisoners got placed  
                // then return true  
                if (prisoners_placed == p)  
                {  
                    return true;  
                }  
            }  
        }  
      
        return false;  
    }  
      
    // Function to return the maximized distance  
    static int maxDistance(int cell[], int n, int p)  
    {  
      
        // Sort the array so that binary  
        // search can be applied on it  
        Arrays.sort(cell);  
      
        // Minimum possible distance  
        // for the search space  
        int start = 0;  
      
        // Maximum possible distance  
        // for the search space  
        int end = cell[n - 1] - cell[0];  
      
        // To store the result  
        int ans = 0;  
      
        // Binary search  
        while (start <= end)  
        {  
            int mid = start + ((end - start) / 2);  
      
            // If the prisoners can be placed such that  
            // the minimum distance between any two  
            // prisoners is at least mid  
            if (canPlace(cell, n, p, mid)) 
            {  
      
                // Update the answer  
                ans = mid;  
                start = mid + 1;  
            }  
            else
            {  
                end = mid - 1;  
            }  
        }  
        return ans;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int cell[] = { 1, 2, 8, 4, 9 };  
        int n = cell.length;  
        int p = 3;  
      
        System.out.println(maxDistance(cell, n, p));  
      
    }  
} 
  
// This code is contributed by AnkitRai01 

