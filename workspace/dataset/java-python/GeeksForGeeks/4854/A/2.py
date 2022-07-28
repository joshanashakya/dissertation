

# Python3 program to find maximum product by breaking  
# the Integer  
    
# method return x^a in log(a) time  
def power(x, a):  
   
    res = 1;  
    while (a): 
        if (a & 1):  
            res = res * x;  
        x = x * x;  
        a >>= 1; 
          
    return res;  
    
# Method returns maximum product obtained by  
# breaking N  
def breakInteger(N): 
    #  base case 2 = 1 + 1  
    if (N == 2):  
        return 1;  
    
    #  base case 3 = 2 + 1  
    if (N == 3):  
        return 2;  
    
    maxProduct=0;  
    
    #  breaking based on mod with 3  
    if(N % 3==0):  
        # If divides evenly, then break into all 3  
        maxProduct = power(3, int(N/3));  
        return maxProduct;  
    elif(N%3==1): 
        # If division gives mod as 1, then break as  
        # 4 + power of 3 for remaining part  
        maxProduct = 2 * 2 * power(3, int(N/3) - 1);  
        return maxProduct; 
    elif(N%3==2): 
        # If division gives mod as 2, then break as  
        # 2 + power of 3 for remaining part 
        maxProduct = 2 * power(3, int(N/3)); 
        return maxProduct; 
       
    
#  Driver code to test above methods  
  
   
maxProduct = breakInteger(10);  
print(maxProduct);  
      
# This code is contributed by mits 

