

// Java implementation of the above approach 
import java.util.*; 
  
class GFG{ 
      
// Function to find power of 
// a number. 
static int power(int a, int b) 
{ 
    int result = 1; 
    while (b > 0) { 
        if (b % 2 == 1) { 
            result = result * a; 
        } 
        a = a * a; 
        b = b / 2; 
    } 
    return result; 
} 
  
// Function to find 
// factorial of a number. 
static int factorial(int n) 
{ 
    int fact = 1; 
    for (int i = 1; i <= n; i++) { 
        fact = fact * i; 
    } 
    return fact; 
} 
  
// Function to print no of arrays 
static void findNoOfArrays(int[] a, int n) 
{ 
    // c variable counts the no of pairs 
    int sum = 0, s1, c = 0; 
  
    // Map to store the frequency 
    // of each element 
    HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();          
  
    for (int i = 0; i < 2 * n; i++) { 
        if(mp.get(a[i])==null) 
          mp.put(a[i], 1); 
        else
          mp.put(a[i], mp.get(a[i]) + 1); 
  
        // Sum of all elements of the array 
        sum = sum + a[i]; 
    } 
  
    // Variable to check if it is 
    // possible to make any array 
    boolean isArrayPossible = true; 
    int ans = factorial(n - 1); 
  
    // First element of suffix array 
    // and the last element of prefix array 
    s1 = sum / (n + 1); 
  
    // Check if the element exists in the map 
    if (mp.get(s1) >= 2) { 
        mp.replace(s1, mp.get(s1) - 2);  
    } 
    else { 
        isArrayPossible = false; 
    } 
    if (isArrayPossible) { 
        for (Map.Entry<Integer,Integer> m:mp.entrySet()) { 
  
            // If elements of any pair are equal 
            // and their frequency is not divisible by 2 
            // update the isArrayPossible variable 
            // to false and break through the loop 
  
            if (m.getKey() == s1-m.getKey()) { 
                if (mp.get(m.getKey()) % 2 != 0) { 
                    isArrayPossible = false; 
                    break; 
                } 
            } 
  
            // If elements of any pair are not equal 
            // and their frequency is not same 
            // update the isArrayPossible variable 
            // to false and break through the loop 
  
            if (m.getKey() != s1 - m.getKey()) { 
                if (mp.get(m.getKey()) 
                    != mp.get(s1 - m.getKey())) { 
                    isArrayPossible = false; 
                    break; 
                } 
            } 
            // Check if frequency is greater than zero 
            if (m.getValue() > 0) { 
                if (m.getKey() != s1 - m.getKey()) { 
                    // update the count of pairs 
  
                    c = c + m.getValue(); 
  
                    // Multiply the answer by 
                    // 2^(frequency of pairs) since 
                    // the elements of the pair are 
                    // not the same in this condition 
                    ans = ans * power(2, m.getValue()); 
  
                    // Divide the answer by the factorial 
                    // of no of similar pairs 
                    ans = ans / factorial(m.getValue()); 
  
                    // Make frequency of both these elements 0 
                    mp.replace(m.getKey(),0); 
                    mp.replace(s1 - m.getKey(),0); 
                } 
                if (m.getKey() == s1 - m.getKey()) { 
                    // Update the count of pairs 
  
                    c = c + m.getValue() / 2; 
  
                    // Divide the answer by the factorial 
                    // of no. of similar pairs 
                    ans = ans / factorial(m.getValue() / 2); 
  
                    // Make frequency of this element 0 
                    mp.replace(m.getKey(),0); 
                } 
            } 
        } 
    } 
  
    // Check if it is possible to make the 
    // array and there are n-1 pairs 
    // whose sum will be equal to s1 
    if (c < n - 1 && isArrayPossible == false) { 
        System.out.println("0"); 
    } 
    else { 
        System.out.println(ans); 
    } 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int[] arr1 = { 5, 2, 3, 5 }; 
    int n1 = arr1.length; 
  
    // Function calling 
    findNoOfArrays(arr1, n1 / 2); 
  
    int []arr2 = { -1, -1, -1, 0, 1, 0, 
                1, 0, 1, 0, 0, 0 }; 
    int n2 = arr2.length; 
    findNoOfArrays(arr2, n2 / 2); 
} 
} 
  
// This code is contributed by Surendra_Gangwar 

