

# Python 3 program to print all elements that 
# appear more than once. 
  
# Function to find repeating elements 
def printDuplicates(arr, n): 
  
    # Flag variable used to 
    # represent whether repeating 
    # element is found or not. 
    fl = 0; 
  
    for i in range (0, n):  
  
        # Check if current element is 
        # repeating or not. If it is 
        # repeating then value will 
        # be greater than or equal to n. 
        if (arr[arr[i] % n] >= n):  
  
            # Check if it is first 
            # repetition or not. If it is 
            # first repetition then value 
            # at index arr[i] is less than 
            # 2*n. Print arr[i] if it is 
            # first repetition. 
            if (arr[arr[i] % n] < 2 * n):  
                print(arr[i] % n, end = " ") 
                fl = 1; 
  
        # Add n to index arr[i] to mark 
        # presence of arr[i] or to 
        # mark repetition of arr[i]. 
        arr[arr[i] % n] += n; 
  
    # If flag variable is not set 
    # then no repeating element is 
    # found. So print -1. 
    if (fl == 0): 
        print("-1") 
  
# Driver Function 
arr = [ 1, 6, 3, 1, 3, 6, 6 ]; 
arr_size = len(arr); 
printDuplicates(arr, arr_size); 
  
# This code is contributed 
# by Akanksha Rai 

