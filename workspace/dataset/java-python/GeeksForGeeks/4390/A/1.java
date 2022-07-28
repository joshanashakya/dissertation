

// Java program to print sum triangle for a given array 
class Test{ 
       
     static int arr[] = new int[]{4, 7, 3, 6, 7}; 
       
     // prints sum triangle for arr[0..n-1] 
     public static void printTriangle(int n) 
     { 
        // Initialize a 2D array to store triangle 
        int tri[][] = new int[n][n]; 
           
        // Initialize last row of triangle 
        for (int i = 0; i < n ; i++) 
            tri[n-1][i] = arr[i]; 
           
        // Fill other rows 
        for (int i = n-2; i >=0; i--) 
            for (int j = 0; j <= i; j++) 
               tri[i][j] = tri[i+1][j] + tri[i+1][j+1]; 
           
        // Print the triangle 
        for (int i = 0; i < n; i++) 
        { 
            for(int j = 0; j <= i ; j++) 
                System.out.print(tri[i][j] + " "); 
            System.out.println(); 
        } 
     } 
       
     public static void main(String[] args)  
     { 
         printTriangle(arr.length); 
        } 
 } 

