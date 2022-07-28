

# Program to find index of an element  
# after given range reversals. 
  
# Function to compute the element 
# at query index 
def answer(arr, ranges, reversals, index): 
    i = reversals - 1
    while(i >= 0): 
          
        # Range[left...right] 
        left = ranges[i][0] 
        right = ranges[i][1] 
  
        # If doesn't satisfy, reversal won't 
        # have any effect 
        if (left <= index and right >= index): 
            index = right + left - index 
      
        i -= 1
      
    # Returning element at modified index 
    return arr[index] 
  
# Driver Code 
if __name__ == '__main__': 
    arr = [10, 20, 30, 40, 50] 
  
    # reversals 
    reversals = 2
    ranges = [ [ 1, 4 ], [ 0, 2 ] ] 
  
    index = 1
    print(answer(arr, ranges, 
                 reversals, index)) 
  
# This code is contributed by  
# Surendra_Gangwar 

