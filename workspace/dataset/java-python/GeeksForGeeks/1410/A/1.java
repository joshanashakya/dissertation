

// Java program to find a unique pair  
// in an array of pairs. 
class GFG 
{ 
    static void findUniquePair(int[] arr, int n) 
    { 
        // XOR each element and get XOR of two 
        // unique elements(ans) 
        int XOR = arr[0]; 
          
        for (int i = 1; i < n; i++)  
            XOR = XOR ^ arr[i]; 
  
        // Now XOR has XOR of two missing elements. 
        // Any set bit in it must be set in one  
        // missing and unset in other missing number 
  
        // Get a set bit of XOR (We get the  
        // rightmost set bit) 
        int set_bit_no = XOR & ~(XOR-1); 
  
        // Now divide elements in two sets by  
        // comparing rightmost set bit of XOR with  
        // bit at same position in each element. 
        // Initialize missing numbers 
        int x = 0, y = 0;  
          
        for (int i = 0; i < n; i++) 
        { 
            if ((arr[i] & set_bit_no)>0) 
              
                /*XOR of first set in arr[] */
                x = x ^ arr[i];  
            else
                /*XOR of second set in arr[] */
                y = y ^ arr[i];  
        } 
  
        System.out.println("The unique pair is (" +  
                               x + "," + y + ")"); 
  
    } 
  
    // Driver code 
    public static void main (String[] args) { 
    int[] a = { 6, 1, 3, 5, 1, 3, 7, 6 }; 
    int n = a.length; 
    findUniquePair(a, n);  
    } 
  
} 
  
/* This code is contributed by Mr. Somesh Awasthi */

