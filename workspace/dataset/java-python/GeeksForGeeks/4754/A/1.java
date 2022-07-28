

// Java program to count all sub-arrays which 
// has all elements less than or equal to X 
  
public class GFG { 
  
    public static int countSubArrays(int arr[], int x) 
    { 
        int count = 0; 
        int start = -1, end = -1; 
          
        for(int i = 0; i < arr.length; i++) 
        { 
            if(arr[i] < x)  
            { 
                if(start == -1) 
                { 
                      
                    //create a new subArray 
                    start = i; 
                    end = i; 
                } 
                else
                { 
                      
                    // append to existing subarray 
                    end=i; 
                } 
            } 
            else
            { 
                if(start != -1 && end != -1) 
                { 
                      
                    // given start and end calculate 
                    // all subarrays within this range 
                    int length = end - start + 1; 
                    count = count + ((length * (length + 1)) / 2); 
                } 
                  
                start = -1; 
                end = -1; 
            } 
  
        } 
          
        if(start != -1 && end != -1) 
        { 
              
            // given start and end calculate all 
            // subarrays within this range 
            int length = end - start + 1; 
            count = count + ((length * (length + 1)) / 2); 
        } 
          
        return count; 
    } 
      
    // Driver code  
    public static void main(String[] args) 
    { 
        int arr[] = { 1, 5, 7, 8, 2, 3, 9 }; 
        int x = 6; 
        System.out.println(countSubArrays(arr, x)); 
  
    } 
} 

