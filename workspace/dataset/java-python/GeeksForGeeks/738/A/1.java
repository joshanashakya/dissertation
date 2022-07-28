

// Java implementation  
// to generate the  
// required array 
import java.io.*; 
import java.util.*; 
  
class GFG 
{ 
// Function to return 
// gcd of a and b 
static int gcd(int a, 
               int b) 
{ 
    if (a == 0) 
    return b;      
    return gcd(b % a, a); 
} 
  
// Function to find gcd  
// of array of numbers 
public static int findGCD(ArrayList<Integer>  
                                 arr, int n) 
{ 
    int result = arr.get(0);  
    for (int i = 1; i < n; i++) 
        result = gcd(arr.get(i),  
                    result); 
    return result; 
} 
  
// Function to generate  
// the array with required  
// constraints. 
public static void compute(ArrayList<Integer> 
                                  arr, int n) 
{ 
    ArrayList<Integer> answer =  
                    new ArrayList<Integer>(); 
      
    // computing GCD of 
    // the given set 
    int GCD_of_array = findGCD(arr, n); 
  
    // Solution exists if GCD 
    // of array is equal to the  
    // minimum element of the array 
    if(GCD_of_array == arr.get(0)) 
    { 
        answer.add(arr.get(0)); 
        for(int i = 1; i < n; i++) 
        { 
            answer.add(arr.get(0)); 
            answer.add(arr.get(i)); 
        } 
      
        // Printing the  
        // built array 
        for (int i = 0;  
                 i < answer.size(); i++) 
            System.out.print(answer.get(i) + " "); 
    } 
    else
        System.out.print("No array " + 
                      "can be build"); 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
  
    // Taking in the input and  
    // initializing the set STL 
    // set in cpp has a property 
    // that it maintains the  
    // elements in sorted order,  
    // thus we do not need to  
    // sort them externally 
    int n = 3; 
    Integer input[]= {2, 5, 6, 7, 11}; 
    HashSet<Integer> GCD = new HashSet<Integer> 
                        (Arrays.asList(input)); 
    ArrayList<Integer> arr =  
                new ArrayList<Integer>(); 
      
    for (int v : GCD) 
        arr.add(v); 
  
    // Calling the 
    // computing function. 
    compute(arr, n); 
} 
} 
  
// This code is contributed by 
// Manish Shaw(manishshaw1) 

