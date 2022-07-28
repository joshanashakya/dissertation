

# Python3 program to print maximum product  
# such that its previous and next  
# element product is maximum.  
  
# function to return largest element  
# such that its previous and next  
# element product is maximum.  
def maxProduct(a, n) :  
  
    product = [0]*n;  
    maxA = [0]*n;  
    maxProd = 0;  
    maxArr = 0;  
  
    for i in range(n) : 
          
        # product of previous and next  
        # element and stored into an  
        # array product[i]  
        product[i] = a[(i + 1) % n] * a[(i + (n - 1)) % n];  
      
        # find maximum product  
        # in product[i] array  
        if (maxProd < product[i]) : 
            maxProd = product[i];  
              
    return maxProd;  
  
  
# Driver code 
if __name__ == "__main__" :  
      
    a = [ 5, 6, 4, 3, 2 ];  
    n = len(a); 
      
    print(maxProduct(a, n));  
      
# This code is contributed by AnkitRai01 

