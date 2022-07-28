

# Python3 implementation of above approach 
  
# Function to return the number of 
# colors visible 
def colourVisible(height, colour, K): 
    arr = [0 for i in range(K + 1)] 
    visible = 0
  
    max = height[K - 1] 
    arr[colour[K - 1]] = 1
      
    i = K - 2
    while(i >= 0): 
        if (height[i] > max): 
            max = height[i] 
            arr[colour[i]] = 1
        i -= 1
      
    # Count the Number of 1 complement 
    for i in range(1, K + 1, 1): 
            if (arr[i] == 1): 
                visible += 1
      
    return visible 
  
# Driver code 
if __name__ == '__main__': 
    height = [3, 5, 1, 2, 3]  
    colour = [1, 2, 3, 4, 3]  
    K = len(colour) 
  
    print(colourVisible(height, colour, K)) 
  
# This code is contributed by 
# Surendra_Gangwar 

