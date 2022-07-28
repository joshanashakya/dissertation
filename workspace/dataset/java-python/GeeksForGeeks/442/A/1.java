

// Java implmentation to check wheather 
// two convex polygons have same center 
class GFG{ 
   
// Function to check whether two convex 
// polygons have the same center or not 
static int check(int n, int m){ 
    if (m % n == 0){ 
        System.out.print("YES"); 
    } 
    else{ 
        System.out.print("NO"); 
    } 
    return 0; 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    int n = 5; 
    int m = 10; 
       
    check(n, m); 
} 
} 
  
// This code is contributed by sapnasingh4991 

