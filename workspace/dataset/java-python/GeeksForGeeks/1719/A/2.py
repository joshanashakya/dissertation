

# Program to find nth 
#centered pentadecagonal number 
  
def center_pentadecagonal_num(n) : 
      
    # Formula to calculate nth 
    # centered pentadecagonal number 
    return (15 * n * n - 15 * n + 2) // 2
  
# Driver Code 
if __name__ == '__main__' : 
          
    n = 3
    print(n,"rd number : ", 
                center_pentadecagonal_num(n)) 
    n = 10
    print(n,"th number : ", 
                 center_pentadecagonal_num(n)) 
                   
  
# This code is contributed  by m_kit 

