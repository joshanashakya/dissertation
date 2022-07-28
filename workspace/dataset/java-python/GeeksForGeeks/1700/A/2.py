

# Python3 program to Print all combinations  
# of points that can compose a given number 
MAX_POINT = 3; 
ARR_SIZE = 100; 
  
arr = [0] * ARR_SIZE; 
  
# The function prints all combinations 
# of numbers 1, 2, ...MAX_POINT that sum  
# up to n. i is used in recursion keep  
# track of index in arr[] where next 
# element is to be added. Initital value 
# of i must be passed as 0  
def printCompositions(n, i): 
      
    # array must be static as we  
    # want to keep track of values  
    # stored in arr[] using current  
    # calls of printCompositions() in 
    # function call stack*/ 
    if (n == 0): 
        printArray(arr, i); 
    elif(n > 0): 
        for k in range(1,MAX_POINT + 1): 
            arr[i] = k; 
            printCompositions(n - k, i + 1); 
  
# UTILITY FUNCTIONS */ 
# Utility function to print array arr[] */ 
def printArray(arr, arr_size): 
    for i in range(arr_size): 
        print(arr[i], end = " "); 
    print(); 
  
# Driver Code 
n = 5; 
print("Different compositions formed " + 
         "by 1, 2 and 3 of", n, " are"); 
printCompositions(n, 0); 
  
# This code is contributed by mits  

