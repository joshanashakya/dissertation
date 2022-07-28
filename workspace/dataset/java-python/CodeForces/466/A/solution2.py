import mathn,m,a,b = list(map(int,input().split()))res = 100000000for i in range(n+1):    res = min(res,(a*i + math.ceil((n-i)/m)*b))print(res)
