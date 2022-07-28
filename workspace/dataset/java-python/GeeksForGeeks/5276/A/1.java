

// Java program to find next greater number with 
// same sum of digits. 
import java.util.*; 
  
class GFG 
{ 
  
static void getnext(int []arr, int n) 
{ 
    // for storing 4 regions 
    ArrayList<Integer> a1 = new ArrayList<Integer>(); 
    ArrayList<Integer> a2 = new ArrayList<Integer>(); 
    ArrayList<Integer> a3 = new ArrayList<Integer>(); 
    ArrayList<Integer> a4 = new ArrayList<Integer>(); 
  
    // trailing zeros region1 
    int i = n - 1; // last index 
    while (arr[i] == 0)  
    { 
        a1.add(0); 
        i--; 
    } 
  
    // lowest region(region 2) not in region 1 
    a2.add(arr[i--]);  
  
    // Consecutive 9's (region 3) 
    while (arr[i] == 9)  
    { 
        a3.add(9); 
        i--; 
    } 
  
    int j = 0; 
    while (arr[j] == 0) 
        j++; // Starting zeros 
  
    while (j <= i) // 4th region 
    { 
        a4.add(arr[j]); 
        j++; 
    } 
  
    // Calculation of result 
    j = a4.size() - 1; 
  
    a4.set(j,a4.get(j) + 1); // Region4 + 1 
  
    a2.set(0,a2.get(0) - 1); // Region2 -1 
  
    //int l = a1.size() + a2.size() + a3.size() + a4.size(); 
  
    // Calculating the result 
    j = n - 1; 
    i = a3.size() - 1; 
  
    // Copying the third region 
    while (i >= 0) 
    { 
        arr[j--] = (int)a3.get(i); 
        i--; 
    } 
  
    // Copying the 2nd region 
    i = a2.size() - 1; 
    while (i >= 0)  
    { 
        arr[j--] = (int)a2.get(i); 
        i--; 
    } 
  
    // Copying the 1st region 
    i = a1.size() - 1; 
    while (i >= 0)  
    { 
        arr[j--] = a1.get(i); 
        i--; 
    } 
  
    // Copying the 4th region 
    i = a4.size() - 1; 
    while (i >= 0)  
    { 
        arr[j--] = a4.get(i); 
        i--; 
    } 
  
    while (j >= 0) 
        arr[j--] = 0; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int []arr = { 0, 0, 0, 0, 0, 0, 0, 3, 9, 7,  
                0, 0, 2, 9, 8, 9, 5, 9, 9, 0 }; 
    int n = arr.length; 
  
    getnext(arr, n); // Calling the function 
  
    for (int i = 0; i < n; i++) 
        System.out.print(arr[i]); 
} 
} 
  
// This code is contributed by mits 

