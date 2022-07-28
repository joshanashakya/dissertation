

class Main 
{ 
    // Returns true if it is possible to sort 
    // else false/ 
    static boolean checkForSorting(int arr[], int n) 
    { 
        for (int i=0; i<n-1; i++) 
        { 
            // We need to do something only if 
            // previousl element is greater 
            if (arr[i] > arr[i+1]) 
            { 
                if (arr[i] - arr[i+1] == 1) 
                    { 
                        // swapping 
                        int temp = arr[i]; 
                        arr[i] = arr[i+1]; 
                        arr[i+1] = temp; 
                    } 
       
                // If difference is more than 
                // one, then not possible 
                else
                    return false; 
            } 
        } 
        return true; 
    } 
      
    // Driver function 
    public static void main(String args[]) 
    { 
        int arr[] = {1,0,3,2}; 
        int n = arr.length; 
        if (checkForSorting(arr, n)) 
           System.out.println("Yes"); 
        else
           System.out.println("No"); 
    } 
} 

