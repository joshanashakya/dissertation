

# Python program of above approach 
# We have used number instead of  
# arrays to prevent linear time  
# required to print each string 
def printSeqRecur ( num , n, k ): 
    if n == 0: # if total digits become equal 
                # to n, print the number and return 
        print(num ) 
        return
          
    for _ in range(1, k + 1): 
        printSeqRecur (num * 10 + _, n - 1, k)  
  
# Driver Code 
if __name__ == "__main__": 
    k = 3 # length of k-ary string 
    n = 2 # string can take values 
          # from 1,2,3...n 
    printSeqRecur(0, n, k) 
  
# This code is contributed  
# by shivam purohit 

