

# Python3 implementation of the approach  
  
# Function to return the maximum  
# number of segments  
def countPoints(n, m, a, b, x, y):  
  
    # Sort both the vectors  
    a.sort()  
    b.sort()  
  
    # Initially pointing to the first  
    # element of b[]  
    j, count = 0, 0
    for i in range(0, n):  
  
        # Try to find a match in b[]  
        while j < m: 
  
            # The segment ends before b[j]  
            if a[i] + y < b[j]:  
                break
  
            # The point lies within the segment  
            if (b[j] >= a[i] - x and 
                b[j] <= a[i] + y):  
                count += 1
                j += 1
                break
  
            # The segment starts after b[j]  
            else: 
                j += 1
  
    # Return the required count  
    return count  
  
# Driver code  
if __name__ == "__main__": 
  
    x, y = 1, 4
    a = [1, 5]  
    n = len(a)  
    b = [1, 1, 2]  
    m = len(b)  
    print(countPoints(n, m, a, b, x, y))  
      
# This code is contributed by Rituraj Jain 

