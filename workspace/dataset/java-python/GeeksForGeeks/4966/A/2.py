

# Python 3 program to equally divide n  
# elements into two sets such that second  
# set has maximum distinct elements. 
  
def distribution(arr, n): 
    arr.sort(reverse = False) 
    count = 1
    for i in range(1, n, 1): 
        if (arr[i] > arr[i - 1]): 
            count += 1
      
    return min(count, n / 2) 
  
# Driver code 
if __name__ == '__main__': 
    arr = [1, 1, 2, 1, 3, 4]  
    n = len(arr) 
    print(int(distribution(arr, n))) 
  
# This code is contributed by 
# Shashank_Sharma 

