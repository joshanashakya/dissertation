

# Python 3 program to count the 
# number of intervals in which 
# a given value lies 
  
# Function to count the 
# number of intervals in which 
# a given value lies 
def countIntervals(arr, V, N) : 
      
    # Variable to store the  
    # count of intervals 
    count = 0
  
    # Variables to store start and 
    # end of an interval 
    for i in range(N) : 
              
        # Variables to store start and  
        # end of an interval 
        li = arr[i][0] 
        ri = arr[i][1] 
  
        # Implies V lies in the interval 
        # so increase count 
        if (V >= li and V <= ri) : 
            count += 1
          
    return count; 
      
# Driver Code 
if __name__ == "__main__" : 
      
    arr = [ [ 1, 10 ], [ 5, 10 ],  
            [ 15, 25 ], [ 7, 12 ],  
            [ 20, 25 ] ] 
  
    V = 7
  
    # length of the array 
    N = len(arr) 
  
    print((countIntervals(arr, V, N))) 
  
# This code is contributed by Ryuga 

