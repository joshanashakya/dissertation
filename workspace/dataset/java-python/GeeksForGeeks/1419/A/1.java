

// Java Implementation of above approach.  
import java.util.*; 
class GFG{ 
// Function to return the number  
// of students that can pass  
static int check(int n, List<Integer> marks) 
{ 
    // maximum marks  
    Integer x = Collections.max(marks);  
  
    // maximum bonus marks that can be given  
    int bonus = 100-x; 
    int c = 0; 
    for(int i=0; i<n;i++) 
    { 
  
        // counting the number of  
        // students that can pass  
        if(marks.get(i) + bonus >= 50) 
            c += 1; 
    } 
    return c; 
} 
      
// Driver code 
public static void main(String[] args) 
{ 
int n = 5; 
 List<Integer> marks = Arrays.asList(0, 21, 83, 45, 64);  
System.out.println(check(n, marks));  
} 
} 
// This code is contributed by mits 

