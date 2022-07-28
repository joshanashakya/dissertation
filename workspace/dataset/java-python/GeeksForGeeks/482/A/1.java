

// Java program to find sum of elements 
// in an array having frequency greater 
// than or equal to that element 
import java.util.*; 
class Solution 
{ 
  
// Function to return the sum of elements 
// in an array having frequency greater 
// than or equal to that element 
static int sumOfElements(int arr[], int n) 
{ 
    boolean prime[] = new boolean[n + 1]; 
    int i, j; 
  
    // Map is used to store 
    // element frequencies 
    HashMap<Integer, Integer> m= new HashMap<Integer,Integer>(); 
    for (i = 0; i < n; i++) 
        { 
            if(m.get(arr[i])==null) 
            m.put(arr[i],1); 
            else
            m.put(arr[i],m.get(arr[i])+1); 
        } 
  
    int sum = 0; 
        // Getting an iterator  
        Iterator hmIterator = m.entrySet().iterator();  
    
    
    // Traverse the map using iterators 
        while (hmIterator.hasNext()) {  
            Map.Entry mapElement = (Map.Entry)hmIterator.next(); 
  
        // Calculate the sum of elements 
        // having frequencies greater than 
        // or equal to the element itself 
        if (((int)mapElement.getValue()) >= ((int)mapElement.getKey())) { 
            sum += ((int)mapElement.getKey()); 
        } 
    } 
  
    return sum; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int arr[] = { 1, 2, 3, 3, 2, 3, 2, 3, 3 }; 
    int n = arr.length; 
  
    System.out.println(sumOfElements(arr, n)); 
  
 } 
} 
//contributed by Arnab Kundu 

