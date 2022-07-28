

# Python3 program to print all 
# increasing sequences of length 
# 'k' such that the elements in 
# every sequence are from first 
# 'n' natural numbers. 
  
# A utility function to  
# print contents of arr[0..k-1] 
def printArr(arr, k): 
    for i in range(k): 
        print(arr[i], end = " "); 
    print(); 
  
# A recursive function to print  
# all increasing sequences of  
# first n natural numbers. Every  
# sequence should be length k.  
# The array arr[] is used to 
# store current sequence. 
def printSeqUtil(n, k,len1, arr): 
      
    # If length of current  
    # increasing sequence 
    # becomes k, print it 
    if (len1 == k): 
        printArr(arr, k); 
        return; 
  
    # Decide the starting number  
    # to put at current position: 
    # If length is 0, then there  
    # are no previous elements 
    # in arr[]. So start putting  
    # new numbers with 1. If length  
    # is not 0, then start from value  
    # of previous element plus 1. 
    i = 1 if(len1 == 0) else (arr[len1 - 1] + 1); 
  
    # Increase length 
    len1 += 1; 
  
    # Put all numbers (which are greater 
    # than the previous element) at 
    # new position. 
    while (i <= n): 
        arr[len1 - 1] = i; 
        printSeqUtil(n, k, len1, arr); 
        i += 1; 
  
    # This is important. The variable 
    # 'len' is shared among all function 
    # calls in recursion tree. Its value  
    # must be brought back before next 
    # iteration of while loop 
    len1 -= 1; 
  
# This function prints all increasing  
# sequences of first n natural numbers. 
# The length of every sequence must be 
# k. This function mainly uses printSeqUtil() 
def printSeq(n, k): 
        arr = [0] * k; # An array to store 
                       # individual sequences 
        len1 = 0; # Initial length of 
                  # current sequence 
        printSeqUtil(n, k, len1, arr); 
  
# Driver Code 
k = 3;  
n = 7; 
printSeq(n, k); 
  
# This code is contributed by mits 

