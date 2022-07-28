

// Java program to find the two numbers 
// when divisors are given in a random order 
  
import java.util.*; 
  
class GFG{ 
   
// Function to get the two numbers 
static void getNumbers(int a[], int n) 
{ 
   
    // Mark the frequency of all elements 
    HashMap<Integer,Integer> freq = new HashMap<Integer,Integer>(); 
    for (int i = 0; i < n; i++) 
        if(freq.containsKey(a[i])){ 
            freq.put(a[i], freq.get(a[i])+1); 
        } 
        else{ 
            freq.put(a[i], 1); 
        } 
   
    // Get the first maximum element 
    int maxi1 = Arrays.stream(a).max().getAsInt(); 
   
    // Decrease the frequency of all divisors 
    // of the maximum number that are present 
    // int a[] 
    for (int i = 1; i * i <= maxi1; i++) { 
   
        if (maxi1 % i == 0 &&  
            freq.containsKey(i)&&  
            freq.get(i)!= 0) { 
            freq.put(i, freq.get(i)- 1); 
   
            if (i != (maxi1 / i) &&  
               freq.containsKey(maxi1 / i) &&  
               freq.get(maxi1 / i)!= 0) 
                freq.put(maxi1 / i, freq.get(maxi1 / i) - 1); 
        } 
    } 
   
    // The second number is the largest number 
    // present in remaining numbers. 
    int maxi2 = -1; 
    for (int i = 0; i < n; i++) { 
        if (freq.get(a[i]) != 0) 
            maxi2 = Math.max(maxi2, a[i]); 
    } 
   
    System.out.print(maxi1+ " " +  maxi2); 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    int a[] = { 10, 2, 8, 1, 2, 4, 1, 20, 4, 5 }; 
    int n = a.length; 
    getNumbers(a, n); 
} 
} 
  
// This code contributed by Rajput-Ji 

