h = list(map(int, input().split()))u = list(map(int, input().split()))n = int(input())t = 0# print(h,u,n)for i in range(n):	a,b,c = map(int, input().split())	# print(a*h[0] + b*h[1] + c)	# print(a*u[0] + b*u[1] + c)	# print(a, b, c)	if (a*h[0] + b*h[1] + c) * (a*u[0] + b*u[1] + c) < 0:		t += 1print(t) 					     	   	    	 	 	 	 	
