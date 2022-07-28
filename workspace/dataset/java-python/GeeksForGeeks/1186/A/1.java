

// Java implementation of the approach  
public class GfG 
{ 
  
    // Function to return the minimum cost  
    static int minCost(int n, int arr[], int cost)  
    {  
        int sum = 0, totalCost = 0;  
      
        // Sum of all the array elements  
        // except the last element  
        for (int i = 0; i < n - 1; i++)  
            sum += arr[i];  
      
        // Cost of making all the array elements 0  
        // except the last element  
        totalCost += cost * sum;  
      
        // Update the last element  
        arr[n - 1] += sum;  
      
        // Cost of making the last element 0  
        totalCost += (2 * cost * arr[n - 1]);  
      
        return totalCost;  
    }  
  
    // Driver code  
    public static void main(String []args) 
    { 
          
        int arr[] = { 1, 2, 4, 5 };  
        int n = arr.length;  
        int cost = 1;  
        System.out.println(minCost(n, arr, cost)); 
    } 
} 
  
// This code is contributed by Rituraj Jain 

