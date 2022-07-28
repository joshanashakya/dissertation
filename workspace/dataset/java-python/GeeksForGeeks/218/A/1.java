

// Java program for above implementation  
class GFG 
{ 
public static void main(String[] args) 
{ 
    // The target value for which  
    // we have to find the solution  
    int target = 93 ; 
      
    int[] arr = {1, 31, 3, 1, 93, 
                    3, 31, 1, 93}; 
    int length = arr.length; 
      
    // This variable contains the total  
    // count of triplets found  
    int totalCount = 0 ; 
      
    // Loop from the first to the third  
    //last integer in the list  
    for(int i = 0 ; i < length - 2; i++) 
    { 
        // Check if arr[i] is a factor  
        // of target or not. If not,  
        // skip to the next element  
        if (target % arr[i] == 0) 
        {  
            for (int j = i + 1 ;  
                    j < length - 1; j++) 
            { 
            // Check if the pair (arr[i], arr[j]) 
            // can be a part of triplet whose  
            // product is equal to the target  
            if (target % (arr[i] * arr[j]) == 0) 
                { 
                // Find the remaining  
                // element of the triplet  
                int toFind = target /  
                             (arr[i] * arr[j]); 
              
                    for(int k = j + 1 ;  
                            k < length ; k++ ) 
                    { 
                        // If element is found. increment  
                        // the total count of the triplets  
                        if (arr[k] == toFind) 
                        {  
                            totalCount ++ ; 
                        } 
                    } 
                }  
            }  
        } 
    } 
      
System.out.println("Total number of triplets found : " +  
                                            totalCount); 
} 
} 
  
// This code is contributed by mits 

