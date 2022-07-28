k,n,w = map(int,input().split())total = 0for i in range(1,w+1):    total = total + k*iif total>=n:   print(total-n)else:   print(0)
