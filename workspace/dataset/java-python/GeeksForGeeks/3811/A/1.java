

// Java program to find sum of all even  
// frequency elements in a Matrix  
import java.util.*; 
  
class GFG 
{ 
  
static final int N = 3; // Rows  
static final int M = 3; // Columns  
  
// Function to find sum of all even  
// frequency elements in a Matrix  
static int sumOddOccurring(int arr[][])  
{  
  
    // Store frequency of elements  
    // in matrix  
    Map<Integer,  
        Integer> mp = new HashMap<Integer, 
                                  Integer>();  
    for (int i = 0; i < N; i++)  
    {  
        for (int j = 0; j < M; j++)  
        {  
            if(mp.get(arr[i][j]) == null) 
                mp.put(arr[i][j], 1); 
            else
                mp.put(arr[i][j],  
                      (mp.get(arr[i][j]) + 1));  
        }  
    }  
  
    // Sum even frequency elements  
    int sum = 0;  
    Set< Map.Entry<Integer,  
                   Integer> > st = mp.entrySet();  
  
    for (Map.Entry< Integer, Integer> me:st)  
    {  
        if (me.getValue() % 2 == 0) 
        {  
            int x = me.getValue();  
            sum += (me.getKey()) * (me.getValue());  
        }  
    }  
    return sum;  
}  
  
// Driver Code  
public static void main(String args[]) 
{  
    int mat[][] = {{ 1, 2, 3 },  
                   { 1, 3, 2 },  
                   { 1, 5, 6 }};  
  
    System.out.print(sumOddOccurring(mat));  
}  
} 
  
// This code is contributed by Arnab Kundu 

