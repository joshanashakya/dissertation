n = int(input())a = list(map(int, input().split()))b = list(map(int, input().split()))entered, left = [], []j, l, count = 0,0,0for _ in range(n):    left.append(0)for i in range(n):    entered.append(a[i])    while left[entered[j] - 1] == 1:        j = j + 1    if entered[j] == b[i]:        j = j + 1    else:        count = count + 1    left[b[i]-1] = 1print(count) 			 	  	  	  	   	 	  			 	  	