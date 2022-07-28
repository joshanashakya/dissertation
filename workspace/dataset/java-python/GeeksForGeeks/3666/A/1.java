

//  Java implementation of finding all k 
// such that arr[i]%k is same for each i 
  
import java.util.Arrays; 
import java.util.Vector; 
  
class Test 
{ 
    // Prints all k such that arr[i]%k is same for all i 
    static void printEqualModNumbers (int arr[], int n) 
    { 
        // sort the numbers 
        Arrays.sort(arr); 
       
        // max difference will be the difference between 
        // first and last element of sorted array 
        int d = arr[n-1] - arr[0]; 
        // Case when all the array elements are same 
        if(d==0){ 
            System.out.println("Infinite solution"); 
            return; 
        } 
        // Find all divisors of d and store in 
        // a vector v[] 
        Vector<Integer> v = new Vector<>(); 
        for (int i=1; i*i<=d; i++) 
        { 
            if (d%i == 0) 
            { 
                v.add(i); 
                if (i != d/i) 
                    v.add(d/i); 
            } 
        } 
       
        // check for each v[i] if its modulus with 
        // each array element is same or not 
        for (int i=0; i<v.size(); i++) 
        { 
            int temp = arr[0]%v.get(i); 
       
            // checking for each array element if 
            // its modulus with k is equal to k or not 
            int j; 
            for (j=1; j<n; j++) 
                if (arr[j] % v.get(i) != temp) 
                    break; 
       
            // if check is true print v[i] 
            if (j == n) 
                System.out.print(v.get(i) + " "); 
        } 
    } 
      
    // Driver method 
    public static void main(String args[]) 
    { 
        int arr[] = {38, 6, 34}; 
          
        printEqualModNumbers(arr, arr.length); 
    } 
} 

