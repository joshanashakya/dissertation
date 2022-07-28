

// Java program to implement the above approach 
  
import java.io.*; 
  
class GFG { 
  
    private static int minBroadcastRange( 
        int[] houses, int[] towers) 
    { 
  
        // Store no of houses 
        int n = houses.length; 
  
        // Store no of towers 
        int m = towers.length; 
  
        // Initialize distance of left 
        // tower from first house 
        int leftTower = Integer.MIN_VALUE; 
  
        // Initialize distance of right 
        // tower from first house 
        int rightTower = towers[0]; 
  
        // j: Index of houses[] 
        // k: Index of towers[] 
        int j = 0, k = 0; 
  
        // Store the minimum required range 
        int min_range = 0; 
  
        while (j < n) { 
  
            // If the house lies between 
            // left and right towers 
            if (houses[j] < rightTower) { 
  
                int left = houses[j] - leftTower; 
                int right = rightTower - houses[j]; 
  
                // Compare the distance between the 
                // left and right nearest towers 
                int local_max = left < right ? left : right; 
  
                if (local_max > min_range) 
  
                    // updating the maximum value 
                    min_range = local_max; 
                j++; 
            } 
            else { 
  
                // updating the left tower 
                leftTower = towers[k]; 
  
                if (k < m - 1) { 
  
                    k++; 
                    // updating the right tower 
                    rightTower = towers[k]; 
                } 
                else
                    // updating right tower 
                    // to maximum value after 
                    // reaching the end of Tower array 
                    rightTower = Integer.MAX_VALUE; 
            } 
        } 
        return min_range; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int[] a = { 12, 13, 11, 80 }; 
        int[] b = { 4, 6, 15, 60 }; 
        int max = minBroadcastRange(a, b); 
        System.out.println(max); 
    } 
} 

