

// Java implementation of the above approach  
class GFG  
{ 
      
    // Function to check if it is possible or not  
    static boolean check(int a[], int n)  
    {  
        for (int i = 0; i < n; i++)  
            if (a[i] == 1)  
                return true;  
      
        return false;  
    }  
  
    // Driver code  
    public static void main (String[] args)  
    {  
        int a[] = { 0, 1, 0, 1 };  
        int n = a.length;  
      
        if(check(a, n) == true )  
            System.out.println("YES\n") ; 
        else
            System.out.println("NO\n");  
    }  
} 
  
// This code is contributed by Ryuga 

