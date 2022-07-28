

#Python3 program for sum of series 
#0.x, 0.xx, 0.xxx, ... upto k terms 
  
#function which return the sum of series  
def sumOfSeries(x, k): 
      
    return (float(x)/81) * (9 * k - 1 + 10**( (-1)*k ) ) 
      
#Driver code  
if __name__=='__main__': 
    x = 9
    k = 20
    print(sumOfSeries(x, k)) 
# This code is contributed by Shashank Sharma 

