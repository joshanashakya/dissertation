

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
      
// function to return valid indexes 
static Vector<Integer> find_idx(int ar[], int n) 
{ 
  
    // Vector to store the answer 
    Vector<Integer> answer = new Vector<Integer>(); 
  
    // Initial sum would always 
    // be first element 
    int sum = ar[0]; 
  
    for (int i = 1; i < n; i++)  
    { 
  
        // Check if sum till now 
        // is equal to current element 
        if (sum == ar[i])  
        { 
            answer.add(i + 1); 
        } 
  
        // Updating the sum by adding the  
        // current element in each iteration. 
        sum += ar[i]; 
    } 
    return answer; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int ar[] = { 1, 2, 3, 6, 3, 15, 5 }; 
    int n = ar.length; 
  
    Vector<Integer> ans = find_idx(ar, n); 
  
    if (ans.size() != 0)  
    { 
        for (int i : ans)  
        { 
            System.out.print(i + " "); 
        } 
    } 
    else 
    { 
        System.out.println("-1"); 
    } 
} 
}  
  
// This code is contributed by 29AjayKumar 

