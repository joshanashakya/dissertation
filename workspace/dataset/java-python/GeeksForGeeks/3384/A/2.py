

# Python3 implementation of Shell-Metzner Sort 
  
# Function to sort arr[] using Shell Metzner sort 
def sort_shell_metzner( arr, n): 
  
    # Set initial step size to 
    # the size of the array 
    m = n; 
  
    while (m > 0): 
  
        # Step size decreases by half each time 
        m //= 2
  
        # k is the upper limit for j 
        k = n - m 
  
        # j is the starting point 
        j = 0
  
        while(j < k): 
  
            # i equals to smaller value 
            i = j 
  
            while(i >= 0): 
  
                # l equals to larger value 
                l = i + m 
  
                # Compare and swap arr[i] with arr[l] 
                if (arr[i] > arr[l]): 
                    arr[i], arr[l]=arr[l],arr[i] 
  
                    # Decrease smaller value by step size 
                    i -= m 
          
                else: 
                    break
  
            # Increment the lower limit of i 
            j += 1
  
# Function to print the contents of an array 
def printArray(arr, n): 
  
    for i in range( n): 
        print( arr[i], end= " ") 
  
# Driver code 
if __name__ =="__main__": 
    arr = [ 0, -2, 8, 5, 1 ] 
    n = len(arr) 
  
    # Sort the array using Shell Metzner Sort 
    sort_shell_metzner(arr, n) 
  
    # Print the sorted array 
    printArray(arr, n) 
  
# This code is contributed by chitranayal 

