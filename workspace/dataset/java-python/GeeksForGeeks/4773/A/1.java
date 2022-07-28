

// Java code to find majority element in a 
// sorted array 
public class Test { 
  
    public static int findMajority(int arr[], int n) 
    { 
        return arr[n / 2]; 
    } 
    public static void main(String args[]) 
    { 
        int arr[] = { 1, 2, 2, 3 }; 
        int n = arr.length; 
        System.out.println(findMajority(arr, n)); 
    } 
} 

