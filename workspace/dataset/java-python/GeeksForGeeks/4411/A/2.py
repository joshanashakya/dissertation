

# Python3 program to find sum 
# upto N-th term of the series: 
# 23, 45, 75, 113... 
  
# calculate Nth term of series  
def findSum(N): 
      
    return (2 * N * (N + 1) * (4 * N + 17) + 54 * N) / 6
      
#Driver Function 
if __name__=='__main__': 
#Get the value of N 
    N = 4
  
#Get the sum of the series 
    print(findSum(N)) 
  
#this code is contributed by Shashank_Sharma 

