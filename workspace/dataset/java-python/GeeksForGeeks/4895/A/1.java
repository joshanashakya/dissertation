

//Java program to find the lower insertion point 
//of an element in a sorted array 
public class AQES { 
  
    //Function to return the lower insertion point 
    //of an element in a sorted array 
    static int LowerInsertionPoint(int arr[], int n, int X) 
    { 
  
     // Base cases 
     if (X < arr[0]) 
         return 0; 
     else if (X > arr[n - 1]) 
         return n; 
  
     int lowerPnt = 0; 
     int i = 1; 
  
     while (i < n && arr[i] < X) { 
         lowerPnt = i; 
         i = i * 2; 
     } 
  
     // Final check for the remaining elements which are < X 
     while (lowerPnt < n && arr[lowerPnt] < X) 
         lowerPnt++; 
  
     return lowerPnt; 
    } 
  
    //Driver code 
    public static void main(String[] args) { 
          
         int arr[] = { 2, 3, 4, 4, 5, 6, 7, 9 }; 
         int n = arr.length; 
         int X = 4; 
         System.out.println(LowerInsertionPoint(arr, n, X)); 
  
    } 
} 

