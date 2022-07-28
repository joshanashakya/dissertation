

# Python3 program to calculate ratio  
  
# function to calculate ratio  
# of mth and nth term  
def CalculateRatio(m, n):  
  
    # ratio will be tm/tn = (2*m - 1)/(2*n - 1)  
    return (2 * m - 1) / (2 * n - 1);  
  
# Driver code  
if __name__=='__main__': 
    m = 6; 
    n = 2;  
    print (float(CalculateRatio(m, n)));  
  
# This code is contributed by  
# Shivi_Aggarwal 

