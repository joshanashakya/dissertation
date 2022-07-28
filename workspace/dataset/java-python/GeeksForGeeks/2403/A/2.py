

# Python3 program to find the maximum number  
# of fixed points using at most 1 swap  
  
# Function to find maximum number of  
# fixed points using atmost 1 swap  
def maximumFixedPoints(a, n):  
  
    pos = [None] * n  
    count, swapped = 0, 0
  
    # Store position of each element  
    # in input array  
    for i in range(0, n):  
        pos[a[i]] = i  
  
    for i in range(0, n):  
      
        # If fixed point, incremenmt count  
        if a[i] == i:  
            count += 1
  
        # Else check if swapping increments  
        # count by 2  
        elif swapped == 0 and pos[i] == a[i]:  
            count += 2
            swapped = 1
  
    # If not swapped yet and elements remaining  
    if swapped == 0 and count < n - 1:  
        count += 1
  
    return count  
  
# Driver Code  
if __name__ == "__main__": 
  
    a = [0, 1, 3, 4, 2]  
    n = len(a)  
  
    print(maximumFixedPoints(a, n))  
  
# This code is contributed by Rituraj Jain 

