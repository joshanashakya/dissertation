

# Python 3 program to find the factors 
# of large perfect square number 
# in O(sqrt(sqrt(N))) time 
   
import math 
  
MAX = 100000
   
# Function that find all the prime 
# factors of N 
def findFactors( N): 
  
    # Store the sqrt(N) in temp 
    temp = int(math.sqrt(N)) 
   
    # Initialise factor array with 
    # 1 as a factor in it 
    factor = [1]*MAX
    len1 = 1
   
    # Check divisibility by 2 
    while (temp % 2 == 0) : 
   
        # Store the factors twice 
        factor[len1] = 2
        len1 += 1
        factor[len1] = 2
        len1 += 1
        temp //= 2
        
    # Check for other prime 
    # factors other than 2 
    sqt = math.sqrt(temp) 
     
    for j in range(3, math.ceil(sqt), 2): 
   
        # If j is a prime factor 
        while (temp % j == 0): 
   
            # Store the prime 
            # factor twice 
            factor[len1] = j 
            len1 += 1
            factor[len1] = j 
            len1 += 1
            temp //= j 
   
    # If j is prime number left 
    # other than 2 
    if (temp > 2) : 
   
        # Store j twice 
        factor[len1] = temp 
        len1 += 1
        factor[len1] = temp 
        len1 += 1
      
    # Intialise Matrix M to 
    # to store all the factors 
    M = [ [ 0 for x in range(MAX)] for y in range(len1)] 
   
    # tpc for rows 
    # tpr for column 
    tpc , tpr = 0 , 0
   
    # Initialise M[0][0] = 1 as 
    # it also factor of N 
    M[0][0] = 1
    j = 1
   
    # Traversing factor array 
    while (j < len1): 
   
        # If current and previous 
        # factors are not same then 
        # move to next row and 
        # insert the current factor 
        if (factor[j] != factor[j - 1]): 
            tpr+=1
            M[tpr][0] = factor[j] 
            j += 1
            tpc = 1
          
        # If current and previous 
        # factors are same then, 
        # Insert the factor with 
        # previous factor inserted 
        # in matrix M 
        else : 
            M[tpr][tpc]= M[tpr][tpc - 1] * factor[j] 
            j += 1
            tpc += 1
   
    # The arr1[] and arr2[] used to 
    # store all the factors of N 
    arr1 = [0]*MAX
    arr2 = [0]*MAX
    l1 = l2 = 1
   
    # Initialise arrays as 1 
    arr1[0] = 1
    arr2[0] = 1
   
    # Traversing the matrix M 
    # print("tpr ",tpr) 
    for i in range(1 , tpr + 1) : 
   
        # Traversing till column 
        # element doesn't become 0 
        j = 0
        while M[i][j] != 0: 
   
            # Store the product of 
            # every element of current 
            # row with every element 
            # in arr1[] 
            for k in range(l1): 
                arr2[l2]= arr1[k] * M[i][j] 
                l2 += 1
                      
            j += 1
   
        # Copying every element of 
        # arr2[] in arr1[] 
        for j in range(l1, l2): 
            arr1[j] = arr2[j] 
   
        # length of arr2[] and arr1[] 
        # are equal after copying 
        l1 = l2 
          
    # Print all the factors 
    for i in range(l2): 
        print(arr2[i] ,end= " ") 
   
# Drivers Code 
if __name__ == "__main__": 
      
    N = 900
    findFactors(N) 
      
# This code is contributed by chitranayal 

