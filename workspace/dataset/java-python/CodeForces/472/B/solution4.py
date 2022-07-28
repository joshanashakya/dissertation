import mathn,k = map(int,input().split())p = list(map(int,input().split()))p.sort()p.reverse()ans = 0for i in range(math.ceil(n/k)):    ans += 2*(p[k*i] -1)print(ans)
