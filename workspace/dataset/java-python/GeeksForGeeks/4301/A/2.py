

# Python3 program to find sum 
# upto N-th term of the series: 
# -1, 2, 11, 26, 47, 74, ..... 
  
# calculate Nth term of series  
def findSum(N): 
      
    return ((N * (N + 1) * 
           (2 * N - 5) + 4 * N) / 2) 
      
#Driver Function 
if __name__=='__main__': 
      
    #Get the value of N 
    N = 3
  
    #Get the sum of the series 
    print(findSum(N)) 
  
#this code is contributed by Shashank_Sharma 

