

// Java program to count total number of 
// pairs having elements with same 
// sum of digits 
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
  
// Function for returning 
// sum of digits of a number 
static int digitSum(int n) 
{ 
    int sum = 0; 
    while (n > 0) 
    { 
        sum += n % 10; 
        n = n / 10; 
    } 
    return sum; 
} 
  
// Function to return the total pairs 
// of elements with equal sum of digits 
static int totalPairs(int arr1[], int arr2[], 
                      int n, int m) 
{ 
  
    // set is used to avoid duplicate pairs 
    Set<pair> s = new HashSet<>(); 
  
    for (int i = 0; i < n; i++)  
    { 
        for (int j = 0; j < m; j++)  
        { 
  
            // check sum of digits 
            // of both the elements 
            if (digitSum(arr1[i]) == digitSum(arr2[j])) 
            { 
                if (arr1[i] < arr2[j]) 
                    s.add(new pair(arr1[i], arr2[j])); 
                else
                    s.add(new pair(arr2[j], arr1[i])); 
            } 
        } 
    } 
  
    // return size of the set 
    return s.size(); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr1[] = { 100, 3, 7, 50 }; 
    int arr2[] = { 5, 1, 10, 4 }; 
    int n = arr1.length; 
    int m = arr2.length; 
  
    System.out.println(totalPairs(arr1, arr2, n, m)); 
} 
}  
  
// This code is contributed by Rajput-Ji 

