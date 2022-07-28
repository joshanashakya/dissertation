

// Java implementation of the approach 
import java.util.*; 
class GFG { 
  
    // Function to return the count of 
    // positions the person went to 
    public static int getDistinctPoints(int current_pos, String path) 
    { 
  
        // Length of path 
        int len = path.length(); 
  
        // Array to store all the points traveled 
        int points[] = new int[len + 1]; 
  
        // The first point is the current_pos 
        points[0] = current_pos; 
  
        // For all the directions in path 
        for (int i = 0; i < len; i++) { 
  
            // Get whether the direction was left or right 
            char ch = path.charAt(i); 
  
            // If the direction is left 
            if (ch == '0') { 
  
                // Decrement the current position by 1 
                current_pos--; 
  
                // Store the current position in array 
                points[i + 1] = current_pos; 
            } 
  
            // If the direction is right 
            else { 
  
                // Increment the current position by 1 
                current_pos++; 
  
                // Store the current position in array 
                points[i + 1] = current_pos; 
            } 
        } 
  
        return countDistinct(points, len + 1); 
    } 
  
    // Utility function to return the number 
    // of distinct elements in an array 
    public static int countDistinct(int arr[], int len) 
    { 
  
        HashSet<Integer> hs = new HashSet<Integer>(); 
  
        for (int i = 0; i < len; i++) { 
            // add all the elements to the HashSet 
            hs.add(arr[i]); 
        } 
  
        // Return the size of hashset as 
        // it consists of all unique elements 
        return hs.size(); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int current_pos = 5; 
        String path = "011101"; 
  
        System.out.print(getDistinctPoints(current_pos, path)); 
    } 
} 

