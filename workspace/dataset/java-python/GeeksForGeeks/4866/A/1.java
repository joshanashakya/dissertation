

// Java Program to separately sort 
// even-placed and odd placed numbers 
// and place them together in sorted 
// array. 
import java.util.*; 
  
class GFG { 
  
    static void bitonicGenerator(int arr[], int n) 
    { 
        // create evenArr[] and oddArr[] 
        Vector<Integer> evenArr = new Vector<Integer>(); 
        Vector<Integer> oddArr = new Vector<Integer>(); 
  
        // Put elements in oddArr[] and evenArr[] as 
        // per their position 
        for (int i = 0; i < n; i++) { 
            if (i % 2 != 1) { 
                evenArr.add(arr[i]); 
            } 
            else { 
                oddArr.add(arr[i]); 
            } 
        } 
  
        // sort evenArr[] in ascending order 
        // sort oddArr[] in descending order 
        Collections.sort(evenArr); 
        Collections.sort(oddArr, Collections.reverseOrder()); 
  
        int i = 0; 
        for (int j = 0; j < evenArr.size(); j++) { 
            arr[i++] = evenArr.get(j); 
        } 
        for (int j = 0; j < oddArr.size(); j++) { 
            arr[i++] = oddArr.get(j); 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = { 1, 5, 8, 9, 6, 7, 3, 4, 2, 0 }; 
        int n = arr.length; 
        bitonicGenerator(arr, n); 
        for (int i = 0; i < n; i++) { 
            System.out.print(arr[i] + " "); 
        } 
    } 
} 
  
/* This code contributed by PrinciRaj1992 */

