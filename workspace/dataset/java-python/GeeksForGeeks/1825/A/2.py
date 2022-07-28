

# Python3 program to find N-th term  
# of the series: 
# 3, 5, 21, 51, 95,... 
  
# calculate Nth term of series  
def getNthTerm(N): 
      
    #Return Nth term 
    return (7 * pow(N, 2) - 19 * N + 15) 
      
#Driver code 
if __name__=='__main__': 
      
#declaration of number of terms 
    N = 4
  
#Get the Nth term 
    print(getNthTerm(N)) 
  
#this code is contributed by Shashank_Sharma 

