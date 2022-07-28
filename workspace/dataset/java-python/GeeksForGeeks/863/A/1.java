

// Java implementation to check whether product of 
// 'n' numbers is even or odd 
  
public class GFG { 
      
    // function to check whether product of 
    // 'n' numbers is even or odd 
    static boolean isProductEven(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
  
            // if a single even number is found, then 
            // final product will be an even number 
            if ((arr[i] & 1) == 0) 
                return true; 
  
        // product is an odd number 
        return false; 
    } 
  
  
    // Driver code 
    public static void main(String args[]) 
    { 
            int arr[] = { 2, 4, 3, 5 }; 
            int n = arr.length ; 
            if (isProductEven(arr, n)) 
                System.out.println("Even"); 
            else
                System.out.println("Odd") ;       
    } 
    // This Code is contributed by ANKITRAI1 
} 

