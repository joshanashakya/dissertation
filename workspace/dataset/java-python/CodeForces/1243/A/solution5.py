k = int(input()) for _ in range(k):     n = int(input())    planks_in = input()    planks = planks_in.split()    planks = list(map(int, planks))    planks.sort()     for i in range(n):        if planks[i] >= (n - i):            print(n - i)            break 		 	 	        	 				  		 		 		