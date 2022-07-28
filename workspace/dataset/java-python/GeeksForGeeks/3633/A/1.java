

// Java implementation of the above approach  
import java.util.*; 
  
class GfG  
{ 
  
// Find if slope is good  
// with only two intercept  
static boolean isSlopeGood(double slope, 
                        int arr[], int n)  
{  
    Set<Double> setOfLines = new HashSet<Double> ();  
    for (int i = 0; i < n; i++)  
        setOfLines.add(arr[i] - slope * (i));  
  
    // if set of lines have only two distinct intercept  
    return setOfLines.size() == 2;  
}  
  
// Function to check if required solution exist  
static boolean checkForParallel(int arr[], int n)  
{  
    // check the result by processing  
    // the slope by starting three points  
    boolean slope1 = isSlopeGood(arr[1] - arr[0], arr, n);  
    boolean slope2 = isSlopeGood(arr[2] - arr[1], arr, n);  
    boolean slope3 = isSlopeGood((arr[2] - arr[0]) / 2, arr, n);  
  
    return (slope1 == true || slope2 == true || slope3 == true);  
}  
  
// Driver code  
public static void main(String[] args)  
{  
    int arr[] = { 1, 6, 3, 8, 5 };  
    int n = arr.length;  
    if(checkForParallel(arr, n) == true) 
    System.out.println("1"); 
    else
    System.out.println("0"); 
} 
}  
  
// This code is contributed by Prerna Saini. 

