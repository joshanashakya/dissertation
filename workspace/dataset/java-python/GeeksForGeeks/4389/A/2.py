

# python 3 program for incrementing 
# and decrementing triangle pattern 
if __name__ == "__main__": 
  
    N1 = 3
    N = 0; 
    r = 5; 
    for i in range( r): 
        if i <= r // 2: 
            N = N1 
            for j in range(i + 1): 
                N += 1
              
            N1 = N 
            for j in range(i + 1): 
                N -= 1
                print(N, end = " ") 
  
            print() 
          
        else : 
            for j in range(i, r): 
                N -= 1
                print(N, end = " ") 
              
            print() 
  
# This code is contributed  
# by ChitraNayal 

