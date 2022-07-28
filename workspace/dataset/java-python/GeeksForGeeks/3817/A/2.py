

# Python 3 program to sort an array where 
# a subarray of a sorted array is in  
# reversed order 
  
# Function to print the sorted array 
# by reversing the subarray 
def printSorted(a, n): 
    front = -1
    back = -1
  
    # find the starting index of the 
    # reversed subarry 
    for i in range(1, n, 1): 
        if (a[i] < a[i - 1]): 
            front = i - 1
            break
  
    # find the ending index of the 
    # reversed subarray 
    i = n - 2
    while(i >= 0): 
        if (a[i] > a[i + 1]): 
            back = i + 1
            break
        i -= 1
      
    # if no reversed subarray is present 
    if (front == -1 and back == -1): 
        for i in range(0, n, 1): 
            print(a[i], end = " ") 
        return
  
    # swap the reversed subarray 
    while (front <= back): 
          
        # swaps the front and back element 
        # using c++ STL 
        temp = a[front] 
        a[front] = a[back] 
        a[back] = temp 
  
        # move the pointers one step 
        # ahead and one step back 
        front += 1
        back -= 1
      
    for i in range(0, n, 1): 
        print(a[i], end = " ") 
   
# Driver Code 
if __name__ == '__main__': 
    a = [1, 7, 6, 5, 4, 3, 2, 8] 
    n = len(a) 
    printSorted(a, n) 
  
# This code is contributed by 
# Sahil_Shelangia 

