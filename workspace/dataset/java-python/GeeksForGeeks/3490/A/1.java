

// Java program to sort an array such that  
// sum of product of alternate element  
// is minimum.  
  
import java.util.Arrays; 
import java.util.Collections; 
import java.util.Comparator; 
import java.util.Vector; 
  
class GFG { 
  
    static int minSum(int arr[], int n) { 
        // create evenArr[] and oddArr[]  
        Vector<Integer> evenArr = new Vector<>(); 
        Vector<Integer> oddArr = new Vector<>(); 
  
        // sort main array in ascending order  
        Arrays.sort(arr); 
  
        // Put elements in oddArr[] and evenArr[]  
        // as per desired value.  
        for (int i = 0; i < n; i++) { 
            if (i < n / 2) { 
                oddArr.add(arr[i]); 
            } else { 
                evenArr.add(arr[i]); 
            } 
        } 
  
        // sort evenArr[] in descending order 
        Comparator comparator = Collections.reverseOrder(); 
        Collections.sort(evenArr,comparator); 
  
        // merge both sub-array and  
        // calculate minimum sum of  
        // product of alternate elements  
        int i = 0, sum = 0; 
        for (int j = 0; j < evenArr.size(); j++) { 
            arr[i++] = evenArr.get(j); 
            arr[i++] = oddArr.get(j); 
            sum += evenArr.get(j) * oddArr.get(j); 
        } 
  
        return sum; 
    } 
  
// Driver program  
    public static void main(String[] args) { 
  
        int arr[] = {1, 5, 8, 9, 6, 7, 3, 4, 2, 0}; 
        int n = arr.length; 
        System.out.println("Minimum required sum = " 
                                  + minSum(arr, n)); 
        System.out.println("Sorted array in required format : "); 
        for (int i = 0; i < n; i++) { 
            System.out.print(arr[i] + " "); 
        } 
  
    } 
  
} 

