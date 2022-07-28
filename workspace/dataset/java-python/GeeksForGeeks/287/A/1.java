

// Java Program to find whether half-array  
// reducible to 0 
  
public class GFG { 
  
    // Function to print the desired  
    // result after computation 
    static void isHalfReducible(int arr[], int n, int m) 
    { 
        int frequencyHash[] = new int[m + 1]; 
        int i; 
  
        for(i = 0 ; i < frequencyHash.length ; i++) 
            frequencyHash[i] = 0 ; 
         
        for (i = 0; i < n; i++) { 
            frequencyHash[arr[i] % (m + 1)]++; 
        } 
  
        for (i = 0; i <= m; i++) { 
            if (frequencyHash[i] >= n / 2) 
                break; 
        } 
  
        if (i <= m) 
            System.out.println("Yes") ; 
        else
            System.out.println("No") ; 
    } 
  
// Driver code 
    public static void main(String args[]) 
    { 
            int arr[] = { 8, 16, 32, 3, 12 }; 
            int n = arr.length ; 
  
            int m = 7; 
  
            isHalfReducible(arr, n, m); 
  
    } 
    // This code is contributed by ANKITRAI1 
} 
  

