

# Python3 implementation of the above approach 
  
# Function to print the permutation  
def findPermutation(n) : 
  
    res = [] 
  
    # Initial numbers to be pushed to result  
    en, on = 2, 1
  
    # If n is even  
    if (n % 2 == 0) : 
        for i in range(n) :  
            if (i % 2 == 0) :  
                res.append(en) 
                en += 2 
            else : 
                res.append(on)  
                on += 2 
           
  
    # If n is odd  
    else :  
        for i in range(n-2) : 
            if (i % 2 == 0) :  
                res.append(en)  
                en += 2
            else :  
                res.append(on) 
                on += 2
              
           
        res.append(n) 
        res.append(n - 2)  
       
  
    # Print result  
    for i in range(n) : 
        print(res[i] ,end = " ")      
    print()  
  
  
# Driver Code  
if __name__ == "__main__" : 
   
    n = 9;  
    findPermutation(n)  
  
# This code is contributed by Ryuga 

