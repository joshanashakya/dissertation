

# Python3 program to find sum of elements  
# in an array having frequency greater  
# than or equal to that element 
  
# Function to return the sum of elements  
# in an array having frequency greater  
# than or equal to that element  
def sumOfElements(arr, n) : 
  
    # dictionary is used to store  
    # element frequencies  
    m = dict.fromkeys(arr, 0) 
  
    for i in range(n) : 
            m[arr[i]] += 1
  
    sum = 0
  
    # traverse the dictionary 
    for key,value in m.items() : 
  
        # Calculate the sum of elements  
        # having frequencies greater than  
        # or equal to the element itself  
        if value >= key : 
                sum += key 
  
    return sum
  
# Driver code 
if __name__ == "__main__" : 
  
    arr = [1, 2, 3, 3, 2, 3, 2, 3, 3] 
    n = len(arr) 
  
    print(sumOfElements(arr, n)) 
  
# This code is contributed by Ryuga 

