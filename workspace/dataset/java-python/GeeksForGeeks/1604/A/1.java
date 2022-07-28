

//Java program to find maximum cost after 
//deleting all the elements form the array 
  
public class GFG { 
      
    //function to return maximum cost obtained 
    static int maxCost(int a[], int n, int l, int r) 
    { 
  
     int mx = 0, k; 
     // find maximum element of the array. 
     for (int i = 0; i < n; ++i) 
         mx = Math.max(mx, a[i]); 
  
     // initialize count of all elements to zero. 
     int[] count = new int[mx + 1]; 
     for(int i = 0; i < count.length; i++) 
         count[i] = 0; 
  
     // calculate frequency of all elements of array. 
     for (int i = 0; i < n; i++) 
         count[a[i]]++; 
  
     // stores cost of deleted elements. 
     int[] res = new int[mx + 1]; 
     res[0] = 0; 
  
     // selecting minimum range from L and R. 
     l = Math.min(l, r); 
  
     for (int num = 1; num <= mx; num++) { 
  
         // finds upto which elements are to be 
         // deleted when element num is selected. 
         k = Math.max(num - l - 1, 0); 
  
         // get maximum when selecting element num or not. 
         res[num] = Math.max(res[num - 1], num * count[num] + res[k]); 
     } 
  
     return res[mx]; 
    } 
  
    //Driver program 
    public static void main(String[] args) { 
          
        int a[] = { 2, 1, 2, 3, 2, 2, 1 }, l = 1, r = 1; 
  
         // size of array 
         int n = a.length; 
  
         // function call to find maximum cost 
         System.out.println(maxCost(a, n, l, r)); 
    } 
} 

