A,B,C,N = map(int,input().strip().split()) flag = Trueif C>A or C>B:    flag = FalseD = N - (A - C) - Bif D >= 1 and flag:    print(D)else:    print(-1) 						    	   	 		 	  	  	   	
