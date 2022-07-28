n, x, y = map(int, input().split()) print(-1 if n > y or (y-n+1)**2+(n-1) < x else '1\n' * (n-1) + str(y-n+1))   		  					 		 	  		   		 				
