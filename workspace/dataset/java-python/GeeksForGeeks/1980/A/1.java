

// Java program to find one of the repeating  
// elements in a read only array  
import java.io.*; 
import java.util.*; 
  
class GFG 
{ 
  
    // Function to find one of the repeating  
    // elements  
    static int findRepeatingNumber(int[] arr, int n) 
    { 
        // Size of blocks except the  
        // last block is sq  
        int sq = (int) Math.sqrt(n); 
  
        // Number of blocks to incorporate 1 to  
        // n values blocks are numbered from 0  
        // to range-1 (both included)  
        int range = (n / sq) + 1; 
  
        // Count array maintains the count for  
        // all blocks  
        int[] count = new int[range]; 
  
        // Traversing the read only array and  
        // updating count  
        for (int i = 0; i <= n; i++) 
        { 
            // arr[i] belongs to block number  
            // (arr[i]-1)/sq i is considered  
            // to start from 0  
            count[(arr[i] - 1) / sq]++; 
        } 
  
        // The selected_block is set to last  
        // block by default. Rest of the blocks  
        // are checked  
        int selected_block = range - 1; 
        for (int i = 0; i < range - 1; i++)  
        {  
            if (count[i] > sq)  
            {  
                selected_block = i;  
                break;  
            }  
        } 
  
        // after finding block with size > sq  
        // method of hashing is used to find  
        // the element repeating in this block  
        HashMap<Integer, Integer> m = new HashMap<>(); 
        for (int i = 0; i <= n; i++) 
        { 
            // checks if the element belongs to the  
            // selected_block  
            if ( ((selected_block * sq) < arr[i]) &&  
                    (arr[i] <= ((selected_block + 1) * sq)))  
            {  
                m.put(arr[i], 1); 
  
                // repeating element found 
                if (m.get(arr[i]) == 1)  
                    return arr[i];  
            }  
        } 
  
        // return -1 if no repeating element exists  
        return -1;  
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    // read only array, not to be modified  
    int[] arr = { 1, 1, 2, 3, 5, 4 }; 
  
    // array of size 6(n + 1) having  
    // elements between 1 and 5  
    int n = 5; 
  
    System.out.println("One of the numbers repeated in the array is: " +  
                                    findRepeatingNumber(arr, n)); 
} 
} 
  
// This code is contributed by rachana soma 

