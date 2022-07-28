

// Java program to find 
// missing number in a range. 
import java.io.*; 
import java.util.*; 
  
class GFG { 
      
// Find the missing number in a range 
static int missingNum(int arr[], int n) 
{ 
    List<Integer> list = new ArrayList<>(arr.length); 
    for (int i :arr) 
    { 
        list.add(Integer.valueOf(i)); 
    } 
    int minvalue = Collections.min(list);; 
   
    // here we xor of all the number 
    int xornum = 0; 
    for (int i = 0; i < n; i++) { 
        xornum ^= (minvalue) ^ arr[i]; 
        minvalue++; 
    } 
   
    // xor last number 
    return xornum ^ minvalue; 
} 
  
public static void main (String[] args) { 
     int arr[] = { 13, 12, 11, 15 }; 
    int n = arr.length; 
    System.out.println(missingNum(arr, n));    
  
    } 
} 
  
//This code is contributed by Gitanjali. 

