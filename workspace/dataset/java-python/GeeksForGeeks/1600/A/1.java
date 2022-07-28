

// Java program to implement  
// the above approach 
import java.util.*; 
  
class GFG 
{ 
      
// Function to print both the arrays  
static void PrintBothArrays(int a[], int n)  
{  
  
    // Store both arrays  
    Vector<Integer> v1 = new Vector<Integer>(),  
                    v2 = new Vector<Integer>();  
  
    // Used for hashing  
    HashMap<Integer, Integer> mpp = new HashMap<>();  
  
    // Iterate for every element  
    for (int i = 0; i < n; i++)  
    {  
  
        // Increase the count  
        mpp.put(a[i],(mpp.get(a[i]) == null?0:mpp.get(a[i]))+1);  
  
        // If first occurrence  
        if (mpp.get(a[i]) == 1)  
            v1.add(a[i]);  
  
        // If second occurrence  
        else if (mpp.get(a[i]) == 2)  
            v2.add(a[i]);  
  
        // If occurs more than 2 times  
        else 
        {  
            System.out.println( "Not possible");  
            return;  
        }  
    }  
  
    // Sort in increasing order  
    Collections.sort(v1);  
  
    // Print the increasing array  
    System.out.println("Strictly increasing array is:");  
    for (int i = 0; i < v1.size(); i++)  
        System.out.print(v1.get(i) + " ");  
  
    // Sort  
    Collections.sort(v2);  
    Collections.reverse(v2); 
  
    // Print the decreasing array  
    System.out.println("\nStrictly decreasing array is:");  
    for (int i = 0; i < v2.size(); i++)  
        System.out.print(v2.get(i) + " "); 
}  
  
// Driver code  
public static void main(String args[]) 
{  
    int a[] = { 7, 2, 7, 3, 3, 1, 4 };  
    int n = a.length;  
    PrintBothArrays(a, n);  
} 
}  
  
// This code is contributed by Arnab Kundu 

