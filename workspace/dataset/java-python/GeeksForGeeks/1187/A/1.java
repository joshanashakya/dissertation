

// Java program to find minimum  
// number of operations required  
// to make all array elements zero  
  
class GFG  
{ 
  
// Function to find minimum number  
// of operations required to make   
// all array elements zero  
static int minimumChanges(int arr[],  
                          int n)  
{  
    int i;  
      
    // It will maintain total 
    // changes required  
    int changes = 0;  
      
    for (i = 0; i < n; i++)  
    {  
        // Check for the first 1  
        if (arr[i] == 1)  
        {  
            int j;  
              
            // Check for number of  
            // consecutive 1's  
            for(j = i + 1; j < n; j++)  
            {  
                if(arr[j] == 0)  
                    break;  
            }  
              
            // Increment i to the position   
            // of last consecutive 1  
            i = j - 1;  
              
            changes++;  
        }  
    }  
      
    return changes;  
}  
  
// Driver code  
public static void main (String args[]) 
{ 
    int arr[] = { 1, 1, 0, 0, 0,  
                     1, 0, 1, 1 };  
    int n = arr.length ; 
      
    System.out.println("Minimum operations: " +  
                        minimumChanges(arr, n));  
      
} 
} 
  
// This code is contributed by ANKITRAI1 

