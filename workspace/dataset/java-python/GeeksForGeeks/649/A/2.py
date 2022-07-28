

# Python 3 implementation of the approach 
  
# Function to return the minimum 
# required difference 
def findMinDifference(arr, n): 
      
    if(arr[0] < arr[1]): 
        min__ = secondMax = arr[0]  
    else: 
        min__ = secondMax = arr[1] 
          
    if(arr[0] < arr[1]): 
        max__ = secondMin = arr[1]  
    else: 
        max__ = secondMin = arr[0] 
  
    for i in range(2, n): 
          
        # If current element is greater 
        # than max 
        if (arr[i] > max__): 
              
            # max will become secondMax 
            secondMax = max__ 
  
            # Update the max 
            max__ = arr[i] 
  
        # If current element is greater than  
        # secondMax but smaller than max 
        elif (arr[i] > secondMax): 
              
            # Update the secondMax 
            secondMax = arr[i] 
  
        # If current element is smaller than min 
        elif(arr[i] < min__): 
              
            # min will become secondMin 
            secondMin = min__ 
  
            # Update the min 
            min__ = arr[i] 
  
        # If current element is smaller than  
        # secondMin but greater than min 
        elif(arr[i] < secondMin): 
              
            # Update the secondMin 
            secondMin = arr[i] 
      
    # Minimum of the two possible  
    # differences 
    diff = min(max__ - secondMin,  
                       secondMax - min__) 
    return diff 
  
# Driver code 
if __name__ == '__main__': 
    arr = [1, 2, 4, 3, 4] 
    n = len(arr) 
    print(findMinDifference(arr, n)) 
  
# This code is contributed by 
# Surendra_Gangwar 

