n = int(input())a = []k = [0 for i in range(n)]for i in range(n):    x, y = [int(i) for i in input().split()]    a.append((x,y))count=0queue = []for i in range(n):    if(k[i] == 0):        queue.append(i)        k[i] = 1        count+=1    while queue:        node = queue.pop(0)        for j in range(n):            if k[j]==1: continue            if a[node][0] == a[j][0] or a[node][1] == a[j][1]:                queue.append(j)                k[j] = 1print(count-1)		 	 			 			   		  			 				  		