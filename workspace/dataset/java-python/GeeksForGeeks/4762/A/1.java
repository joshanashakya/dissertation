

// Java program to find the maximum height  
// of Pyramidal Arrangement of array values 
import java.lang.*; 
  
class GFG { 
      
    static int MaximumHeight(int a[], int n) 
    { 
        return (int)Math.floor((-1 +  
                Math.sqrt(1 + (8 * n))) / 2); 
    } 
      
    public static void main(String[] args) 
    { 
        int arr[] = new int[]{ 40, 100, 20, 30 }; 
        int n = arr.length; 
          
        System.out.println(MaximumHeight(arr, n)); 
    } 
} 
  
// This code is contributed by Smitha 

