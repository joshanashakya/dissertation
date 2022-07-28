a = int(input())x1 = list(map(int, input().split()))x2 = list(map(int, input().split()))y1 = 0y2 = 0for i in range(a):    y1 |= x1[i]    y2 |= x2[i]print(y1 + y2)    				 	    	 				 	 		   	 	
