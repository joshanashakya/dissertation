n, k = input().split()n=int(n)k=int(k)seg = 0for i in range(n):  l, r = input().split()  l=int(l)  r=int(r)  seg+=((r - l) + 1)#print(seg)q=(k - (seg % k)) % kprint(q)  			 	 	    	   		 		 			  			
