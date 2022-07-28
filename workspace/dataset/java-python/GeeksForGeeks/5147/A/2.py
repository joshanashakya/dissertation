

# Python3 program to print  
# the array removing  
# the leading zeros 
  
# Function to print the  
# array by removing  
# leading zeros 
def removeZeros(a, n): 
  
    # index to store the  
    # first non-zero number 
    ind = -1; 
  
    # traverse in the array  
    # and find the first  
    # non-zero number 
    for i in range(n):  
        if (a[i] != 0): 
            ind = i; 
            break; 
  
    # if no non-zero 
    # number is there 
    if (ind == -1): 
        print("Array has leading zeros only"); 
        return; 
  
    # Create an array to store 
    # numbers apart from leading  
    # zeros b[n - ind]; 
    b=[0]*(n - ind); 
  
    # store the numbers 
    # removing leading zeros 
    for i in range(n - ind): 
        b[i] = a[ind + i]; 
  
    # print the array 
    for i in range(n - ind): 
        print( b[i] , end=" "); 
  
# Driver Code 
a = [0, 0, 0, 1, 2, 0, 3]; 
n = len(a); 
removeZeros(a, n); 
  
# This code is contributed by mits 

