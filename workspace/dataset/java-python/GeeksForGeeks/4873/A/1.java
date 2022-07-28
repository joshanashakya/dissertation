

// Java program to print the elements in 
// descending along with their frequencies 
import java.util.*; 
  
class GFG 
{ 
  
// Function to print the elements in descending 
// along with their frequencies 
static void printElements(int a[], int n) 
{ 
  
    // Sorts the element in decreasing order 
    Arrays.sort(a); 
    a = reverse(a); 
    int cnt = 1; 
  
    // traverse the array elements 
    for (int i = 0; i < n - 1; i++)  
    { 
  
        // Prints the number and count 
        if (a[i] != a[i + 1]) 
        { 
            System.out.print(a[i]+ " occurs " + 
                            cnt + " times\n"); 
            cnt = 1; 
        } 
        else
            cnt += 1; 
    } 
  
    // Prints the last step 
    System.out.print(a[n - 1]+ " occurs " +  
                    cnt + " times\n"); 
} 
  
static int[] reverse(int a[]) 
{ 
    int i, n = a.length, t; 
    for (i = 0; i < n / 2; i++) 
    { 
        t = a[i]; 
        a[i] = a[n - i - 1]; 
        a[n - i - 1] = t; 
    } 
    return a; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int a[] = { 1, 1, 1, 2, 3, 4, 9, 9, 10 }; 
    int n = a.length; 
  
    printElements(a, n); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

