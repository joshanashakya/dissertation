

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
static class pair 
{  
    int first, second;  
    public pair(int first, int second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 
  
// Function to get the nth ugly number 
static int uglyNumber(int n) 
{ 
  
    // To store ugly numbers 
    int []ugly = new int[n]; 
    int i2 = 0, i3 = 0, i5 = 0; 
    int next_multiple_of_2 = 2; 
    int next_multiple_of_3 = 3; 
    int next_multiple_of_5 = 5; 
    int next_ugly_no = 1; 
  
    ugly[0] = 1; 
    for (int i = 1; i < n; i++)  
    { 
        next_ugly_no = Math.min(next_multiple_of_2, 
                       Math.min(next_multiple_of_3, 
                                next_multiple_of_5)); 
        ugly[i] = next_ugly_no; 
        if (next_ugly_no == next_multiple_of_2)  
        { 
            i2 = i2 + 1; 
            next_multiple_of_2 = ugly[i2] * 2; 
        } 
        if (next_ugly_no == next_multiple_of_3)  
        { 
            i3 = i3 + 1; 
            next_multiple_of_3 = ugly[i3] * 3; 
        } 
        if (next_ugly_no == next_multiple_of_5)  
        { 
            i5 = i5 + 1; 
            next_multiple_of_5 = ugly[i5] * 5; 
        } 
    } 
  
    return next_ugly_no; 
} 
  
// Function to return the required count of pairs 
static int totalPairs(int arr1[], int arr2[],  
                      int n, int m) 
{ 
    HashSet<Integer> s1 = new HashSet<Integer>(); 
    int i = 1; 
  
    // Insert ugly numbers in set 
    // which are less than 1000 
    while (true) 
    { 
        int next_ugly_number = uglyNumber(i); 
        if (next_ugly_number > 1000) 
            break; 
        s1.add(next_ugly_number); 
        i++; 
    } 
  
    // Set is used to avoid duplicate pairs 
    HashSet<pair> s2 = new HashSet<pair>(); 
  
    for (i = 0; i < n; i++)  
    { 
  
        // Check if arr1[i] is an ugly number 
        if (s1.contains(arr1[i]))  
        { 
            for (int j = 0; j < m; j++)  
            { 
  
                // Check if arr2[i] is an ugly number 
                if (s1.contains(arr2[j]))  
                { 
                    if (arr1[i] < arr2[j]) 
                        s2.add(new pair(arr1[i], arr2[j])); 
                    else
                        s2.add(new pair(arr2[j], arr1[i])); 
                } 
            } 
        } 
    } 
  
    // Return the size of the set s2 
    return s2.size(); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr1[] = { 3, 7, 1 }; 
    int arr2[] = { 5, 1, 10, 4 }; 
    int n = arr1.length; 
    int m = arr2.length; 
  
    System.out.println(totalPairs(arr1, arr2, n, m)); 
} 
}  
  
// This code is contributed by PrinciRaj1992 

