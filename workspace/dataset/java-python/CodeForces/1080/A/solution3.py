a, b = map(int, input().split())if a*2 >= b:    if (a*2)%b == 0:        a1 = a*2/b    else:        a1 = (a*2/b) + 1else:    a1 = 1if a*5 >= b:    if a*5%b == 0:        a2 =(a*5/b)    else:      a2 =(a*5/b) +1else:    a2 = 1if a*8 >= b:    if (a*8%b)==0:        a3 = (a*8/b)    else:        a3 = (a*8/b)+1else:    a3 = 1k = int(a1)+int(a2)+int(a3)print('%d' %k) 		 			   	  	  				  		   	 	
