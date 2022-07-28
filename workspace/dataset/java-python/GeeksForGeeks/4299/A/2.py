

# Python 3 Program to  
# draw a hut pattern 
  
# Program to print the Hut 
def hut_pattern(n): 
    if n % 2 == 0: 
        n = n+1
  
    for i in range(0, n - n //3 + 1, 1): 
        for j in range(0, n, 1): 
            t = 2 * n / 5
  
            if t % 2 != 0: 
                t = t- 1
  
            if ((i == n / 5) or (i == n - n / 3) 
               or(j == n - 1 and i >= n / 5) or
               (j >= n / 5 and j < n - n / 5 and i == 0)or
               (j == 0 and i >= n / 5)or (j == t and i > n / 5) or 
               (i <= n / 5 and (i + j == n / 5 or j - i == n / 5))or 
               (j - i == n - n / 5)): 
                print("*",end = " ") 
          
            elif ((i == n // 5 + n // 7) and 
                 (j >= n //7 and j <= t - n // 7)): 
                print("_",end = " ") 
      
            elif ((i >= n // 5 + n // 7) and 
                 (j == n // 7 or j == t - n // 7)): 
                print("|",end = " ") 
  
            else: 
                print(" ",end = " ") 
              
        print("\n"); 
  
# Driver method 
if __name__ == '__main__': 
      
    # Get the width of  
    # the Hut in n 
    n = 15
  
    # Print the Hut 
    hut_pattern(n) 
  
# This code is contributed by 
# Surendra_Gangwar 

