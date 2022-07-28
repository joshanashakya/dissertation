

// Java program to check if all array elements are 
// distinct or not. 
import java.util.Arrays; 
import java.util.HashSet; 
import java.util.Set; 
  
public class DistinctElements { 
    public static boolean areDistinct(Integer arr[]) 
    { 
        // Put all array elements in a HashSet 
        Set<Integer> s =  
           new HashSet<Integer>(Arrays.asList(arr)); 
  
        // If all elements are distinct, size of 
        // HashSet should be same array. 
        return (s.size() == arr.length); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        Integer[] arr = { 1, 2, 3, 2 }; 
        if (areDistinct(arr)) 
            System.out.println("All Elements are Distinct"); 
        else
            System.out.println("Not all Elements are Distinct"); 
    } 
} 

