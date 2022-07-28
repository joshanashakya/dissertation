

# Python3 code for the above algorithm 
  
# function to count for each element in 1st array, 
# elements less than or equal to it in 2nd array 
def countEleLessThanOrEqual(arr1, arr2, m, n): 
      
    # Run two loops to count  
    # First loop to traverse the first array 
    # Second loop to traverse the second array 
    for i in range(m): 
          
        count = 0
        # Traverse through second array 
        for j in range(n): 
            if (arr2[j] <= arr1[i]): 
                count+=1
              
        print(count, end=" ") 
  
# Driver program to test above 
arr1 = [1, 2, 3, 4, 7, 9] 
arr2 = [0, 1, 2, 1, 1, 4] 
m = len(arr1) 
n = len(arr2) 
countEleLessThanOrEqual(arr1, arr2, m, n) 
   
# This code is contributed by shubhamsingh10 

