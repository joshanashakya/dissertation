

# python 3 program to print incrementing  
# and decrementing triangle pattern 
if __name__ == "__main__": 
  
    N = 3 # initializing N 
    N -= 1
    r = 5
    for i in range( r): 
        if i <= r // 2: 
            count = N + 1
            for j in range(i + 1): 
                N += 1
                print(str(N), end = " ") 
              
            print() 
          
        else : 
            N = count - (r - i) 
            count = N 
            for j in range(i, r): 
                print(str(N), end = " ") 
                N += 1
              
            print() 
  
# This code is contributed 
# by ChitraNayal 

