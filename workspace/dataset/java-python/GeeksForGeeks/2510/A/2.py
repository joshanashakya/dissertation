

# Python3 program to print the  
# sum of the consecutive elements. 
  
# Function to print alternate sum 
def pairwiseSum(lst, n): 
    sum = 0; 
    for i in range(len(lst)-1): 
          
        # adding the alternate numbers 
        sum = lst[i] + lst[i + 1] 
        print (sum, end = " ") 
      
# driver function to test function 
arr =[4, 10, 15, 5, 6] 
size = len(arr) 
pairwiseSum(arr, size) 

