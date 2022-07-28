m = int(input())x, z = 5, 0while z < m:    n = x    while n % 5 == 0:        z += 1        n /= 5    x += 5print(f'{5}\n{x-5} {x-4} {x-3} {x-2} {x-1}' if z == m else 0)		 			 					 	  			 		  	
