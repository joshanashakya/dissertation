# coding: utf-8n = int(input())coords = []graph = {} for i in range(n):  x, y = input().split(" ")  coords.append([int(x), int(y)])  graph[i] = [] for i in range(n):  for j in range(n):    if i != j:      if coords[i][0] == coords[j][0] or coords[i][1] == coords[j][1]:        graph[i].append(j)        graph[j].append(i) visited = n * [0] def visit(current):  visited[current] = 1  for i in graph[current]:    if not visited[i]:      visit(i) count = -1for i in range(n):  if not visited[i]:    visit(i)    count = count + 1 print(count)  					      			 	 	  		 	   		
