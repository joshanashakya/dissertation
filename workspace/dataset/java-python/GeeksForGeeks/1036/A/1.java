

// Java program to find four factors of N 
// with maximum product and sum equal to N 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG 
{ 
      
// Function to find factors 
// and to print those four factors 
static void findfactors(int n) 
{ 
    HashMap<Integer, 
            Integer> mpp = new HashMap<>(); 
  
    Vector<Integer> v = new Vector<Integer>(), 
                   v1 = new Vector<Integer>(); 
  
    // push all the factors in the container 
    for (int i = 1; i <= (int)Math.sqrt(n); i++)  
    { 
        if (n % i == 0) 
        { 
            v.add(i); 
            if (i != (n / i) && i != 1) 
                v.add(n / i); 
        } 
    } 
  
    // number of factors 
    int s = v.size(); 
  
    // Initial maximum 
    int maxi = -1; 
  
    // hash-array to mark the 
    // pairs 
    int mp1_first[] = new int[n + 5],  
        mp1_second[] = new int[n + 5]; 
  
    for (int i = 0; i < s; i++) 
    { 
  
        // form all the pair sums 
        for (int j = i; j < s; j++) 
        { 
  
            // if the pair sum is less than n 
            if (v.get(i) + v.get(j) < n) 
            { 
  
                // push in another container 
                v1.add(v.get(i) + v.get(j)); 
  
                // mark the sum with the elements  
                // formed 
                mp1_first[v.get(i) +  
                          v.get(j)] = v.get(i); 
                mp1_second[v.get(i) +  
                           v.get(j)] = v.get(j); 
  
                // mark in the map that  
                // v.get(i)+v.get(j) is present 
                mpp.put(v.get(i) + v.get(j), 1); 
            } 
        } 
    } 
  
    // new size of all the pair sums 
    s = v1.size(); 
  
    // iterate for all pair sum 
    for (int i = 0; i < s; i++)  
    { 
  
        // the required part 
        int el = n - (v1.get(i)); 
  
        // if the required part is also  
        // present in pair sum 
        if (mpp.get(el) != null)  
        { 
  
            // find the elements with 
            // which the first pair is formed 
            int a = mp1_first[v1.get(i)]; 
            int b = mp1_second[v1.get(i)]; 
  
            // find the elements with 
            // which the second pair is formed 
            int c = mp1_first[n - v1.get(i)]; 
            int d = mp1_second[n - v1.get(i)]; 
  
            // check for previous maximum 
            maxi = Math.max(a * b * c * d, maxi); 
        } 
    } 
  
    if (maxi == -1) 
        System.out.println("Not Possible"); 
    else 
    { 
        System.out.println("The maximum product" +  
                                   " is " + maxi); 
    } 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int n = 50; 
  
    findfactors(n); 
} 
} 
  
// This code is contributed by Arnab Kundu 

