

// Java program to find the number  
// of consecutive zero at the end 
// after multiplying n numbers 
  
public class GfG{ 
  
    // Function to count two's factor 
    static int two_factor(int n)  
    {      
        // Count number of 2s 
        // present in n 
        int twocount = 0; 
        while (n % 2 == 0)  
        { 
            twocount++;  
            n = n / 2;  
        } 
        return twocount; 
    } 
  
    // Function to count five's 
    // factor 
    static int five_factor(int n)  
    { 
        int fivecount = 0; 
        while (n % 5 == 0)  
        { 
            fivecount++;  
            n = n / 5;  
        } 
        return fivecount; 
    } 
  
    // Function to count number of zeros 
    static int find_con_zero(int arr[], int n) 
    { 
        int twocount = 0; 
        int fivecount = 0;   
          
        for (int i = 0; i < n; i++) {    
  
            // Count the two's factor 
            // of n number 
            twocount += two_factor(arr[i]);  
  
            // Count the five's factor  
            // of n number 
            fivecount += five_factor(arr[i]); 
        } 
  
        // Return the minimum 
        if (twocount < fivecount)  
            return twocount;  
        else
            return fivecount; 
    } 
      
    // driver function 
    public static void main(String s[]) 
    { 
        int arr[] = { 100, 10, 5, 25, 35, 14 }; 
        int n = 6; 
        System.out.println(find_con_zero(arr, n));      
    } 
} 
  
// This code is contributed by Gitanjali 

