def readToInt():    return [int(n) for n in input().split()] line = readToInt()n, s = line[0], line[1]nums = readToInt()if sum(nums) - max(nums) <= s:    print("YES")else:    print("NO")	 		   	   	  	  			  		 		 	 	