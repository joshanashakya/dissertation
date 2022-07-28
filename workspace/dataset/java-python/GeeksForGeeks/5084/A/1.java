

//Java program to find maximum sum 
//pair from two arrays 
public class AAB { 
  
    //Function to find maximum sum 
    //pair from two arrays 
    static int maxSumPair(int arr1[], int n1, int arr2[], int n2) 
    { 
     int max1 = Integer.MIN_VALUE; // max from 1st array 
     int max2 = Integer.MIN_VALUE; // max from 2nd array 
  
     // Find max from 1st array 
     for (int i = 0; i < n1; i++) { 
         if (arr1[i] > max1) 
             max1 = arr1[i]; 
     } 
  
     // Find max from 2nd array 
     for (int i = 0; i < n2; i++) { 
         if (arr2[i] > max2) 
             max2 = arr2[i]; 
     } 
  
     // Return sum of max from both arrays 
     return max1 + max2; 
    } 
  
    //Driver Code 
    public static void main(String[] args) { 
          
        int arr1[] = { 10, 2, 3 }; 
  
         int arr2[] = { 3, 4, 7 }; 
  
         int n1 = arr1.length; 
  
         int n2 = arr2.length; 
  
         System.out.println(maxSumPair(arr1, n1, arr2, n2)); 
  
    } 
  
} 

