n = int(input()) val = 110x = [0] * valy = [0] * valf = [0] * valcont = 0 def result(i):    f[i] = 1    for j in range(1, n):        if(f[j] != 1 and (x[i] == x[j] or y[i] == y[j])):            result(j)    return for i in range(n):    a, b = map(int, input().split())    x[i] = a    y[i] = b for i in range(n):    if(f[i] != 1):        result(i)        cont += 1 print(cont - 1) 	 	 			 		  	 			 		 				  		
