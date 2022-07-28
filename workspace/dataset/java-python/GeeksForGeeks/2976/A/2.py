

# Python 3 program to implement 
# above approach 
  
# Function to find the number 
def findNum(div, rem, N): 
    num = rem[N - 1] 
    i = N - 2
    while(i >= 0): 
        num = num * div[i] + rem[i] 
          
        i -= 1
  
    return num 
  
# Driver Code 
if __name__ == '__main__': 
    div = [8, 3] 
    rem = [2, 2] 
    N = len(div) 
  
    print(findNum(div, rem, N)) 
  
# This code is contributed by 
# Surendra_Gangwar 

