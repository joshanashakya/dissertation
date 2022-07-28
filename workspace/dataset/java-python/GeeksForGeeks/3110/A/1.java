

// Java program to find the largest perfect  
// cube number among n numbers  
class Solution 
{ 
  
// Function to check if a number  
// is perfect cube number or not  
static boolean checkPerfectcube(int n)  
{  
    // takes the sqrt of the number  
    int d =(int) Math.cbrt(n);  
  
    // checks if it is a perfect  
    // cube number  
    if (d * d * d == n)  
        return true;  
  
    return false;  
}  
  
// Function to find the largest perfect  
// cube number in the array  
static int largestPerfectcubeNumber(int a[], int n)  
{  
    // stores the maximum of all  
    // perfect cube numbers  
    int maxi = -1;  
  
    // Traverse all elements in the array  
    for (int i = 0; i < n; i++) {  
  
        // store the maximum if current  
        // element is a perfect cube  
        if (checkPerfectcube(a[i]))  
            maxi = Math.max(a[i], maxi);  
    }  
  
    return maxi;  
}  
  
// Driver Code  
public static void main(String args[]) 
{  
    int a[] = { 16, 64, 25, 2, 3, 10 };  
  
    int n =a.length;  
  
    System.out.print(largestPerfectcubeNumber(a, n));  
  
}  
} 
  
//contributed by Arnab Kundu 

