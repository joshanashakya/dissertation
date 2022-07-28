for kk in range(int(input())):    str = input()    print(':'.join(i.zfill(4)        for i in str.replace('::', ':' * (9 - str.count(':'))).split(':'))) 			  				 	 			 		  	 	 	  				
