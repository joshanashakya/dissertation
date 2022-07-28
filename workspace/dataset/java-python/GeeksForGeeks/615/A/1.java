

// Java program to print all the numbers 
// that divides maximum of array elements 
import java.util.*; 
  
class GFG 
{ 
      
// Function that prints all the numbers 
// which divides maximum of array elements 
static void printNumbers(int a[], int n) 
{ 
  
    // hash to store the number of times 
    // a factor is there 
    Map<Integer,  
        Integer> mpp = new HashMap<>(); 
  
    for (int i = 0; i < n; i++)  
    { 
        int num = a[i]; 
  
        // find all the factors 
        for (int j = 1; j * j <= num; j++)  
        { 
  
            // if j is factor of num 
            if (num % j == 0)  
            { 
                if (j != 1) 
                { 
                    if(mpp.containsKey(j)) 
                    { 
                        mpp.put(j, mpp.get(j) + 1); 
                    } 
                    else
                    { 
                        mpp.put(j, 1); 
                    } 
                } 
                  
                if ((num / j) != j) 
                { 
                    if(mpp.containsKey(num / j)) 
                    { 
                        mpp.put(num / j, mpp.get(num / j) + 1); 
                    } 
                    else
                    { 
                        mpp.put(num / j, 1); 
                    } 
                } 
            } 
        } 
    } 
  
    // find the maximum times 
    // it can divide 
    int maxi = 0; 
    for (Map.Entry<Integer, 
                   Integer> it : mpp.entrySet()) 
    { 
        maxi = Math.max(it.getValue(), maxi); 
    } 
  
    // print all the factors of 
    // numbers which divides the 
    // maximum array elements 
    for (Map.Entry<Integer, 
                   Integer> it : mpp.entrySet()) 
    { 
        if (it.getValue() == maxi) 
            System.out.print(it.getKey() + " "); 
    } 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int a[] = { 12, 15, 27, 20, 40 }; 
    int n = a.length; 
    printNumbers(a, n); 
} 
} 
  
// This code is contributed by Princi Singh 

