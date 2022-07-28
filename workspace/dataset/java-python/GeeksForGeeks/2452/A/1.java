

// Java implementation of above approach 
import java.util.*; 
  
class GFG 
{ 
public static int sumOfPairs(int n) 
{ 
    // Store the Binary equivalent   
    // of decimal number in reverse order  
    ArrayList<Integer> v = new ArrayList<Integer>();  
    int sum = 0; 
      
    // Calculate binary equivalent  
    // of decimal number  
    while (n > 0) 
    {  
        v.add(n % 2);  
        n = n / 2;  
} 
  
Collections.reverse(v);  
      
for (int i = 0; i < v.size() - 1; i++)  
{  
    for (int j = i + 1; j < v.size(); j++)  
  
    {  
        // handles all combinations of 01  
        if (v.get(i) == 0 && v.get(j) == 1)  
            sum += 1;  
  
        // handles all combinations of 11  
        if (v.get(i) == 1 && v.get(j) == 1)  
            sum += 3;  
  
        // handles all combinations of 10  
        if (v.get(i) == 1 && v.get(j) == 0)  
            sum += 2;  
    }  
} 
  
return sum;  
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int N = 5;  
  
    System.out.print(sumOfPairs(N)); 
} 
} 
  
// This code is contributed by Kirti_Mangal 

