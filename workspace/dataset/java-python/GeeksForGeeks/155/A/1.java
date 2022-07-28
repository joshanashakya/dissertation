

// Java implementation of above approach 
import java.util.*; 
  
class GFG { 
  
    // Function to find the largest 
    // integer with the given set 
    static int findLargest(int n, Vector<Integer> v) 
    { 
  
        int flag = 0; 
        long sum = 0; 
  
        // find sum of all the digits 
        // look if any 0 is present or not 
        for (int i = 0; i < n; i++) { 
            if (v.get(i) == 0) 
                flag = 1; 
            sum += v.get(i); 
        } 
  
        // if 0 is not present, the resultant number 
        // won't be divisible by 5 
        if (flag != 1) 
            System.out.println("Not possible"); 
  
        else { 
            // sort all the elements in a non-decreasing manner 
            Collections.sort(v, Collections.reverseOrder()); 
  
            // if there is just one element 0 
            if (v.get(0) == 0) { 
                System.out.println("0"); 
                return 0; 
            } 
            else { 
                int flags = 0; 
  
                // find the remainder of the sum 
                // of digits when divided by 3 
                int y = (int)(sum % 3); 
  
                // there can a remainder as 1 or 2 
                if (y != 0) { 
  
                    // traverse from the end of the digits 
                    for (int i = n - 1; i >= 0; i--) { 
  
                        // first element which has the same remainder 
                        // remove it 
                        if (v.get(i) % 3 == y) { 
                            v.remove(i); 
                            flags = 1; 
                            break; 
                        } 
                    } 
  
                    // if there is no element which 
                    // has a same remainder as y 
                    if (flags == 0) { 
  
                        // subtract it by 3 ( could be one or two) 
                        y = 3 - y; 
  
                        int cnt = 0; 
                        for (int i = n - 1; i >= 0; i--) { 
  
                            // delete two minimal digits 
                            // which has a remainder as y 
                            if (v.get(i) % 3 == y) { 
                                v.remove(i); 
                                cnt++; 
  
                                if (cnt >= 2) 
                                    break; 
                            } 
                        } 
                    } 
                } 
                if (v.get(0) == 0) 
                    System.out.println("0"); 
  
                // print all the digits as a single integer 
                else
                    for (Integer i : v) { 
                        System.out.print(i); 
                    } 
            } 
        } 
        return Integer.MIN_VALUE; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        // initialize the number of set of digits 
        int arr[] = { 3, 9, 9, 6, 4, 3, 6, 4, 9, 6, 0 }; 
        int n = 11; 
  
        Vector<Integer> v = new Vector<Integer>(); 
  
        // initialize all the set of digits in a vector 
        for (int i = 0; i < n; i++) 
            v.add(i, arr[i]); 
  
        findLargest(n, v); 
    } 
} 
  
// This code contributed by Rajput-Ji 

