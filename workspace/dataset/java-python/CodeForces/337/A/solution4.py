n, m = map(int, input().split())p = list(map(int, input().split()))p.sort()j = 0ml = []while j < m-n+1:    temp = p[n-1+j]-p[j]    ml.append(temp)    j += 1print(min(ml))
