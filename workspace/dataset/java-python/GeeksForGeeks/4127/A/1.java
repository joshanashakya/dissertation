

//Java program to find Equal point in a sorted array 
// which may have many duplicates. 
  
class Test 
{ 
    // Returns value of Equal point in a sorted array arr[] 
    // It returns -1 if there is no Equal Point. 
    static int findEqualPoint(int arr[], int n) 
    { 
         // To store first indexes of distinct elements of arr[] 
         int distArr[] = new int[n]; 
       
         // Traverse input array and store indexes of first 
         // occurrences of distinct elements in distArr[] 
         int i = 0, di = 0; 
         while (i < n) 
         { 
            // This element must be first occurrence of a 
            // number (this is made sure by below loop), 
            // so add it to distinct array. 
            distArr[di++] = i++; 
       
            // Avoid all copies of arr[i] and move to next 
            // distinct element. 
            while (i<n && arr[i] == arr[i-1]) 
                 i++; 
         } 
       
         // di now has total number of distinct elements. 
         // If di is odd, then equal point exists and is at 
         // di/2, otherwise return -1. 
         return (di & 1)!=0 ? distArr[di>>1] : -1; 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        int arr[] = {1, 2, 3, 4, 4, 5, 6, 6, 6, 7}; 
          
        int index = findEqualPoint(arr, arr.length); 
        System.out.println(index != -1 ? "Equal Point = " + arr[index]  
                            : "Equal Point does not exists"); 
    } 
} 

