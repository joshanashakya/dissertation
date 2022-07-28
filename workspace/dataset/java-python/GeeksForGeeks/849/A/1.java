

// Java implemenattion of the above approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to organize the given numbers 
// to form a valid sequence. 
static int[] orgazineInOrder(int []vec,int[] op, int n) 
{ 
    int []result = new int[n]; 
      
    // Sorting the array 
    Arrays.sort(vec); 
  
    int i = 0, j = n - 1, k = 0; 
    while (i <= j && k <= n - 2)  
    { 
        // Two pointer technique 
        // to organize the numbers 
        if (op[k] == '<')  
        { 
            result[k] = vec[i++]; 
        } 
        else
        { 
            result[k] = vec[j--]; 
        } 
        k++; 
    } 
    result[n - 1] = vec[i]; 
  
    return result; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int []vec ={ 8, 2, 7, 1, 5, 9 }; 
  
    int[] op ={ '>', '>', '<', 
                    '>', '<' }; 
  
    int []result = orgazineInOrder(vec, 
                        op, vec.length); 
  
    for (int i = 0; i < result.length; i++)  
    { 
        System.out.print(result[i]+ " "); 
    } 
} 
} 
  
// This code is contributed by 29AjayKumar 

