

# Program to find nth 
# centered nonadecagonal number 
def center_nonadecagon_num(n) : 
      
    # Formula to calculate  
    # nth centered nonadecagonal  
    # number & return it into  
    # main function. 
      
    return (19 * n * n - 
            19 * n + 2) // 2
  
# Driver Code 
if __name__ == '__main__' : 
          
    n = 2
    print(n,"nd centered nonadecagonal " + 
                              "number : ",  
                center_nonadecagon_num(n)) 
  
    n = 7
    print(n,"nd centered nonadecagonal " + 
                              "number : ",  
                center_nonadecagon_num(n)) 
  
# This code is contributed by ajit 

