

# Python3 program to find number  
# of iterations to fill with all 1s  
  
# Returns count of iterations  
# to fill arr[] with 1s.  
def countIterations(arr, n):  
  
    oneFound = False;  
    res = 0; 
    i = 0; 
      
    # Start traversing the array  
    while (i < n):  
        if (arr[i] == 1): 
            oneFound = True;  
  
        # Traverse until a 0 is found  
        while (i < n and arr[i] == 1):  
            i += 1;  
  
        # Count contiguous 0s  
        count_zero = 0;  
        while (i < n and arr[i] == 0): 
            count_zero += 1;  
            i += 1;  
  
        # Condition for Case 3  
        if (oneFound == False and i == n):  
            return -1;  
  
        # Condition to check  
        # if Case 1 satisfies:  
        curr_count = 0;  
        if (i < n and oneFound == True): 
              
            # If count_zero is even  
            if ((count_zero & 1) == 0):  
                curr_count = count_zero // 2;  
  
            # If count_zero is odd  
            else: 
                curr_count = (count_zero + 1) // 2;  
  
            # Reset count_zero  
            count_zero = 0;  
  
        # Case 2  
        else: 
            curr_count = count_zero;  
            count_zero = 0;  
  
        # Update res  
        res = max(res, curr_count);  
  
    return res;  
  
# Driver code  
arr = [0, 1, 0, 0, 1, 0, 0, 
       0, 0, 0, 0, 0, 1, 0];  
n = len(arr);  
print(countIterations(arr, n));  
  
# This code is contributed by mits 

