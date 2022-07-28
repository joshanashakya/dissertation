

// Java implementation of find number 
// of elements x in this array 
// such x+k also present in this array. 
import java.util.*; 
  
class GFG{ 
   
// Function to return the 
// count of element x such that 
// x+k also lies in this array 
static int count_element(int N, int K, int[] arr) 
{ 
    // Key in map will store elements 
    // and value will store the 
    // frequency of the elements 
    HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>(); 
   
    for (int i = 0; i < N; ++i) 
        if(mp.containsKey(arr[i])){ 
            mp.put(arr[i], mp.get(arr[i])+1); 
        }else{ 
            mp.put(arr[i], 1); 
    } 
   
    int answer = 0; 
   
    for (Map.Entry<Integer,Integer> i : mp.entrySet()) { 
   
        // Find if i.first + K is 
        // present in this map or not 
        if (mp.containsKey(i.getKey() + K) ) 
   
            // If we find i.first or key + K in this map 
            // then we have to increase in answer 
            // the frequency of this element 
            answer += i.getValue(); 
    } 
   
    return answer; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    // array initialisation 
    int arr[] = { 3, 6, 2, 8, 7, 6, 5, 9 }; 
   
    // size of array 
    int N = arr.length; 
   
    // initialise k 
    int K = 2; 
   
    System.out.print(count_element(N, K, arr)); 
} 
} 
  
// This code is contributed by Princi Singh 

