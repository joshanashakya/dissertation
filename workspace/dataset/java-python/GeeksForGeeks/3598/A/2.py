

# Python 3 implementation of the approach 
  
# Function to print the Pendulum 
# arrangement of the given array 
def pendulumArrangement(arr, n): 
      
    # Sort the array 
    arr.sort(reverse = False) 
  
    # pos stores the index of 
    # the last element of the array 
    pos = n - 1
  
    # odd stores the last odd index in the array 
    if (n % 2 == 0): 
        odd = n - 1
    else: 
        odd = n - 2
  
    # Move all odd index positioned 
    # elements to the right 
    while (odd > 0): 
        temp = arr[odd] 
        in1 = odd 
  
        # Shift the elements by one position 
        # from odd to pos 
        while (in1 != pos): 
            arr[in1] = arr[in1 + 1] 
            in1 += 1
  
        arr[in1] = temp 
        odd = odd - 2
        pos = pos - 1
  
    # Reverse the element from 0 to (n - 1) / 2 
    start = 0
    end = int((n - 1) / 2) 
  
    while(start < end): 
        temp = arr[start] 
        arr[start] = arr[end] 
        arr[end] = temp 
        start += 1
        end -= 1
  
    # Printing the pendulum arrangement 
    for i in range(n): 
        print(arr[i], end = " ") 
  
# Driver code 
if __name__ == '__main__': 
    arr = [11, 2, 4, 55, 6, 8] 
    n = len(arr) 
  
    pendulumArrangement(arr, n) 
  
# This code is contributed by 
# Surendra_Gangwar 

