

# Python 3 program to implement the above approach 
import sys 
  
def minBroadcastRange( houses, towers, n, m): 
  
    # Initialize distance of left 
    # tower from first house 
    leftTower = -sys.maxsize - 1
  
    # Initialize distance of right 
    # tower from first house 
    rightTower = towers[0] 
  
    # j: Index of houses[] 
    # k: Index of towers[] 
    j , k = 0 , 0
  
    # Store the minimum required range 
    min_range = 0
  
    while (j < n): 
  
        # If the house lies between 
        # left and right towers 
        if (houses[j] < rightTower): 
  
            left = houses[j] - leftTower 
            right = rightTower - houses[j] 
  
            # Compare the distance between the 
            # left and right nearest towers 
            if left < right : 
                local_max = left  
            else: 
                local_max = right 
  
            if (local_max > min_range): 
  
                # updating the maximum value 
                min_range = local_max 
            j += 1 
          
        else: 
  
            # updating the left tower 
            leftTower = towers[k] 
  
            if (k < m - 1) : 
  
                k += 1 
  
                # updating the right tower 
                rightTower = towers[k] 
              
            else: 
                # updating right tower 
                # to maximum value after 
                # reaching the end of Tower array 
                rightTower = sys.maxsize 
    return min_range 
  
# Driver code 
if __name__ == "__main__": 
      
    a = [ 12, 13, 11, 80 ] 
    b = [ 4, 6, 15, 60 ] 
    n = len(a) 
    m = len(b) 
    max = minBroadcastRange(a, b,n,m) 
    print(max) 
  
# This code is contributed by chitranayal 

