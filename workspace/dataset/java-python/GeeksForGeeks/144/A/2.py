

# Python3 implementation of the above approach 
  
# Function to return the  
# index of the pivot  
def findPivot(arr, low, high) : 
  
    # Base cases  
    if (high < low) : 
        return -1;  
          
    if (high == low) : 
        return low;  
  
    mid = (low + high) // 2;  
    if (mid < high and arr[mid + 1] < arr[mid]) : 
      
        return mid;  
  
    # Check if element at (mid - 1) is pivot  
    # Consider the cases like {4, 5, 1, 2, 3}  
    if (mid > low and arr[mid] < arr[mid - 1]) : 
      
        return mid - 1;  
      
    # Decide whether we need to go to  
    # the left half or the right half  
    if (arr[low] > arr[mid]) : 
      
        return findPivot(arr, low, mid - 1);  
      
    else : 
      
        return findPivot(arr, mid + 1, high);  
      
# Function to check if a given array  
# is sorted rotated or not  
def isRotated(arr, n) :  
  
    l = 0;  
    r = n - 1;  
    pivot = -1;  
    if (arr[l] > arr[r]) : 
      
        pivot = findPivot(arr, l, r);  
  
        # To check if the elements to the left  
        # of the pivot are in descending or not  
        if (l < pivot) : 
          
            while (pivot > l) : 
              
                if (arr[pivot] < arr[pivot - 1]) : 
                  
                    return False;  
                  
                pivot -= 1;  
  
        # To check if the elements to the right  
        # of the pivot are in ascending or not  
        else : 
            pivot += 1;  
            while (pivot < r) : 
                if (arr[pivot] > arr[pivot + 1]) : 
                    return False;  
                  
                pivot ++ 1;  
      
        # If any of the above if or else is true  
        # Then the array is sorted rotated  
        return True;  
  
    # Else the array is not sorted rotated  
    else : 
        return False;  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 3, 4, 5, 1, 2 ];  
    if (isRotated(arr, 5)) : 
        print("True");  
    else : 
        print("False");  
  
# This code is contributed by Yash_R 

