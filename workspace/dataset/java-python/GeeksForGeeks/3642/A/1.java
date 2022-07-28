

// Java program to find whether a regular polygon 
// is possible in circle with 1s as vertices 
  
class Test 
{ 
    // method returns true if polygon is possible with 
    // 'midpoints' number of midpoints 
    static boolean checkPolygonWithMidpoints(int arr[], int N, 
                                      int midpoints) 
    { 
        // loop for getting first vertex of polygon 
        for (int j = 0; j < midpoints; j++) 
        { 
            int val = 1; 
       
            // loop over array values at 'midpoints' distance 
            for (int k = j; k < N; k += midpoints) 
            { 
                // and(&) all those values, if even one of 
                // them is 0, val will be 0 
                val &= arr[k]; 
            } 
       
            /*  if val is still 1 and (N/midpoints) or (number 
                of vertices) are more than two (for a polygon 
                minimum) print result and return true */
            if (val != 0 && N/midpoints > 2) 
            { 
                System.out.println("Polygon possible with side length " + 
                                               N/midpoints); 
                return true; 
            } 
        } 
        return false; 
    } 
       
    // method prints sides in the polygon or print not 
    // possible in case of no possible polygon 
    static void isPolygonPossible(int arr[], int N) 
    { 
        //  limit for iterating over divisors 
        int limit = (int)Math.sqrt(N); 
        for (int i = 1; i <= limit; i++) 
        { 
            // If i divides N then i and (N/i) will 
            // be divisors 
            if (N % i == 0) 
            { 
                //  check polygon for both divisors 
                if (checkPolygonWithMidpoints(arr, N, i) || 
                    checkPolygonWithMidpoints(arr, N, (N/i))) 
                    return; 
            } 
        } 
       
        System.out.println("Not possible"); 
    } 
      
    // Driver method 
    public static void main(String args[]) 
    { 
        int arr[] = {1, 0, 1, 0, 1, 0, 1, 0, 1, 1}; 
  
        isPolygonPossible(arr, arr.length); 
    } 
} 

