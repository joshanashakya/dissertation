

// Java Program to count 
// Unique elements in Array 
import java.util.*; 
  
class GFG 
{ 
      
    // This method returns count  
    // of Unique elements  
    public static int countDistinct(int arr[],int n) 
    { 
  
        HashSet<Integer> hs = new HashSet<Integer>(); 
  
        for(int i = 0; i < n; i++) 
        {  
            // add all the elements to the HashSet  
            hs.add(arr[i]); 
        } 
          
        // return the size of hashset as  
        // it consists of all Unique elements  
        return hs.size();      
    } 
  
    // Driver code 
    public static void main(String[] args)  
    {  
        int arr[] = new int[]{6, 10, 5, 4, 9, 
                                120, 4, 6, 10}; 
        System.out.println(countDistinct(arr,  
                                arr.length)); 
    } 
} 
  
// This code is contributed by Adarsh_Verma 

