

# Python3 program to find bitonicity 
# of an array 
  
# Function to find the bitonicity 
# of an array 
def findBitonicity(arr, n): 
    bt = 0
  
    for i in range(1, n, 1): 
        if (arr[i] > arr[i - 1]): 
            bt += 1
        elif (arr[i] < arr[i - 1]): 
            bt -= 1
  
    return bt 
  
# Driver Code 
if __name__ == '__main__': 
    arr = [1, 2, 3, 4, 5, 6, 4, 3]  
  
    n = len(arr) 
  
    print("Bitonicity =", 
           findBitonicity(arr, n)) 
  
# This code is contributed by 
# Surendra_Gangwar 

