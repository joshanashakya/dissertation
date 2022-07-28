

// Java implementation of the approach  
import java.util.Vector; 
  
class GFG  
{ 
  
    // Pair class implementation to use Pair 
    static class Pair 
    { 
        private int first; 
        private int second; 
  
        Pair(int first, int second)  
        { 
            this.first = first; 
            this.second = second; 
        } 
  
        public int getFirst()  
        { 
            return first; 
        } 
  
        public int getSecond() 
        { 
            return second; 
        } 
    } 
  
    // Function to return the Kth element in B[] 
    static int solve(int[] Array, int N, int K) 
    { 
  
        // Initialize the count Array 
        int[] count_Arr = new int[N + 2]; 
        int factor = 1; 
        int size = N; 
  
        // Reduce N repeatedly to half its value 
        while (size > 0)  
        { 
            int start = 1; 
            int end = size; 
  
            // Add count to start 
            count_Arr[1] += factor * N; 
  
            // Subtract same count after end index 
            count_Arr[end + 1] -= factor * N; 
            factor++; 
            size /= 2; 
        } 
  
        for (int i = 2; i <= N; i++) 
            count_Arr[i] += count_Arr[i - 1]; 
  
        // Store each element of Array[] 
        // with their count 
        Vector<Pair> element = new Vector<>(); 
        for (int i = 0; i < N; i++)  
        { 
            Pair x = new Pair(Array[i],  
                              count_Arr[i + 1]); 
            element.add(x); 
        } 
  
        int start = 1; 
        for (int i = 0; i < N; i++)  
        { 
            int end = start + element.elementAt(0).getSecond() - 1; 
  
            // If Kth element is in range of element[i] 
            // return element[i] 
            if (K >= start && K <= end) 
                return element.elementAt(i).getFirst(); 
  
            start += element.elementAt(i).getSecond(); 
        } 
  
        // If K is out of bound 
        return -1; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int[] arr = { 2, 4, 5, 1 }; 
        int N = arr.length; 
        int K = 13; 
        System.out.println(solve(arr, N, K)); 
    } 
}     
  
// This code is contiributed by 
// sanjeev2552 

