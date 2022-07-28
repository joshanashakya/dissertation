

# Python 3 program to find minimum and maximum  
# sum of absolute differences of pairs 
  
# function to calculate minimum sum 
def calculate_min_sum( a, n): 
  
    # sorts the array c++ stl 
    a.sort() 
  
    # initially min=0 and max=0 
    min_sum = 0
  
    # traverse to find the minimum sum 
    for i in range(1, n, 2): 
  
        # the adjacent elements difference 
        # will always be smaller 
        min_sum += abs(a[i] - a[i - 1]) 
      
    return min_sum 
  
# function to calculate maximum sum 
def calculate_max_sum(a, n): 
  
    # sorts the array c++ stl 
    a.sort() 
  
    max_sum = 0
  
    # traverse to find the maximum sum 
    for i in range(n // 2): 
          
        # the farthest distant elements sum  
        max_sum += abs(a[n - 1 - i] - a[i]) 
    return max_sum 
  
# Driver Code 
if __name__ == "__main__": 
      
    a = [ 10, -10, 20, -40] 
  
    n = len(a) 
  
    print("The minimum sum of pairs is",  
                calculate_min_sum(a, n)) 
  
    print( "The maximum sum of pairs is",  
                 calculate_max_sum(a, n)) 
  
# This code is contributed by ita_c 

