en = list(map(int, input().split()))a, b, c, d = en[0], en[1], en[2], en[3] aux = max(c, d) if (2*c >= aux and 2*d >= aux and 2*d < 2*a and 2*d < 2*b):    print(2*a)    print(2*b)    print(aux)else:    print(-1) 	 		  			 		 	 		  	  		 		  	