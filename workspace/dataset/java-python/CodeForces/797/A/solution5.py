n, k = map(int, input().split())arr = []stor = []i = 1for j in range(2,n,1):    if n%j==0:        while n%j==0 and i<=k-1:            arr.append(j)            n//=j            i+=1 for l in range(k-1,k):    if n!=1:        arr.append(n)     if len(arr)<k:    print("-1")else:    print(*arr)     	 				   				  		 		 	 		
