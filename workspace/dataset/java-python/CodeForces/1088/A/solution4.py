x = int(input()) flag = Falsefor a in range(1, x+1):    for b in range(1, x+1):        if a%b == 0 and a*b > x and a/b < x:            flag = True            break    if flag:        breakif not flag:    print('-1')if flag:    print(a,b)  		  	 	 		 		    	   	 	  			