

// Java program to check if the array 
// with odd sum is possible 
class GFG { 
      
    // Function to check if the 
    // sum of the array can be made odd. 
    static boolean isOdd(int []arr, int n) 
    { 
        int l, r, flag = 0, flag1 = 0, sum = 0; 
      
        // Find sum of all elements and increment 
        // check for odd or even elements in the array 
        // so that by changing ai=aj, 
        // the sum of the array can be made odd 
        for (int i = 0; i < n; i++) { 
            sum += arr[i]; 
            if (arr[i] % 2 == 0 && flag == 0) { 
                flag = 1; 
                l = arr[i]; 
            } 
            if (arr[i] % 2 != 0 && flag1 == 0) { 
                r = arr[i]; 
                flag1 = 1; 
            } 
        } 
      
        // If the sum is already odd 
        if (sum % 2 != 0) { 
            return true; 
        } 
      
        // Else, then both the flags should be checked. 
        // Here, flag1 and flag represent if there is 
        // an odd-even pair which can be replaced. 
        else { 
            if (flag1 == 1 && flag == 1) 
                return true; 
            else
                return false; 
        } 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        int ar[] = { 5, 4, 4, 5, 1, 3 }; 
        int n = ar.length; 
        boolean res = isOdd(ar, n); 
      
        if (res == true) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
  
    } 
} 
  
// This code is contributed by AnkitRai01 

