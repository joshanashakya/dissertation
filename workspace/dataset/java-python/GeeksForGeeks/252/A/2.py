

# Python3 implementation of the approach  
  
# Reducing the gap by a factor of 2  
def nextGap(gap) :  
    if (gap <= 1) : 
        return 0;  
    res = (gap // 2) + (gap % 2);  
    return res; 
  
# Function to merge two sorted  
# arrays with O(1) extra space  
def mergeTwoSortedArray(arr1, arr2, n, m) :  
  
    x = min(n, m);  
  
    # Form both arrays to be bitonic  
    for i in range(x) : 
        if (arr1[n - i - 1] > arr2[i]) : 
            arr1[n - i - 1],arr2[i] = arr2[i], arr1[n- i - 1]; 
  
    # Now both the arrays conatin the numbers  
    # which should be there in the result  
    # Sort the array indiviually by inplace algo  
    gap = nextGap(n); 
    while gap > 0 : 
          
        # Comparing elements in the first array  
        i = 0; 
          
        while i + gap < n :  
              
            if (arr1[i] > arr1[i + gap]) : 
                arr1[i], arr1[i + gap] = arr1[i + gap],arr1[i]; 
                  
            i += 1; 
              
        gap = nextGap(gap) 
  
    # Sort the second array  
    gap = nextGap(m); 
      
    while gap > 0 : 
          
        # Comparing elements in the second array  
        i = 0
        while i + gap < m : 
            if (arr2[i] > arr2[i + gap]) : 
                arr2[i], arr2[i + gap] = arr2[i + gap], arr2[i]; 
                  
            i += 1; 
              
        gap = nextGap(gap) 
              
    for i in range(n) :  
        print(arr1[i], end = " "); 
          
    for j in range(m) : 
        print(arr2[j], end = " ");  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr1 = [ 1, 5, 9, 10, 15, 20 ];  
    n = len(arr1);  
    arr2 = [ 2, 3, 8, 13 ];  
    m = len(arr2);  
  
    mergeTwoSortedArray(arr1, arr2, n, m);  
  
# This code is contributed by AnkitRai01 

