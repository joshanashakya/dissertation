((x,y,r,R), (u,v,w,W))=[map(int, input().split()) for _ in range(2)]d = (x-u) ** 2 + (y - v) ** 2 def t(a,b,c):    if c <= a and (a-c)**2 >= d:        return 1    if c >= b and (c-b)**2 >= d:        return 1    if (b+c) ** 2 <= d:        return 1    return 0print(t(r,R,w) + t(r,R,W) + t(w,W,r) + t(w,W,R))   		 	 	  	  			 		  	  		
