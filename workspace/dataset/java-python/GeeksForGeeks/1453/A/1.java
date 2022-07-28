

// Java program to count of multiples 
// in an Array before every element 
import java.util.*; 
  
class GFG{ 
   
// Function to find all factors of N 
// and keep their count in map 
static void add_factors(int n, 
                 HashMap<Integer,Integer> mp) 
{ 
    // Traverse from 1 to Math.sqrt(N) 
    // if i divides N, 
    // increment i and N/i in map 
    for (int i = 1; i <= (Math.sqrt(n)); i++) { 
        if (n % i == 0) { 
            if (n / i == i) { 
                if(mp.containsKey(i)) 
                    mp.put(i, mp.get(i) + 1); 
                else
                    mp.put(i, 1); 
            } 
            else { 
                if(mp.containsKey(i)) 
                    mp.put(i, mp.get(i) + 1); 
                else
                    mp.put(i, 1); 
                if(mp.containsKey(n / i)) 
                    mp.put(n / i, mp.get(n / i) + 1); 
                else
                    mp.put(n / i, 1); 
            } 
        } 
    } 
} 
   
// Function to count of multiples 
// in an Array before every element 
static void count_divisors(int a[], int n) 
{ 
   
    // To store factors all of all numbers 
    HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>(); 
   
    // Traverse for all possible i's 
    for (int i = 0; i < n; i++) { 
        // Printing value of a[i] in map 
        System.out.print(mp.get(a[i]) == null ? 0 + " " : mp.get(a[i]) + " "); 
   
        // Now updating the factors 
        // of a[i] in the map 
        add_factors(a[i], mp); 
    } 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 8, 1, 28, 4, 2, 6, 7 }; 
    int n = arr.length; 
   
    // Function call 
    count_divisors(arr, n); 
   
} 
} 
  
// This code is contributed by 29AjayKumar 

