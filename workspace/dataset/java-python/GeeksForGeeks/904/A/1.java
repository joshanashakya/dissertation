

// Java program to count pairs (i, j)  
// such that arr[i] * arr[j] > arr[i] + arr[j]  
  
class GFG  
{ 
    // Function to return the count of pairs  
    // such that arr[i] * arr[j] > arr[i] + arr[j]  
    static long countPairs(int[] arr, int n)  
    { 
        int count_2 = 0, count_others = 0; 
        for (int i = 0; i < n; i++)  
        { 
            if (arr[i] == 2)  
            { 
                count_2++; 
            }  
            else if (arr[i] > 2)  
            { 
                count_others++; 
            } 
        } 
          
        long ans = 1L * count_2 * count_others + 
                (1L * count_others * (count_others - 1)) / 2; 
        return ans; 
    } 
  
    // Driver code  
    public static void main(String[] args)  
    { 
        int arr[] = {5, 0, 3, 1, 2}; 
        int n = arr.length; 
        System.out.println(countPairs(arr, n)); 
    } 
} 
  
// This code is contributed by  
// 29AjayKumar  

