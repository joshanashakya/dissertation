

// Bubble sort implementation  
// to sort elements in  
// descending order. 
import java.io.*; 
import java.util.*; 
  
class GFG 
{  
static void print(ArrayList<Integer> a,  
                                 int n) 
{ 
    for (int i = 0; i <= n; i++)  
        System.out.print(a.get(i) + " ");  
    System.out.println(); 
} 
  
// Sorts a[] in descending  
// order using bubble sort. 
static void sort(ArrayList<Integer> a, 
                                  int n) 
{ 
    for (int i = n;  
            i >= 0; i--)  
        for (int j = n;  
                j > n - i; j--)  
            if (a.get(j) > a.get(j - 1))  
            { 
                int tempswap = a.get(j); 
                a.remove(j); 
                a.add(j, a.get(j - 1));  
                a.remove(j - 1); 
                a.add(j - 1, tempswap);  
            } 
    print(a, n); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 6; 
    ArrayList<Integer> a = new ArrayList<Integer>(); 
    a.add(2); 
    a.add(4); 
    a.add(3); 
    a.add(2); 
    a.add(4); 
    a.add(5); 
    a.add(3); 
    sort(a, n); 
} 
} 
  
// This code is contributed by  
// Manish Shaw(manishshaw1) 

