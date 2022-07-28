

# Python 3 program to generate  
# largest possible number  
# with given digits 
  
# Function to generate  
# largest possible number  
# with given digits 
def findMaxNum(arr, n): 
      
    # Declare a hash array of  
    # size 10 and initialize  
    # all the elements to zero 
    hash = [0] * 10
      
    # store the number of occurrences  
    # of the digits in the given array 
    # into the hash table 
    for i in range(n): 
        hash[arr[i]] += 1
      
    # Traverse the hash in  
    # descending order to  
    # print the required number 
    for i in range(9, -1, -1): 
          
        # Print the number of  
        # times a digits occurs 
        for j in range(hash[i]): 
            print(i, end = "") 
  
# Driver code 
if __name__ == "__main__":          
    arr = [1, 2, 3, 4, 5, 0] 
    n =len(arr) 
    findMaxNum(arr,n) 
  
# This code is contributed 
# by ChitraNayal 

