

// Java program to print all  
// distinct integers that can  
// be formed by K numbers from 
// a given array of N numbers. 
import java.util.*; 
import java.lang.*; 
  
class GFG 
{ 
    // stores all the distinct  
    // integers formed 
    static TreeSet<Integer> set =  
                   new TreeSet<Integer>(); 
      
    // Function to generate  
    // all possible numbers 
    public static void generateNumber(int count, int a[],  
                                      int n, int num, int k) 
    { 
        // Base case when K  
        // elements are chosen 
        if(count == k) 
        { 
            set.add(num); 
            return; 
        } 
          
        // Choose every element  
        // and call the function 
        for(int i = 0; i < n; i++) 
        generateNumber(count + 1, a, n, 
                       num + a[i], k); 
    } 
      
    // Function to print  
    // the distinct integers 
    public static void printDistinctIntegers(int k,  
                                             int a[], int n) 
    { 
        generateNumber(0, a, n, 0, k); 
        System.out.print("The" + " " + set.size() +  
                         " " + "distinct integers are: "); 
        System.out.println(); 
        Iterator<Integer> i = set.iterator(); 
          
        // prints all the 
        // elements in the set 
        while(set.isEmpty() == false) 
        { 
              
            while(i.hasNext()) 
            { 
                System.out.print(i.next() + " "); 
                //set.remove(i.next()); 
            }    
        } 
    } 
      
    // Driver Code 
    public static void main (String[] args)  
    { 
        int arr[] = {3, 8, 17, 5}; 
        int n = arr.length; 
        int k = 2; 
          
        // Calling Function 
        printDistinctIntegers(k, arr, n); 
    } 
} 

