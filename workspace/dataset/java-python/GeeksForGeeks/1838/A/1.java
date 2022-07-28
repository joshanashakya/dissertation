

// Java program to print the Leftover element  
// after performing alternate Bitwise OR and  
// Bitwise XOR operations to the pairs. 
import java.util.*; 
  
class GFG 
{ 
static int N = 1000; 
  
static int lastElement(int a[], int n) 
{ 
    // count the step number 
    int steps = 1; 
    Vector<Integer> []v = new Vector[N]; 
    for (int i = 0; i < N; i++) 
        v[i] = new Vector<Integer>(); 
  
    // if one element is there,  
    // it will be the answer 
    if (n == 1) return a[0]; 
  
    // at first step we do a bitwise OR 
    for (int i = 0 ; i < n ; i += 2) 
        v[steps].add(a[i] | a[i + 1]); 
  
    // keep on doing bitwise operations  
    // till the last element is left 
    while (v[steps].size() > 1) 
    { 
  
        steps += 1; 
  
        // perform operations 
        for (int i = 0; i < v[steps - 1].size(); i += 2) 
        { 
            // if step is the odd step 
            if (steps % 2 == 1) 
                v[steps].add(v[steps - 1].get(i) |  
                             v[steps - 1].get(i + 1)); 
            else // even step 
                v[steps].add(v[steps - 1].get(i) ^  
                             v[steps - 1].get(i + 1)); 
        } 
    } 
  
    // answer when one element is left 
    return v[steps].get(0); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int a[] = {1, 4, 5, 6}; 
    int n = a.length; 
  
    // 1st query 
    int index = 0; 
    int value = 2; 
    a[0] = 2; 
    System.out.println(lastElement(a, n)); 
  
    // 2nd query 
    index = 3; 
    value = 5; 
    a[index] = value; 
    System.out.println(lastElement(a, n)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

