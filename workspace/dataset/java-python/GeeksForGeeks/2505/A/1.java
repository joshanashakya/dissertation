

// Java program to find special 
// numbers in an array 
import java.io.*; 
import java.util.*; 
  
class GFG { 
    // Function to find 
    // special numbers 
    static void divisibilityCheck(List<Integer> arr, 
                                  int n) 
    { 
        // Storing all array elements 
        // in a hash and finding maximum 
        // element in array 
        List<Integer> s = new ArrayList<Integer>(); 
        int max_ele = Integer.MIN_VALUE; 
        for (int i = 0; i < n; i++) { 
            s.add(arr.get(i)); 
  
            // finding maximum 
            // element of array 
            max_ele = Math.max(max_ele, 
                               arr.get(i)); 
        } 
  
        // traversing array element and 
        // storing the array multiples 
        // that are present in s in res. 
        LinkedHashSet<Integer> res = new LinkedHashSet<Integer>(); 
        for (int i = 0; i < n; i++) { 
  
            // Check for non-zero values only 
            if (arr.get(i) != 0) 
  
                // checking the factor 
                // of current element 
                for (int j = arr.get(i) * 2; 
                     j <= max_ele; 
                     j += arr.get(i)) { 
  
                    // if factor is already 
                    // part of array element 
                    // then store it 
                    if (s.contains(j)) 
                        res.add(j); 
                } 
        } 
  
        // displaying elements that 
        // are divisible by at least 
        // one other in array 
        List<Integer> list = new ArrayList<Integer>(res); 
        Collections.reverse(list); 
  
        for (Integer temp : list) 
            System.out.print(temp + " "); 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
        List<Integer> arr = Arrays.asList(2, 3, 8, 6, 9, 10); 
        int n = arr.size(); 
        divisibilityCheck(arr, n); 
    } 
} 
  
// This code is contributed by 
// Manish Shaw(manishshaw1) 

