

// Java implementation of above approach  
  
class GFG { 
  
// Function to find total number of subsets  
// in which product of the elements is even  
    static void find(int a[], int n) { 
        int count_odd = 0; 
  
        for (int i = 0; i < n; i++) { 
            // counting number of odds elements  
            if (i % 2 != 0) { 
                count_odd += 1; 
            } 
        } 
  
        int result = (int) (Math.pow(2, n) - 1); 
        result -= (Math.pow(2, count_odd) - 1); 
        System.out.println(result); 
  
    } 
  
// Driver code  
    public static void main(String[] args) { 
        int a[] = {2, 2, 3}; 
        int n = a.length; 
  
// function calling  
        find(a, n); 
  
    } 
} 
//this code contributed by 29AJayKumar 

