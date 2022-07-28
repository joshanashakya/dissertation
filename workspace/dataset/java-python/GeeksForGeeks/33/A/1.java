

// Java program to find the Minimum size Subarray 
// with maximum sum in non-increasing order 
import java.util.*; 
  
class GFG { 
  
  // Function to find the Minimum size Subarray  
  static void minSet(ArrayList<Integer> nums) { 
  
    ArrayList<Integer> A = new ArrayList<Integer> (); 
  
    // sort numbers in descending order 
    Collections.sort(nums); 
  
    // get total sum of the given array.  
    int sum = 0; 
    for (int i = 0; i<nums.size(); i++) 
      sum += nums.get(i); 
  
    int temp = 0; 
  
    // Loop until the sum of numbers  
    // is greater than sum/2  
    for (int i = nums.size() - 1;   
      i >= 0 && temp<= sum / 2; 
      i--) { 
  
      A.add(nums.get(i)); 
      temp += nums.get(i); 
    } 
  
    // Print the Minimum size Subarray 
    for (int i = 0; i<A.size(); i++) 
      System.out.print(A.get(i) + " "); 
  } 
  
  // Driver Code 
  public static void main(String[] args) { 
    ArrayList<Integer> gfg = new ArrayList<Integer> (); 
    gfg.add(7); 
    gfg.add(6); 
    gfg.add(13); 
    gfg.add(13); 
    gfg.add(12); 
    gfg.add(11); 
  
    // Function calling 
    minSet(gfg); 
  } 
} 
  
// This code is contributed by rutvik_56 

