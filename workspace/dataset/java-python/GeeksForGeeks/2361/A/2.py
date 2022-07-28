

# Python 3 program to find direction 
# with minimum flips 
  
# finding which path have minimum flip bit  
# and the minimum flip bits 
def minimumFlip(s, x, y): 
      
    # concatenating given string to itself, 
    # to make it circular 
    s = s + s 
      
    # check x is greater than y. 
    # marking if output need to 
    # be opposite. 
    isOpposite = False
    if (x > y): 
        temp = y 
        y = x; 
        x = temp 
        isOpposite = True
  
    # iterate Clockwise 
    valClockwise = 0
    cur = s[x] 
    for i in range(x, y + 1, 1): 
          
        # if current bit is not equal  
        # to next index bit. 
        if (s[i] != cur): 
            cur = s[i] 
            valClockwise += 1
  
    # iterate Anti-Clockwise 
    valAnticlockwise = 0
    cur = s[y] 
    x += len(s) - 1
    for i in range(y, x + 1, 1): 
          
        # if current bit is not equal 
        # to next index bit. 
        if (s[i] != cur): 
            cur = s[i] 
            valAnticlockwise += 1
  
    # Finding whether Clockwise or Anti-clockwise  
    # path take minimum flip. 
    if (valClockwise <= valAnticlockwise): 
        if (isOpposite == False): 
            print("Clockwise", valClockwise) 
        else: 
            print("Anti-clockwise",  
                   valAnticlockwise) 
  
    else: 
        if (isOpposite == False): 
            print("Anti-clockwise",  
                   valAnticlockwise) 
  
        else: 
            print("Clockwise", valClockwise) 
  
# Driver Code 
if __name__ == '__main__': 
    x = 0
    y = 8
    s = "000110"
    minimumFlip(s, x, y) 
      
# This code is contributed by 
# Surendra_Gangwar 

