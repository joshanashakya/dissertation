n = int(input())a = list(map(int,input().split()))s = 0for i in range(1, n+1):    s+=(a[i-1]-1)*i+1print(s)
