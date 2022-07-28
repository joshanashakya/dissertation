from math import gcd def solve(p):    total = 0    for i in range(2, p):        if gcd(i, p) == 1:            total += 1     print(total+1)  n = int(input())solve(n-1) 		  	 	 				 		     		  	 			
